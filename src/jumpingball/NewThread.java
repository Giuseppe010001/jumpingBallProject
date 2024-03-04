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
    
    private MainFrame frameP;
    
    public NewThread() {
        super();
    }
    public NewThread(MainFrame frameP) {
        super();
        this.frameP = frameP;
    }
    
    @Override
    public void run() {
        switch (this.getName()) {
            case "inizio" -> {
                
                // Dichiarazione degli oggetti srcInizio, formatoInizio, e inizio appartenenti rispettivamente alle classi AudioInputStream, AudioFormat, e Clip e implementazione di srcInizio
                AudioInputStream srcInizio = null;
                AudioFormat formatoInizio;
                Clip inizio;

                // Dichiarazione variabili
                long durataInizio;

                try {

                    // Assegnazione del file audio "inizio.wav" a srcInizio
                    srcInizio = AudioSystem.getAudioInputStream(new File("inizio.wav"));

                    try {

                        // Ottenimento del canale da utilizzare per l'esecuzione del file audio aperto
                        inizio = AudioSystem.getClip();
                        // Apertura del file assegnato a srcInizio
                        inizio.open(srcInizio);
                        // Inizio dell'esecuzione di tale file
                        inizio.start();
                        // Esecuzione di tale file fino alla sua terminazione
                        inizio.drain();

                        try {

                            // Calcolare la durata di ascolto del file riprodotto in millisecondi
                            formatoInizio = srcInizio.getFormat();
                            durataInizio = (long) (inizio.getFrameLength() / formatoInizio.getFrameRate() * 1000);

                            // Mettere in pausa il thread per un tempo pari a quello del file audio riprodotto
                            sleep(durataInizio);

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
                        srcInizio.close();

                    // Eccezione nel caso di errore nello scambio di dati dal e al file audio utilizzato
                    } catch (IOException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } case "musica" -> {
                
                // Dichiarazione degli oggetti srcCanzone, formatoMusica, canzone e genRand appartenenti rispettivamente alle classi AudioInputStream, AudioFormat, Clip e Random e implementazione di srcCanzone e genRand
                AudioInputStream srcCanzone = null;
                AudioFormat formatoMusica;
                Clip canzone;
                Random genRand = new Random();
                
                // Dichiarazione variabili
                long durataCanzone;
                
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
                        
                        try {
                            
                            // Calcolare la durata di ascolto della canzone riprodotta in millisecondi
                            formatoMusica = srcCanzone.getFormat();
                            durataCanzone = (long) (canzone.getFrameLength() / formatoMusica.getFrameRate() * 1000);
                            
                            // Mettere in pausa il thread per un tempo pari a quello della canzone riprodotta
                            sleep(durataCanzone);
                            
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
                        srcCanzone.close();
                        
                    // Eccezione nel caso di errore nello scambio di dati dal e al file audio utilizzato
                    } catch (IOException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                // Esecuzione ricorsiva del metodo run
                run();
            } case "incrementoPunti" -> {
                
                // Mostrare graficamente il punteggio in tempo reale
                frameP.getPunteggio().setText("Punti: " + (frameP.getNPunti()));
                
                // Incrementare il numero di vite ad intervalli di 2000 punti
                if (frameP.getNPunti() != 0 && frameP.getNPunti() % 200 == 0) {
                    
                    // Incrementare il numero di vite
                    frameP.incrementoNVite();
                    frameP.getVite().setText("Vite: " + (frameP.getNVite()));
                    
                    // Fare in modo che al prossimo richiamo di run venga eseguito un altro blocco di codice dello switch
                    this.setName("incrementoVita");
                } else {
                    try {
                        
                        // Mettere in pausa il thread per un tempo pari a un secondo
                        sleep(1000);
                        
                    // Eccezione nel caso di errori nell'esecuzione di sleep   
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                // Incrementare il numero di punti
                frameP.incrementoNPunti();
                
                // Esecuzione ricorsiva del metodo run
                run();
            } case "incrementoVita" -> {
                
                // Dichiarazione degli oggetti srcIncremento, formatoIncremento, e incremento appartenenti rispettivamente alle classi AudioInputStream, AudioFormat, e Clip e implementazione di srcIncremento
                AudioInputStream srcIncremento = null;
                AudioFormat formatoIncremento;
                Clip incremento;
                
                // Dichiarazione variabili
                long durataIncremento;
                
                try {
                    
                    // Assegnazione del file audio "incrementoVita.wav" a srcIncremento
                    srcIncremento = AudioSystem.getAudioInputStream(new File("incrementoVita.wav"));
                    
                    try {
                        
                        // Ottenimento del canale da utilizzare per l'esecuzione del file audio aperto
                        incremento = AudioSystem.getClip();
                        // Apertura del file assegnato a srcSalto
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
                
                if (frameP.getVelocitaMovimento() > 5)
                    frameP.decrementoVelocitaMovimento();
                
                this.setName("incrementoPunti");
                
                run();
            } case "pallina" -> {
                int G = 4;
                
                while (frameP.getYPallina() >= 216) {
                    try {
                        sleep(frameP.getVelocitaMovimento());
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
                        sleep(frameP.getVelocitaMovimento());
                    } catch (InterruptedException ex) {
                        Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                   frameP.getPallina().setLocation(frameP.getPallina().getX(), frameP.getYPallina());
                   
                   if ((frameP.getYPallina() - 216) % 16 == 0)
                        G++;
                   
                   frameP.incrementoYPallina(G);
                }    
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
                        while (true) {
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
                                sleep(frameP.getVelocitaMovimento());
                            } catch (InterruptedException ex) {
                                Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    } case 1 -> {
                        while (true) {
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
                                sleep(frameP.getVelocitaMovimento());
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
                        while (true) {
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
                                sleep(frameP.getVelocitaMovimento());
                            } catch (InterruptedException ex) {
                                Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }    
                    } case 1 -> {
                        while (true) {
                            if (frameP.getXOstacoli() <= -64) {
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
                                sleep(frameP.getVelocitaMovimento());
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
