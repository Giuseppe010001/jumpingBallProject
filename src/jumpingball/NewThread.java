/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jumpingball;

import java.io.File; // Importare la classe File
import java.io.IOException; // Importare la classe IOException
import java.util.logging.Level; // Importare la classe Level
import java.util.logging.Logger; // Importare la classe Logger
import javax.sound.sampled.AudioFormat; // Importare la classe AudioFormat
import javax.sound.sampled.AudioInputStream; // Importare la classe AudioInputStream
import javax.sound.sampled.AudioSystem; // Importare la classe AudioSystem
import javax.sound.sampled.Clip; // Importare la classe Clip
import javax.sound.sampled.LineUnavailableException; // Importare la classe LineUnavailableException
import java.util.Random; // Importare la classe Random
import javax.sound.sampled.UnsupportedAudioFileException; // Importare la classe UnsupportedAudioFileException

/**
 *
 * @author 39327
 */
public class NewThread extends Thread {
    
    // Dichiarazione attributi
    private MainFrame frameP;
    
    // Metodi costruttori
    public NewThread() {
        super();
    }
    public NewThread(MainFrame frameP) {
        this.frameP = frameP;
    }
    
    // Altri metodi
    @Override
    public void run() {
        switch (this.getName()) {
            case "musica" -> {
                
                // Dichiarazione degli oggetti srcCanzone, formatoMusica, formatoSconfitta, canzone e genRand appartenenti rispettivamente alle classi AudioInputStream, AudioFormat, Clip e Random e implementazione di srcCanzone e genRand
                AudioInputStream srcCanzone = null;
                AudioFormat formatoMusica;
                Clip canzone = null;
                Random genRand = new Random();
                
                // Dichiarazione variabili
                long durataCanzone, controlloCanzone;
                
                while (frameP.getNVite() > 0) {
                    try {

                        // Assegnazione di un file audio a srcCanzone scelto in modo randomico tra 12 file preimpostati
                        switch (genRand.nextInt(12)) {
                            case 0 -> srcCanzone = AudioSystem.getAudioInputStream(new File("Baby Gang – Casablanca (feat. Morad ) [Official Video].wav"));
                            case 1 -> srcCanzone = AudioSystem.getAudioInputStream(new File("Baby Gang - Que Lo Ke [Official Lyric Video].wav"));
                            case 2 -> srcCanzone = AudioSystem.getAudioInputStream(new File("Fred De Palma feat. Ana Mena – D'estate non vale (feat. Ana Mena).wav"));
                            case 3 -> srcCanzone = AudioSystem.getAudioInputStream(new File("Giuni Russo – Unestate al mare.wav"));
                            case 4 -> srcCanzone = AudioSystem.getAudioInputStream(new File("Il Pagante - @NewMusicItaly – Portofino - @NewMusicItaly.wav"));
                            case 5 -> srcCanzone = AudioSystem.getAudioInputStream(new File("Kaoma – Lambada.wav"));
                            case 6 -> srcCanzone = AudioSystem.getAudioInputStream(new File("Bizarrap & Quevedo – Quevedo_ Bzrp Music Sessions, Vol. 52.wav"));
                            case 7 -> srcCanzone = AudioSystem.getAudioInputStream(new File("Cappella U Got 2 Let The Music.wav"));
                            case 8 -> srcCanzone = AudioSystem.getAudioInputStream(new File("Enrique Iglesias - Bailando ft. Descemer Bueno, Gente De Zona (Letra).wav"));
                            case 9 -> srcCanzone = AudioSystem.getAudioInputStream(new File("GIGI DAGOSTINO - LAMOUR TOUJOURS (ORIGINAL VERSION).wav"));
                            case 10 -> srcCanzone = AudioSystem.getAudioInputStream(new File("MORAD, ELGRANDETOTO - OJOS SIN VER [LYRIC VIDEO]  REINSERTADO.wav"));
                            case 11 -> srcCanzone = AudioSystem.getAudioInputStream(new File("Gigi D'Alessio – Mon amour.wav"));
                        }

                        try {

                            // Ottenimento del canale da utilizzare per l'esecuzione del file audio aperto
                            canzone = AudioSystem.getClip();
                            // Apertura del file assegnato a srcCanzone
                            canzone.open(srcCanzone);
                            // Inizio dell'esecuzione di tale file
                            canzone.start();
                            // Esecuzione di tale file fino alla sua terminazione
                            canzone.drain();

                            // Calcolare la durata di ascolto della canzone riprodotta in millisecondi
                            formatoMusica = srcCanzone.getFormat();
                            durataCanzone = (long) (canzone.getFrameLength() / formatoMusica.getFrameRate() * 1000);
                            controlloCanzone = 0;
                            
                            // Mettere in pausa il thread per un tempo pari a quello della canzone riprodotta
                            while (frameP.getNVite() > 0 && controlloCanzone < durataCanzone){
                                try {
                                    controlloCanzone += durataCanzone / 10000;
                                    sleep(durataCanzone / 10000);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }

                            // Eccezione nel caso di errori nell'esecuzione di sleep
                        } catch (LineUnavailableException ex) {
                            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    // Eccezione nel caso di mancato supporto di un determinato formato audio o nel caso di errore nello scambio di dati dal e al file audio utilizzato
                    } catch (UnsupportedAudioFileException | IOException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        try {

                            // Chiusura del file utilizzato
                            srcCanzone.close();

                        // Eccezione nel caso di errore nello scambio di dati dal e al file audio utilizzato
                        } catch (IOException ex) {
                            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                
                canzone.stop();
            } case "incrementoPunti" -> {
                
                while (frameP.getNVite() > 0) {
                    
                    // Mostrare graficamente il punteggio in tempo reale
                    frameP.getPunteggio().setText("Punti: " + (frameP.getNPunti()));

                    // Incrementare il numero di vite ad intervalli di 2000 punti
                    if (frameP.getNPunti() != 0 && frameP.getNPunti() % 2000 == 0) {

                        // Fare in modo che al prossimo richiamo di run venga eseguito un altro blocco di codice dello switch
                        this.setName("incrementoVita");
                        // Incrementare il numero di punti
                        frameP.incrementoNPunti();
                        run();
                    } else {
                        try {

                            // Mettere in pausa il thread per un tempo pari a un secondo
                            sleep(1000);
                            // Incrementare il numero di punti
                            frameP.incrementoNPunti();

                        // Eccezione nel caso di errori nell'esecuzione di sleep   
                        } catch (InterruptedException ex) {
                            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }    
            } case "incrementoVita" -> {
                
                // Dichiarazione degli oggetti srcIncremento, formatoIncremento, e incremento appartenenti rispettivamente alle classi AudioInputStream, AudioFormat, e Clip e implementazione di srcIncremento
                AudioInputStream srcIncremento = null;
                AudioFormat formatoIncremento;
                Clip incremento;
                
                // Dichiarazione variabili
                long durataIncremento;
                
                // Incrementare il numero di vite
                frameP.incrementoNVite();
                frameP.getVite().setText("Vite: " + (frameP.getNVite()));
                frameP.getPallina().setIcon((new javax.swing.ImageIcon(getClass().getResource("/jumpingball/vita+1.png"))));
                
                try {
                    
                    // Assegnazione del file audio "incrementoVita.wav" a srcIncremento
                    srcIncremento = AudioSystem.getAudioInputStream(new File("incrementoVita.wav"));
                    
                    try {
                        
                        // Ottenimento del canale da utilizzare per l'esecuzione del file audio aperto
                        incremento = AudioSystem.getClip();
                        // Apertura del file assegnato a srcIncremento
                        incremento.open(srcIncremento);
                        // Inizio dell'esecuzione di tale file
                        incremento.start();
                        // Esecuzione di tale file fino alla sua terminazione
                        incremento.drain();
                        
                        try {
                            
                            // Calcolare la durata di ascolto del file riprodotto in millisecondi
                            formatoIncremento = srcIncremento.getFormat();
                            durataIncremento = (long) (incremento.getFrameLength() / formatoIncremento.getFrameRate() * 1000);
                            
                            // Mettere in pausa il thread per un tempo pari a quello del file audio riprodotto
                            sleep(durataIncremento);
                            
                        // Eccezione nel caso di errori nell'esecuzione di sleep
                        } catch (InterruptedException ex) {
                            Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    // Eccezione nel caso di assenza del file audio indicato
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                // Eccezione nel caso di mancato supporto di un determinato formato audio o nel caso di errore nello scambio di dati dal e al file audio utilizzato
                } catch (UnsupportedAudioFileException | IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        
                        // Chiusura del file utilizzato
                        srcIncremento.close();
                        
                    // Eccezione nel caso di errore nello scambio di dati dal e al file audio utilizzato
                    } catch (IOException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                frameP.getPallina().setIcon((new javax.swing.ImageIcon(getClass().getResource("/jumpingball/pallina.png"))));
                
                if (frameP.getVelocita() > 5)
                    frameP.decrementoVelocita();
                
                this.setName("incrementoPunti");
                
                run();
            } case "conflitto" -> {
                while (frameP.getNVite() > 0) {
                    
                    if ((frameP.getGranchio().getX() >= frameP.getPallina().getX() - 32 && frameP.getGranchio().getX() <= frameP.getPallina().getX() + 32 && frameP.getGranchio().getY() == frameP.getYPallina()) || 
                        (frameP.getGabbiano().getX() >= frameP.getPallina().getX() - 32 && frameP.getGabbiano().getX() <= frameP.getPallina().getX() + 32 && frameP.getGabbiano().getY() == frameP.getYPallina())) {
                        this.setName("decrementoVita");
                        run();
                    } else {
                        try {
                            sleep(frameP.getVelocita());
                        } catch (InterruptedException ex) {
                            Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }    
                }
            } case "decrementoVita" -> {
                
                // Dichiarazione degli oggetti srcDecremento, formatoDecremento, e decremento appartenenti rispettivamente alle classi AudioInputStream, AudioFormat, e Clip e implementazione di srcDecremento
                AudioInputStream srcDecremento = null, srcSconfitta = null;
                AudioFormat formatoDecremento, formatoSconfitta;
                Clip decremento, sconfitta;
                
                // Dichiarazione variabili
                long durataDecremento, durataSconfitta;
                
                // Decrementare il numero di vite
                frameP.decrementoNVite();
                frameP.getVite().setText("Vite: " + (frameP.getNVite()));
                
                if (frameP.getNVite() == 0) {
                    frameP.getPallina().setVisible(false);
                    frameP.getGranchio().setVisible(false);
                    frameP.getGabbiano().setVisible(false);
                    // Settare inizialmente come invisibili tutti i tool riguardanti l'inserimento del nome del giocatore
                    frameP.getEtichettaInserimento().setVisible(true);
                    frameP.getNomeGiocatore().setVisible(true);
                    // framePrincipale.getConfirm().setVisible(true);
                    frameP.getConfirm().setVisible(true);
                    try {

                        // Assegnazione del file audio "Partenza.wav" a srcSalto
                        srcSconfitta = AudioSystem.getAudioInputStream(new File("sconfitta.wav"));

                        try {

                            // Ottenimento del canale da utilizzare per l'esecuzione del file audio aperto
                            sconfitta = AudioSystem.getClip();
                            // Apertura del file assegnato a srcPartenza
                            sconfitta.open(srcSconfitta);
                            // Inizio dell'esecuzione di tale file
                            sconfitta.start();
                            // Esecuzione di tale file fino alla sua terminazione
                            sconfitta.drain();

                            try {

                                // Calcolare la durata di ascolto del file riprodotto in millisecondi
                                formatoSconfitta = srcSconfitta.getFormat();
                                durataSconfitta = (long) (sconfitta.getFrameLength() / formatoSconfitta.getFrameRate() * 1000);

                                // Mettere in pausa il thread per un tempo pari a quello del file audio riprodotto
                                sleep(durataSconfitta);


                            // Eccezione nel caso di errori nell'esecuzione di sleep
                            } catch (InterruptedException ex) {
                                Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        // Eccezione nel caso di assenza del file audio indicato
                        } catch (LineUnavailableException ex) {
                            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    // Eccezione nel caso di mancato supporto di un determinato formato audio o nel caso di errore nello scambio di dati dal e al file audio utilizzato
                    } catch (UnsupportedAudioFileException | IOException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        try {

                            // Chiusura del file utilizzato
                            srcSconfitta.close();

                        // Eccezione nel caso di errore nello scambio di dati dal e al file audio utilizzato
                        } catch (IOException ex) {
                            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else {
                    frameP.getPallina().setIcon((new javax.swing.ImageIcon(getClass().getResource("/jumpingball/vita-1.png"))));
                    
                    try {
                    
                        // Assegnazione del file audio "decrementoVita.wav" a srcDecremento
                        srcDecremento = AudioSystem.getAudioInputStream(new File("decrementoVita.wav"));

                        try {

                            // Ottenimento del canale da utilizzare per l'esecuzione del file audio aperto
                            decremento = AudioSystem.getClip();
                            // Apertura del file assegnato a srcDecremento
                            decremento.open(srcDecremento);
                            // Inizio dell'esecuzione di tale file
                            decremento.start();
                            // Esecuzione di tale file fino alla sua terminazione
                            decremento.drain();

                            try {

                                // Calcolare la durata di ascolto del file riprodotto in millisecondi
                                formatoDecremento = srcDecremento.getFormat();
                                durataDecremento = (long) (decremento.getFrameLength() / formatoDecremento.getFrameRate() * 1000);

                                // Mettere in pausa il thread per un tempo pari a quello del file audio riprodotto
                                sleep(durataDecremento);

                            // Eccezione nel caso di errori nell'esecuzione di sleep
                            } catch (InterruptedException ex) {
                                Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        // Eccezione nel caso di assenza del file audio indicato
                        } catch (LineUnavailableException ex) {
                            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    // Eccezione nel caso di mancato supporto di un determinato formato audio o nel caso di errore nello scambio di dati dal e al file audio utilizzato
                    } catch (UnsupportedAudioFileException | IOException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        try {

                            // Chiusura del file utilizzato
                            srcDecremento.close();

                        // Eccezione nel caso di errore nello scambio di dati dal e al file audio utilizzato
                        } catch (IOException ex) {
                            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                    frameP.getPallina().setIcon((new javax.swing.ImageIcon(getClass().getResource("/jumpingball/pallina.png"))));
                }
            } case "pallina" -> {
                int G = 4;
                
                while (frameP.getYPallina() >= 216) {
                    try {
                        sleep(frameP.getVelocita());
                    } catch (InterruptedException ex) {
                        Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    frameP.getPallina().setLocation(frameP.getPallina().getX(), frameP.getYPallina());
                    
                    if ((280 - frameP.getYPallina()) % 16 == 0)
                        G--;
                    
                    frameP.decrementoYPallina(G);
                }
                
                G = 1;
                
                while (frameP.getYPallina() <= 280) {
                    try {
                        sleep(frameP.getVelocita());
                    } catch (InterruptedException ex) {
                        Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                   frameP.getPallina().setLocation(frameP.getPallina().getX(), frameP.getYPallina());
                   
                   if ((frameP.getYPallina() - 216) % 16 == 0)
                        G++;
                   
                   frameP.incrementoYPallina(G);
                }
                
                frameP.decrementoYPallina(G);                
            } case "salto" -> {
                
                // Dichiarazione degli oggetti srcSalto, formato, e salto appartenenti rispettivamente alle classi AudioInputStream, AudioFormat, e Clip e implementazione di srcSalto
                AudioInputStream srcSalto = null;
                AudioFormat formatoSalto;
                Clip salto;
                
                // Dichiarazione variabili
                long durataSalto;
                
                try {
                    
                    // Assegnazione del file audio "salto.wav" a srcSalto
                    srcSalto = AudioSystem.getAudioInputStream(new File("salto.wav"));
                    
                    try {
                        
                        // Ottenimento del canale da utilizzare per l'esecuzione del file audio aperto
                        salto = AudioSystem.getClip();
                        // Apertura del file assegnato a srcSalto
                        salto.open(srcSalto);
                        // Inizio dell'esecuzione di tale file
                        salto.start();
                        // Esecuzione di tale file fino alla sua terminazione
                        salto.drain();
                        
                        try {
                            
                            // Calcolare la durata di ascolto del file riprodotto in millisecondi
                            formatoSalto = srcSalto.getFormat();
                            durataSalto = (long) (salto.getFrameLength() / formatoSalto.getFrameRate() * 1000);
                            
                            // Mettere in pausa il thread per un tempo pari a quello del file audio riprodotto
                            sleep(durataSalto);
                            
                        // Eccezione nel caso di errori nell'esecuzione di sleep
                        } catch (InterruptedException ex) {
                            Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    // Eccezione nel caso di assenza del file audio indicato
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                // Eccezione nel caso di mancato supporto di un determinato formato audio o nel caso di errore nello scambio di dati dal e al file audio utilizzato
                } catch (UnsupportedAudioFileException | IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        
                        // Chiusura del file utilizzato
                        srcSalto.close();
                        
                    // Eccezione nel caso di errore nello scambio di dati dal e al file audio utilizzato
                    } catch (IOException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } case "granchio" -> {
                Random genRand = new Random();
                
                switch (genRand.nextInt(2)) {
                    case 0 -> {
                        while (frameP.getNVite() > 0) {
                            if (frameP.getXOstacoli() >= 600) {
                                switch (genRand.nextInt(2)) {
                                    case 0 -> {
                                        frameP.ripristinoXOstacoliAvanti();
                                        frameP.getGranchio().setLocation(frameP.getXOstacoli(), frameP.getGranchio().getY());
                                    } case 1 -> {
                                        this.setName("gabbiano");
                                        run();
                                    }
                                }
                            }
                            
                            frameP.incrementoXOstacoli();

                            frameP.getGranchio().setLocation(frameP.getXOstacoli(), frameP.getGranchio().getY());
                            
                            try {
                                sleep(frameP.getVelocita());
                            } catch (InterruptedException ex) {
                                Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    } case 1 -> {
                        while (frameP.getNVite() > 0) {
                            if (frameP.getXOstacoli() <= -64) {
                                switch (genRand.nextInt(2)) {
                                    case 0 -> {
                                        frameP.ripristinoXOstacoliIndietro();
                                        frameP.getGranchio().setLocation(frameP.getXOstacoli(), frameP.getGranchio().getY());
                                    } case 1 -> {
                                        this.setName("gabbiano");
                                        run();
                                    }
                                }
                            }
                            
                            frameP.decrementoXOstacoli();

                            frameP.getGranchio().setLocation(frameP.getXOstacoli(), frameP.getGranchio().getY());
                            
                            try {
                                sleep(frameP.getVelocita());
                            } catch (InterruptedException ex) {
                                Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                }
            } case "gabbiano" -> {
                Random genRand = new Random();
                
                switch (genRand.nextInt(2)) {
                    case 0 -> {
                        while (frameP.getNVite() > 0) {
                            frameP.getGabbiano().setIcon((new javax.swing.ImageIcon(getClass().getResource("/jumpingball/gabbianoDestra.gif"))));
                            if (frameP.getXOstacoli() >= 600) {
                                switch (genRand.nextInt(2)) {
                                    case 0 -> {
                                        frameP.ripristinoXOstacoliAvanti();
                                        frameP.getGabbiano().setLocation(frameP.getXOstacoli(), frameP.getGabbiano().getY());
                                    } case 1 -> {
                                        this.setName("granchio");
                                        run();
                                    }
                                }
                            }
                            
                            frameP.incrementoXOstacoli();

                            frameP.getGabbiano().setLocation(frameP.getXOstacoli(), frameP.getGabbiano().getY());

                            try {
                                sleep(frameP.getVelocita());
                            } catch (InterruptedException ex) {
                                Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }    
                    } case 1 -> {
                        while (frameP.getNVite() > 0) {
                            frameP.getGabbiano().setIcon((new javax.swing.ImageIcon(getClass().getResource("/jumpingball/gabbianoSinistra.gif"))));
                            if (frameP.getXOstacoli() <= -98) {
                                switch (genRand.nextInt(2)) {
                                    case 0 -> {
                                        frameP.ripristinoXOstacoliIndietro();
                                        frameP.getGabbiano().setLocation(frameP.getXOstacoli(), frameP.getGabbiano().getY());
                                    } case 1 -> {
                                        this.setName("granchio");
                                        run();
                                    }
                                }
                            }
                            
                            frameP.decrementoXOstacoli();

                            frameP.getGabbiano().setLocation(frameP.getXOstacoli(), frameP.getGabbiano().getY());

                            try {
                                sleep(frameP.getVelocita());
                            } catch (InterruptedException ex) {
                                Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }    
                    }
                }
            } case "click" -> {
                
                // Dichiarazione degli oggetti srcClick, formatoClick, e click appartenenti rispettivamente alle classi AudioInputStream, AudioFormat, e Clip e implementazione di srcSalto
                AudioInputStream srcClick = null;
                AudioFormat formatoClick;
                Clip click;
                
                // Dichiarazione variabili
                long durataClick;
                
                try {
                    
                    // Assegnazione del file audio "click.wav" a srcClick
                    srcClick = AudioSystem.getAudioInputStream(new File("click.wav"));
                    
                    try {
                        
                        // Ottenimento del canale da utilizzare per l'esecuzione del file audio aperto
                        click = AudioSystem.getClip();
                        // Apertura del file assegnato a srcClick
                        click.open(srcClick);
                        // Inizio dell'esecuzione di tale file
                        click.start();
                        // Esecuzione di tale file fino alla sua terminazione
                        click.drain();
                        
                        try {
                            
                            // Calcolare la durata di ascolto del file riprodotto in millisecondi
                            formatoClick = srcClick.getFormat();
                            durataClick = (long) (click.getFrameLength() / formatoClick.getFrameRate() * 1000);
                            
                            // Mettere in pausa il thread per un tempo pari a quello del file audio riprodotto
                            sleep(durataClick);
                            
                        // Eccezione nel caso di errori nell'esecuzione di sleep
                        } catch (InterruptedException ex) {
                            Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    // Eccezione nel caso di assenza del file audio indicato
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                // Eccezione nel caso di mancato supporto di un determinato formato audio o nel caso di errore nello scambio di dati dal e al file audio utilizzato
                } catch (UnsupportedAudioFileException | IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        
                        // Chiusura del file utilizzato
                        srcClick.close();
                        
                    // Eccezione nel caso di errore nello scambio di dati dal e al file audio utilizzato
                    } catch (IOException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
}
