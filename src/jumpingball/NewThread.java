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
    private StartFrame frameS;
    private MainFrame frameP;
    
    // Metodi costruttori
    public NewThread() {
        super();
    }
    public NewThread(StartFrame frameS) {
        super();
        this.frameS = frameS;
    }
    public NewThread(MainFrame frameP) {
        super();
        this.frameP = frameP;
    }
    
    // Altri metodi
    // Per eseguire un thread
    @Override
    public void run() {
        switch (this.getName()) {
            case "partenza" -> {

                /* 
                Dichiarazione (e implementazione) degli oggetti framePrincipale,
                threadClick, threadMusica, threadPunti, threadConflitto, threadOstacoli,
                srcPartenza1, srcPartenza2, srcPartenza3, srcPartenza4,
                formatoPartenza1, formatoPartenza2, formatoPartenza3, formatoPartenza4,
                partenza1, partenza2, partenza3, partenza4 e
                genRand
                */
                MainFrame framePrincipale = new MainFrame();
                NewThread threadClick, threadMusica, threadPunti, threadConflitto, threadOstacoli;
                AudioInputStream srcPartenza1 = null, srcPartenza2 = null, srcPartenza3 = null, srcPartenza4 = null;
                AudioFormat formatoPartenza1 = null, formatoPartenza2 = null, formatoPartenza3 = null, formatoPartenza4 = null;
                Clip partenza1 = null, partenza2 = null, partenza3 = null, partenza4 = null;
                Random genRand = new Random();

                // Dichiarazione variabili
                long durataPartenza1 = 0, durataPartenza2 = 0, durataPartenza3 = 0, durataPartenza4 = 0;

                // Avviare un file audio per segnalare il click del pulsante help
                // Inizializzazione di threadClick
                threadClick = new NewThread();
                // Risettaggio del nome di threadClick
                threadClick.setName("click");
                threadClick.start();
                // Attendere la fine dell'esecuzione di threadClick
                try {
                    threadClick.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                }

                // Settare come invisibili tutti i tool riguardanti la classsifica
                frameS.getEtichettaGiocatori().setVisible(false);
                frameS.getEtichettaPunteggi().setVisible(false);
                frameS.getAreaClassifica().setVisible(false);
                frameS.getClassifica().setVisible(false);

                // Disabilitare tutti i pulsanti del frame
                frameS.getStart().setEnabled(false);
                frameS.getHelp().setEnabled(false);
                frameS.getReset().setEnabled(false);

                // Avviare 3 file audio di introduzione al gioco
                // Settare "3..." in etichettaPartenza
                frameS.getEtichettaPartenza().setText("3...");
                riproduzioneAudio(srcPartenza1, formatoPartenza1, partenza1, durataPartenza1, "3.wav");
                // Settare "2..." in etichettaPartenza
                frameS.getEtichettaPartenza().setText("2...");
                riproduzioneAudio(srcPartenza2, formatoPartenza2, partenza2, durataPartenza2, "2.wav");
                // Settare "1..." in etichettaPartenza
                frameS.getEtichettaPartenza().setText("1...");
                riproduzioneAudio(srcPartenza3, formatoPartenza3, partenza3, durataPartenza3, "1.wav");

                // Scomparsa dei ringraziamenti da parte dello staff produttore
                framePrincipale.getFotoRingraziamenti().setVisible(false);
                framePrincipale.getEtichettaRingraziamenti().setVisible(false);
                framePrincipale.getGiuseppe().setVisible(false);
                framePrincipale.getElia().setVisible(false);
                framePrincipale.getSousane().setVisible(false);

                // Settaggio iniziale dei valori delle etichette del punteggio, delle vite e del record massimo
                framePrincipale.getPunteggio().setText("Punti: " + framePrincipale.getNPunti());
                framePrincipale.getVite().setText("Vite: " + framePrincipale.getNVite());
                framePrincipale.getRecordMassimo().setText("Record: " + framePrincipale.getNPuntiRecord());

                // Settare inizialmente come invisibili tutti i tool riguardanti l'inserimento del nome del giocatore
                framePrincipale.getEtichettaInserimento().setVisible(false);
                framePrincipale.getNomeGiocatore().setVisible(false);
                framePrincipale.getConfirm().setVisible(false);

                // Rendere visibile framePrincipale
                framePrincipale.setVisible(true);

                // Chiudere l'oggetto StartFrame creato
                frameS.dispose();

                // Avviare una musica di background mentre si sta giocando
                // Inizializzazione di threadMusica
                threadMusica = new NewThread(framePrincipale);
                // Risettaggio del nome di threadMusica
                threadMusica.setName("musica");
                // Avvio di threadMusica
                threadMusica.start();
                    
                // Avviare il movimento del granchio o del gabbiano
                // Inizializzazione di threadOstacoli
                threadOstacoli = new NewThread(framePrincipale);
                // Risettaggio del nome di threadOstacoli, a seconda del valore assunto da threadOstacoli
                switch (genRand.nextInt(2)) {
                    case 0 -> threadOstacoli.setName("granchio");
                    case 1 -> threadOstacoli.setName("gabbiano");
                }
                // Avvio di threadOstacoli
                threadOstacoli.start();

                // Avviare un controllore di conflitto pallina-granchio o pallina-gabbiano
                // Inizializzazione di threadConflitto
                threadConflitto = new NewThread(framePrincipale);
                // Risettaggio del nome di threadConflitto
                threadConflitto.setName("conflitto");
                // Avvio di threadConflitto
                threadConflitto.start();

                // Avviare un contatore di punti
                // Inizializzazione di threadPunti
                threadPunti = new NewThread(framePrincipale);
                // Risettaggio del nome di threadPunti
                threadPunti.setName("incrementoPunti");
                // Avvio di threadPunti
                threadPunti.start();
                    
                // Segnalare la partenza al gioco
                riproduzioneAudio(srcPartenza4, formatoPartenza4, partenza4, durataPartenza4, "via!.wav");
            } case "musica" -> {

                /* 
                Dichiarazione (e implementazione) degli oggetti srcCanzone, 
                formatoMusica, formatoSconfitta, 
                canzone e 
                genRand
                */
                AudioInputStream srcCanzone = null;
                AudioFormat formatoMusica;
                Clip canzone = null;
                Random genRand = new Random();

                // Dichiarazione variabili
                long durataCanzone, controlloCanzone;

                // Fin quando il numero di vite è maggiore di 0 e il numero di punti è minore di 100000
                while (frameP.getNVite() > 0 && frameP.getNPunti() < 100000) {
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
                            while (frameP.getNVite() > 0 && frameP.getNPunti() < 100000 && controlloCanzone < durataCanzone){
                                try {
                                    controlloCanzone += durataCanzone / 10000;
                                    sleep(durataCanzone / 10000);
                                    
                                // Eccezione nel caso di errori nell'esecuzione di sleep    
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

                // Fermare l'esecuzione della canzone di sottofondo
                canzone.stop();
            } case "incrementoPunti" -> {

                // Fin quando il numero di vite è maggiore di 0 e il numero di punti è minore di 100000
                while (frameP.getNVite() > 0 && frameP.getNPunti() < 100000) {

                    // Mostrare graficamente il punteggio in tempo reale
                    frameP.getPunteggio().setText("Punti: " + (frameP.getNPunti()));
                    
                    if (frameP.getNPunti() > frameP.getNPuntiRecord()) {
                            
                        // Incrementare anche il punteggio del record massimo nel caso il numero di punti guadagnati superasse quest'ultimo
                        frameP.incrementoNPuntiRecord();
                            
                        // Mostrare graficamente il punteggio del record massimo in tempo reale
                        frameP.getRecordMassimo().setText("Record: " + (frameP.getNPuntiRecord()));
                    } 
                    
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

                            // Se il numero di punti arriva a 100000
                            if (frameP.getNPunti() == 100000) {

                                // Mostrare graficamente il punteggio in tempo reale
                                frameP.getPunteggio().setText("Punti: " + (frameP.getNPunti()));

                                // Fare in modo che al prossimo richiamo di run venga eseguito un altro blocco di codice dello switch che permetta di mostrare la sorpresa finale
                                this.setName("incrementoVita");
                                run();
                            }    

                        // Eccezione nel caso di errori nell'esecuzione di sleep
                        } catch (InterruptedException ex) {
                            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                    
                // Decrementare il numero di punti
                frameP.decrementoNPunti();
            } case "incrementoVita" -> {

                /*
                Dichiarazione (e implementazione) degli oggetti srcIncremento, 
                formatoIncremento, e
                incremento
                */
                AudioInputStream srcIncremento = null;
                AudioFormat formatoIncremento = null;
                Clip incremento = null;

                // Dichiarazione variabili
                long durataIncremento = 0;
                    
                // Incrementare il numero di vite
                frameP.incrementoNVite();
                        
                // Visualizzare il valore delle vite aggiornato
                frameP.getVite().setText("Vite: " + (frameP.getNVite()));

                // Se si arriva a 100000 punti... Sorpresa!!!
                if (frameP.getNPunti() == 100000) {
                        
                    // Incrementare il numero di punti
                    frameP.incrementoNPunti();

                    // Settare come invisibili la pallina, il granchio e il gabbiano
                    frameP.getPallina().setVisible(false);
                    frameP.getGranchio().setVisible(false);
                    frameP.getGabbiano().setVisible(false);

                    // Comparsa dei ringraziamenti da parte dello staff produttore
                    frameP.getFotoRingraziamenti().setVisible(true);
                    frameP.getEtichettaRingraziamenti().setVisible(true);
                    frameP.getGiuseppe().setVisible(true);
                    frameP.getElia().setVisible(true);
                    frameP.getSousane().setVisible(true);

                    // Riprodurre il file audio "incrementoVita.wav"
                    riproduzioneAudio(srcIncremento, formatoIncremento, incremento, durataIncremento, "incrementoVita.wav");

                    try {

                        // Mettere in pausa il thread per un tempo pari a 5 secondi
                        sleep(5000);

                    // Eccezione nel caso di errori nell'esecuzione di sleep    
                    } catch (InterruptedException ex) {
                        Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        
                    // Settare come visibili tutti i tool riguardanti l'inserimento del nome del giocatore
                    frameP.getEtichettaInserimento().setVisible(true);
                    frameP.getNomeGiocatore().setVisible(true);
                    frameP.getConfirm().setVisible(true);
                        
                    // Attivare la casella di inserimento del nome
                    frameP.getNomeGiocatore().setEnabled(true);

                    // Scomparsa dei ringraziamenti da parte dello staff produttore
                    frameP.getFotoRingraziamenti().setVisible(false);
                    frameP.getEtichettaRingraziamenti().setVisible(false);
                    frameP.getGiuseppe().setVisible(false);
                    frameP.getElia().setVisible(false);
                    frameP.getSousane().setVisible(false);
                } else {

                    // Colorare di rosso la pallina per rappresentare in maniera più intuitiva il fatto di aver guadagnato una vita
                    frameP.getPallina().setIcon((new javax.swing.ImageIcon(getClass().getResource("/jumpingball/vita+1.png"))));

                    // Riprodurre il file audio "incrementoVita.wav"
                    riproduzioneAudio(srcIncremento, formatoIncremento, incremento, durataIncremento, "incrementoVita.wav");

                    // Ricolorare la pallina come in origine
                    frameP.getPallina().setIcon((new javax.swing.ImageIcon(getClass().getResource("/jumpingball/pallina.png"))));

                    // Aumentare di 1 il livello di velocità
                    if (frameP.getVelocita() > 5)
                        frameP.decrementoVelocita();

                    // Ritornare a incrementare il numero di punti
                    this.setName("incrementoPunti");
                    run();
                }
            } case "conflitto" -> {

                // Fin quando il numero di vite è maggiore di 0 e il numero di punti è minore di 100000
                while (frameP.getNVite() > 0 && frameP.getNPunti() < 100000) {

                    // Se la pallina collide o con il granchio o con il gabbiano
                    if ((frameP.getGranchio().getX() >= frameP.getPallina().getX() - 32 && frameP.getGranchio().getX() <= frameP.getPallina().getX() + 32 && frameP.getGranchio().getY() == frameP.getYPallina()) || 
                        (frameP.getGabbiano().getX() >= frameP.getPallina().getX() - 32 && frameP.getGabbiano().getX() <= frameP.getPallina().getX() + 32 && frameP.getGabbiano().getY() == frameP.getYPallina())) {

                        // Decrementare di 1 il numero di vite
                        this.setName("decrementoVita");
                        run();
                    } else {

                        // Altrimenti sospendere il thread per un tempo pari alla velocità della pallina e degli ostacoli
                        try {
                            sleep(frameP.getVelocita());

                        // Eccezione nel caso di errori nell'esecuzione di sleep    
                        } catch (InterruptedException ex) {
                            Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }    
                }
            } case "decrementoVita" -> {

                /* 
                Dichiarazione (e implementazione) degli oggetti srcDecremento, 
                formatoDecremento, e 
                decremento
                */
                AudioInputStream srcDecremento = null, srcSconfitta = null;
                AudioFormat formatoDecremento = null, formatoSconfitta = null;
                Clip decremento = null, sconfitta = null;

                // Dichiarazione variabili
                long durataDecremento = 0, durataSconfitta = 0;

                // Decrementare il numero di vite
                frameP.decrementoNVite();
                    
                // Visualizzare il valore delle vite aggiornato
                frameP.getVite().setText("Vite: " + (frameP.getNVite()));

                // Se il numero di vite è uguale a 0
                if (frameP.getNVite() == 0) { 

                    // Settare come invisibili la pallina, il granchio e il gabbiano
                    frameP.getPallina().setVisible(false);
                    frameP.getGranchio().setVisible(false);
                    frameP.getGabbiano().setVisible(false);
                    // Settare inizialmente come invisibili tutti i tool riguardanti l'inserimento del nome del giocatore
                    frameP.getEtichettaInserimento().setVisible(true);
                    frameP.getNomeGiocatore().setVisible(true);
                    frameP.getConfirm().setVisible(true);

                    // Riprodurre il file audio "sconfitta.wav"
                    riproduzioneAudio(srcDecremento, formatoSconfitta, sconfitta, durataSconfitta, "sconfitta.wav");
                        
                    // Attivare la casella di inserimento del nome
                    frameP.getNomeGiocatore().setEnabled(true);
                } else {

                    // Settare "vita-1.png" come icona sostitutiva della pallina
                    frameP.getPallina().setIcon((new javax.swing.ImageIcon(getClass().getResource("/jumpingball/vita-1.png"))));

                    // Riprodurre il file audio "decrementoVita.wav"
                    riproduzioneAudio(srcDecremento, formatoDecremento, decremento, durataDecremento, "decrementoVita.wav");

                    // Risettare l'icona della pallina
                    frameP.getPallina().setIcon((new javax.swing.ImageIcon(getClass().getResource("/jumpingball/pallina.png"))));
                }
            } case "pallina" -> {

                // Dichiarazione (e implementazione) variabili
                int G = 4;

                // Ciclo di gestione della pallina in salita
                while (frameP.getYPallina() >= 216) {
                    try {
                        sleep(frameP.getVelocita());
                        
                    // Eccezione nel caso di errori nell'esecuzione di sleep    
                    } catch (InterruptedException ex) {
                        Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    frameP.getPallina().setLocation(frameP.getPallina().getX(), frameP.getYPallina());

                    if ((280 - frameP.getYPallina()) % 16 == 0)
                        G--;

                    frameP.decrementoYPallina(G);
                }

                // Impostazione della gravità uguale a 1
                G = 1;

                // Ciclo di gestione della pallina in discesa
                while (frameP.getYPallina() <= 280) {
                    try {
                        sleep(frameP.getVelocita());
                        
                    // Eccezione nel caso di errori nell'esecuzione di sleep    
                    } catch (InterruptedException ex) {
                        Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    frameP.getPallina().setLocation(frameP.getPallina().getX(), frameP.getYPallina());

                    if ((frameP.getYPallina() - 216) % 16 == 0)
                        G++;

                    frameP.incrementoYPallina(G);
                }

                // Centrare la pallina sul terreno di gioco
                frameP.decrementoYPallina(G);                
            } case "salto" -> {

                /* 
                Dichiarazione (e implementazione) degli oggetti srcSalto, 
                formato, e 
                salto
                */
                AudioInputStream srcSalto = null;
                AudioFormat formatoSalto = null;
                Clip salto = null;

                // Dichiarazione variabili
                long durataSalto = 0;

                // Riprodurre il file audio "salto.wav"
                riproduzioneAudio(srcSalto, formatoSalto, salto, durataSalto, "salto.wav");
            } case "granchio" -> {
                Random genRand = new Random();

                switch (genRand.nextInt(2)) {

                    // Movimento verso destra del granchio e probabile cambio con il gabbiano
                    case 0 -> {

                        // Fin quando il numero di vite è maggiore di 0 e il numero di punti è minore di 100000
                        while (frameP.getNVite() > 0 && frameP.getNPunti() < 100000) {
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
                                
                            // Eccezione nel caso di errori nell'esecuzione di sleep    
                            } catch (InterruptedException ex) {
                                Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                    // Movimento verso sinistra del granchio e probabile cambio con il gabbiano    
                    } case 1 -> {

                        // Fin quando il numero di vite è maggiore di 0 e il numero di punti è minore di 100000
                        while (frameP.getNVite() > 0 && frameP.getNPunti() < 100000) {
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
                                
                            // Eccezione nel caso di errori nell'esecuzione di sleep    
                            } catch (InterruptedException ex) {
                                Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                }
            } case "gabbiano" -> {
                Random genRand = new Random();

                switch (genRand.nextInt(2)) {

                    // Movimento verso destra del gabbiano e probabile cambio con il granchio
                    case 0 -> {

                        // Settare al gabbiano la sua immagine orientata a destra
                        frameP.getGabbiano().setIcon((new javax.swing.ImageIcon(getClass().getResource("/jumpingball/gabbianoDestra.gif"))));
                            
                        // Fin quando il numero di vite è maggiore di 0 e il numero di punti è minore di 100000
                        while (frameP.getNVite() > 0 && frameP.getNPunti() < 100000) {
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
                                
                            // Eccezione nel caso di errori nell'esecuzione di sleep    
                            } catch (InterruptedException ex) {
                                Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                    // Movimento verso sinistra del gabbiano e probabile cambio con il granchio    
                    } case 1 -> {
                            
                        // Settare al gabbiano la sua immagine orientata a sinistra
                        frameP.getGabbiano().setIcon((new javax.swing.ImageIcon(getClass().getResource("/jumpingball/gabbianoSinistra.gif"))));

                        // Fin quando il numero di vite è maggiore di 0 e il numero di punti è minore di 100000
                        while (frameP.getNVite() > 0 && frameP.getNPunti() < 100000) {
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
                                
                            // Eccezione nel caso di errori nell'esecuzione di sleep    
                            } catch (InterruptedException ex) {
                                Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }    
                    }
                }
            } case "click" -> {

                /* 
                Dichiarazione (e implementazione) degli oggetti srcClick, 
                formatoClick, e 
                click
                */
                AudioInputStream srcClick = null;
                AudioFormat formatoClick = null;
                Clip click = null;

                // Dichiarazione variabili
                long durataClick = 0;

                // Riprodurre il file audio "click.wav"
                riproduzioneAudio(srcClick, formatoClick, click, durataClick, "click.wav");
            }
        }
        
    // Per i file audio che condividono lo stesso codice necessario alla riproduzione
    } public void riproduzioneAudio(AudioInputStream srcAudio, AudioFormat formatoAudio, Clip audio, long durataAudio, String nomeAudio) {
        try {

            // Assegnazione del file audio nomeAudio a srcAudio
            srcAudio = AudioSystem.getAudioInputStream(new File(nomeAudio));

            try {

                // Ottenimento del canale da utilizzare per l'esecuzione del file audio aperto
                audio = AudioSystem.getClip();
                // Apertura del file assegnato a srcAudio
                audio.open(srcAudio);
                // Inizio dell'esecuzione di tale file
                audio.start();
                // Esecuzione di tale file fino alla sua terminazione
                audio.drain();

                try {

                    // Calcolare la durata di ascolto del file riprodotto in millisecondi
                    formatoAudio = srcAudio.getFormat();
                    durataAudio = (long) (audio.getFrameLength() / formatoAudio.getFrameRate() * 1000);

                    // Mettere in pausa il thread per un tempo pari a quello del file audio riprodotto
                    sleep(durataAudio);

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
                srcAudio.close();

            // Eccezione nel caso di errore nello scambio di dati dal e al file audio utilizzato
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}