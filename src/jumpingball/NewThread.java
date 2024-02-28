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
    
    @Override
    public void run() {
        switch (this.getName()) {
            case "Inizio" -> {
                
                // Dichiarazione degli oggetti srcInizio, formatoInizio, e inizio appartenenti rispettivamente alle classi AudioInputStream, AudioFormat, e Clip e implementazione di srcInizio
                AudioInputStream srcInizio = null;
                AudioFormat formatoInizio;
                Clip inizio;

                // Dichiarazione variabili
                long durataInizio;

                try {

                    // Assegnazione del file audio "Salto.wav" a srcSalto
                    srcInizio = AudioSystem.getAudioInputStream(new File("Inizio.wav"));

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
            } case "Partenza" -> {
                
                // Dichiarazione degli oggetti srcPartenza, formatoPartenza, e partenza appartenenti rispettivamente alle classi AudioInputStream, AudioFormat, e Clip e implementazione di srcPartenza
                AudioInputStream srcPartenza = null;
                AudioFormat formatoPartenza;
                Clip partenza;

                // Dichiarazione variabili
                long durataPartenza;

                try {

                    // Assegnazione del file audio "Partenza.wav" a srcSalto
                    srcPartenza = AudioSystem.getAudioInputStream(new File("Partenza.wav"));

                    try {

                        // Ottenimento del canale da utilizzare per l'esecuzione del file audio aperto
                        partenza = AudioSystem.getClip();
                        // Apertura del file assegnato a srcPartenza
                        partenza.open(srcPartenza);
                        // Inizio dell'esecuzione di tale file
                        partenza.start();
                        // Esecuzione di tale file fino alla sua terminazione
                        partenza.drain();

                        try {

                            // Calcolare la durata di ascolto del file riprodotto in millisecondi
                            formatoPartenza = srcPartenza.getFormat();
                            durataPartenza = (long) (partenza.getFrameLength() / formatoPartenza.getFrameRate() * 1000);

                            // Mettere in pausa il thread per un tempo pari a quello del file audio riprodotto
                            sleep(durataPartenza);

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
                        srcPartenza.close();

                    // Eccezione nel caso di errore nello scambio di dati dal e al file audio utilizzato
                    } catch (IOException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } case "Musica" -> {
                
                // Dichiarazione degli oggetti srcCanzone, formato, canzone e genRand appartenenti rispettivamente alle classi AudioInputStream, AudioFormat, Clip e Random e implementazione di srcCanzone e genRand
                AudioInputStream srcCanzone = null;
                AudioFormat formatoMusica;
                Clip canzone;
                Random genRand = new Random();
                
                // Dichiarazione variabili
                long durataCanzone;
                
                try {
                    
                    // Assegnazione di un file audio a srcCanzone scelto in modo randomico tra 6 file preimpostati
                    switch (genRand.nextInt(6)) {
                        case 0 -> srcCanzone = AudioSystem.getAudioInputStream(new File("Baby Gang – Casablanca (feat. Morad ) [Official Video].wav"));
                        case 1 -> srcCanzone = AudioSystem.getAudioInputStream(new File("Baby Gang - Que Lo Ke [Official Lyric Video].wav"));
                        case 2 -> srcCanzone = AudioSystem.getAudioInputStream(new File("Fred De Palma feat. Ana Mena – D'estate non vale (feat. Ana Mena).wav"));
                        case 3 -> srcCanzone = AudioSystem.getAudioInputStream(new File("Giuni Russo – Unestate al mare.wav"));
                        case 4 -> srcCanzone = AudioSystem.getAudioInputStream(new File("Il Pagante - @NewMusicItaly – Portofino - @NewMusicItaly.wav"));
                        case 5 -> srcCanzone = AudioSystem.getAudioInputStream(new File("Kaoma – Lambada.wav"));
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
            } case "Salto" -> {
                
                // Dichiarazione degli oggetti srcSalto, formato, e salto appartenenti rispettivamente alle classi AudioInputStream, AudioFormat, e Clip e implementazione di srcSalto
                AudioInputStream srcSalto = null;
                AudioFormat formatoSalto;
                Clip salto;
                
                // Dichiarazione variabili
                long durataSalto;
                
                try {
                    
                    // Assegnazione del file audio "Salto.wav" a srcSalto
                    srcSalto = AudioSystem.getAudioInputStream(new File("Salto.wav"));
                    
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
            } case "Click" -> {
                
                // Dichiarazione degli oggetti srcClick, formatoClick, e click appartenenti rispettivamente alle classi AudioInputStream, AudioFormat, e Clip e implementazione di srcSalto
                AudioInputStream srcClick = null;
                AudioFormat formatoClick;
                Clip click;
                
                // Dichiarazione variabili
                long durataClick;
                
                try {
                    
                    // Assegnazione del file audio "Click.wav" a srcClick
                    srcClick = AudioSystem.getAudioInputStream(new File("Click.wav"));
                    
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
