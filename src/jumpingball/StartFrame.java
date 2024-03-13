/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jumpingball;

import java.awt.Color; // Importare la classe Color
import java.util.Random; // Importare la classe Random
import java.io.File; // Importare la classe File
import java.io.FileNotFoundException; // Importare la classe FileNotFoundException 
import java.io.FileReader; // Importare la classe FileReader
import java.io.BufferedReader; // Importare la classe BufferedReader
import java.io.IOException; // Importare la classe IOException 
import java.io.PrintWriter;
import java.util.logging.Level; // Importare la classe Level
import java.util.logging.Logger; // Importare la classe Logger
import javax.sound.sampled.AudioFormat; // Importare la classe AudioFormat
import javax.sound.sampled.AudioInputStream; // Importare la classe AudioInputStream
import javax.sound.sampled.AudioSystem; // Importare la classe AudioSystem
import javax.sound.sampled.Clip; // Importare la classe Clip
import javax.sound.sampled.LineUnavailableException; // Importare la classe LineUnavailableException
import javax.sound.sampled.UnsupportedAudioFileException; // Importare la classe UnsupportedAudioFileException
import javax.swing.JTextArea; // Importare la classe JTextArea
import javax.swing.JOptionPane; // Importare la classe JOptionPane

/**
 *
 * @author 39327
 */
public class StartFrame extends javax.swing.JFrame {

    // Metodo costruttore di default
    public StartFrame() {
        initComponents();
    }
    
    // Metodi getters
    public JTextArea getAreaClassifica() {
        return areaClassifica; 
    }
    
    // Altri metodi
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        start = new javax.swing.JButton();
        classifica = new javax.swing.JPanel();
        scorrimentoGiocatori = new javax.swing.JScrollPane();
        areaClassifica = new javax.swing.JTextArea();
        etichettaGiocatori = new javax.swing.JLabel();
        etichettaPunteggi = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        help = new javax.swing.JButton();
        sfondoStart = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jumping Ball");
        setMinimumSize(new java.awt.Dimension(600, 425));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        start.setBackground(new java.awt.Color(0, 153, 255));
        start.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        start.setText("Start");
        start.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        getContentPane().add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 80, 30));

        classifica.setBackground(new java.awt.Color(153, 255, 255));

        areaClassifica.setEditable(false);
        areaClassifica.setBackground(new java.awt.Color(204, 153, 255));
        areaClassifica.setColumns(15);
        areaClassifica.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        areaClassifica.setRows(17);
        scorrimentoGiocatori.setViewportView(areaClassifica);

        etichettaGiocatori.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        etichettaGiocatori.setText("Giocatore");

        etichettaPunteggi.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        etichettaPunteggi.setText("Punteggio");

        javax.swing.GroupLayout classificaLayout = new javax.swing.GroupLayout(classifica);
        classifica.setLayout(classificaLayout);
        classificaLayout.setHorizontalGroup(
            classificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(classificaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(classificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, classificaLayout.createSequentialGroup()
                        .addComponent(etichettaGiocatori, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etichettaPunteggi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(scorrimentoGiocatori, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        classificaLayout.setVerticalGroup(
            classificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, classificaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(classificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etichettaGiocatori)
                    .addComponent(etichettaPunteggi, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scorrimentoGiocatori, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(classifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 180, 280));

        reset.setBackground(new java.awt.Color(0, 153, 255));
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumpingball/reset.png"))); // NOI18N
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset.setPreferredSize(new java.awt.Dimension(38, 38));
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 387, -1, -1));

        help.setBackground(new java.awt.Color(0, 153, 255));
        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumpingball/help.png"))); // NOI18N
        help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        help.setPreferredSize(new java.awt.Dimension(38, 38));
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });
        getContentPane().add(help, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 387, -1, -1));

        sfondoStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumpingball/sfondoInizio.jpg"))); // NOI18N
        getContentPane().add(sfondoStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        
        /* 
        Dichiarazione e inizializzazione di un oggetto framePrincipale della classe MainFrame e di un oggetto srcPartenza della classe AudioInputStream 
        e sola dichiarazione di un oggetto formatoPartenza della classe AudioFormat, di un oggetto partenza della classe Clip e
        di cinque oggetti threadClick, threadMusica, threadPunti, threadConflitto e threadOstacoli appartenenti alla classe NewThread
        */
        Random genRand = new Random();
        MainFrame framePrincipale = new MainFrame();
        AudioInputStream srcPartenza1 = null, srcPartenza2 = null, srcPartenza3 = null, srcPartenza4 = null;
        AudioFormat formatoPartenza;
        Clip partenza;
        NewThread threadClick, threadMusica, threadPunti, threadConflitto, threadOstacoli;
        
        // Dichiarazione variabili
        long durataPartenza;
        
        // Avviare un file audio per segnalare il click del pulsante start
        // Inizializzazione di threadClick
        threadClick = new NewThread();
        // Risettaggio del nome di threadClick
        threadClick.setName("click");
        // Avvio di threadClick
        threadClick.start();

        // Avviare un file audio di introduzione al gioco
        try {

            // Assegnazione del file audio "Partenza.wav" a srcSalto
            srcPartenza1 = AudioSystem.getAudioInputStream(new File("partenza.wav"));

            try {

                // Ottenimento del canale da utilizzare per l'esecuzione del file audio aperto
                partenza = AudioSystem.getClip();
                // Apertura del file assegnato a srcPartenza
                partenza.open(srcPartenza1);
                // Inizio dell'esecuzione di tale file
                partenza.start();
                // Esecuzione di tale file fino alla sua terminazione
                partenza.drain();

                try {

                    // Calcolare la durata di ascolto del file riprodotto in millisecondi
                    formatoPartenza = srcPartenza1.getFormat();
                    durataPartenza = (long) (partenza.getFrameLength() / formatoPartenza.getFrameRate() * 1000);

                    // Mettere in pausa il thread per un tempo pari a quello del file audio riprodotto
                    Thread.sleep(durataPartenza);

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
                srcPartenza1.close();

            // Eccezione nel caso di errore nello scambio di dati dal e al file audio utilizzato
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        /*try {

            // Assegnazione del file audio "Partenza.wav" a srcSalto
            srcPartenza2 = AudioSystem.getAudioInputStream(new File("partenza.wav"));

            try {

                // Ottenimento del canale da utilizzare per l'esecuzione del file audio aperto
                partenza = AudioSystem.getClip();
                // Apertura del file assegnato a srcPartenza
                partenza.open(srcPartenza2);
                // Inizio dell'esecuzione di tale file
                partenza.start();
                // Esecuzione di tale file fino alla sua terminazione
                partenza.drain();

                try {

                    // Calcolare la durata di ascolto del file riprodotto in millisecondi
                    formatoPartenza = srcPartenza2.getFormat();
                    durataPartenza = (long) (partenza.getFrameLength() / formatoPartenza.getFrameRate() * 1000);

                    // Mettere in pausa il thread per un tempo pari a quello del file audio riprodotto
                    Thread.sleep(durataPartenza);

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
                srcPartenza2.close();

            // Eccezione nel caso di errore nello scambio di dati dal e al file audio utilizzato
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {

            // Assegnazione del file audio "Partenza.wav" a srcSalto
            srcPartenza3 = AudioSystem.getAudioInputStream(new File("partenza.wav"));

            try {

                // Ottenimento del canale da utilizzare per l'esecuzione del file audio aperto
                partenza = AudioSystem.getClip();
                // Apertura del file assegnato a srcPartenza
                partenza.open(srcPartenza3);
                // Inizio dell'esecuzione di tale file
                partenza.start();
                // Esecuzione di tale file fino alla sua terminazione
                partenza.drain();

                try {

                    // Calcolare la durata di ascolto del file riprodotto in millisecondi
                    formatoPartenza = srcPartenza3.getFormat();
                    durataPartenza = (long) (partenza.getFrameLength() / formatoPartenza.getFrameRate() * 1000);

                    // Mettere in pausa il thread per un tempo pari a quello del file audio riprodotto
                    Thread.sleep(durataPartenza);

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
                srcPartenza3.close();

            // Eccezione nel caso di errore nello scambio di dati dal e al file audio utilizzato
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {

            // Assegnazione del file audio "Partenza.wav" a srcSalto
            srcPartenza4 = AudioSystem.getAudioInputStream(new File("partenza.wav"));

            try {

                // Ottenimento del canale da utilizzare per l'esecuzione del file audio aperto
                partenza = AudioSystem.getClip();
                // Apertura del file assegnato a srcPartenza
                partenza.open(srcPartenza4);
                // Inizio dell'esecuzione di tale file
                partenza.start();
                // Esecuzione di tale file fino alla sua terminazione
                partenza.drain();

                try {

                    // Calcolare la durata di ascolto del file riprodotto in millisecondi
                    formatoPartenza = srcPartenza4.getFormat();
                    durataPartenza = (long) (partenza.getFrameLength() / formatoPartenza.getFrameRate() * 1000);

                    // Mettere in pausa il thread per un tempo pari a quello del file audio riprodotto
                    Thread.sleep(durataPartenza);

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
                srcPartenza4.close();

            // Eccezione nel caso di errore nello scambio di dati dal e al file audio utilizzato
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
        
        // Settaggio iniziale dei valori delle etichette del punteggio, delle vite e del record massimo
        framePrincipale.getPunteggio().setText("Punti: " + framePrincipale.getNPunti());
        framePrincipale.getVite().setText("Vite: " + framePrincipale.getNVite());
        framePrincipale.getRecordMassimo().setText("Record: " + framePrincipale.getPuntiRecord());
        
        // Settare inizialmente come invisibili tutti i tool riguardanti l'inserimento del nome del giocatore
        framePrincipale.getEtichettaInserimento().setVisible(false);
        framePrincipale.getNomeGiocatore().setVisible(false);
        // framePrincipale.getConfirm().setVisible(true);
        framePrincipale.getConfirm().setVisible(false);
        
        // Rendere visibile framePrincipale
        framePrincipale.setVisible(true);
        
        // Chiudere l'oggetto StartFrame creato
        dispose();
        
        // Avviare una musica di background mentre si sta giocando
        // Inizializzazione di threadMusica
        threadMusica = new NewThread(framePrincipale);
        // Risettaggio del nome di threadMusica
        threadMusica.setName("musica");
        // Avvio di threadMusica
        threadMusica.start();
        
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
        
        // Avviare il movimento del granchio
        // Inizializzazione di threadOstacoli
        threadOstacoli = new NewThread(framePrincipale);
        // Risettaggio del nome di threadOstacoli, a seconda del valore assunto da threadOstacoli
        switch (genRand.nextInt(2)) {
            case 0 -> threadOstacoli.setName("granchio");
            case 1 -> threadOstacoli.setName("gabbiano");
        }
        // Avvio di threadOstacoli
        threadOstacoli.start();
    }//GEN-LAST:event_startActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        
        // Dichiarazione e inizializzazione dell'oggetto frameAiuto della classe HelpFrame e sola dichiarazione dell'oggetto threadClick della classe NewThread
        HelpFrame frameAiuto = new HelpFrame();
        Thread threadClick;
        
        // Avviare un file audio per segnalare il click del pulsante help
        // Inizializzazione di threadClick
        threadClick = new NewThread();
        // Risettaggio del nome di threadClick
        threadClick.setName("click");
        // Avvio di threadClick
        threadClick.start();
        
        // Settare il colore di sfondo del pannello principale contenuto in frameAiuto
        frameAiuto.getContentPane().setBackground(new Color(0, 102, 255));
        
        // Rendere visibile frameAiuto
        frameAiuto.setVisible(true);
    }//GEN-LAST:event_helpActionPerformed
                                 

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        
        int i, confermaReset = JOptionPane.showConfirmDialog(null, "Vuoi confermare il reset della classifica?", "Conferma", JOptionPane.YES_NO_OPTION);
        String nomeFile = "Classifica.csv", nomeGiocatore, punteggio, riga;

        String[] statoGiocatore;
        
        PrintWriter scrittura;
        BufferedReader lettura;
        Thread threadClick;
        
        // Avviare un file audio per segnalare il click del pulsante help
        // Inizializzazione di threadClick
        threadClick = new NewThread();
        // Risettaggio del nome di threadClick
        threadClick.setName("click");
        // Avvio di threadClick
        threadClick.start();
        
        if (confermaReset == JOptionPane.YES_OPTION) {
            try {
                scrittura = new PrintWriter(new File(nomeFile));

                StringBuilder sb = new StringBuilder(); // ti permette di costruire una stringa
                sb.append("Giocatore");
                sb.append(';');
                sb.append("Punteggio");
                sb.append('\n');
                
                for (i = 0; i < 17; i++){
                    sb.append("AAA");
                    sb.append(';');
                    sb.append("0");
                    if(i < 17)  
                        sb.append('\n');
                }
                
                /*scrittura.write(sb.toString());
                scrittura.close();*/

            }
            catch (FileNotFoundException e){
                JOptionPane.showMessageDialog(null, "File \"Classifica.csv\" assente.", "Errore", JOptionPane.ERROR_MESSAGE);
            }
            
            areaClassifica.setText("");
            
            try {
            
                // Inizializzare l'oggetto Lettore
                lettura = new BufferedReader(new FileReader(nomeFile));

                // Saltare la prima riga della tabella in "Classifica.csv" per evitare la lettura dei valori indesiderati presenti in questa
                lettura.readLine();

                // Leggere tante righe della tabella in "Classifica.csv" quante ce ne sono
                while((riga = lettura.readLine()) != null) {

                    // Dividere la riga nei campi corrispondenti separandoli rispettivamente con un punto e virgola
                    statoGiocatore = riga.split(";");

                    // Assegnare l'elemento contenuto nel primo campo a nomeGiocatore
                    nomeGiocatore = statoGiocatore[0];

                    // Assegnare l'elemento contenuto nel secondo campo a punteggio
                    punteggio = statoGiocatore[1];

                    // Inserire i valori di nomeGiocatore e punteggio nell'area apposita della classifica
                    areaClassifica.append(nomeGiocatore + "\t   ");
                    areaClassifica.append(punteggio + '\n');
                }
                // Gestire l'assenza del file richiamato    
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "File \"Classifica.csv\" assente.", "Errore", JOptionPane.ERROR_MESSAGE);

                // Gestire l'errore di lettura/scrittura del file richiamato    
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Errore durante la lettura/scrittura del/sul file \"Classifica.csv\".", "Errore", JOptionPane.ERROR_MESSAGE);
            } 
        }
    }//GEN-LAST:event_resetMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        // Dichiarazione variabili
        String nomeGiocatore, punteggio, nomeFile = "Classifica.csv", riga;
        
        // Dichiarazione array
        String[] statoGiocatore;
        
        // Dichiarazione e implementazione dell'oggetto frameInizio della classe StartFrame e sola dichiarazione dell'oggetto lettore della classe BufferedReader
        StartFrame frameInizio = new StartFrame();
        BufferedReader lettore;

        // Rendere visibile frameInizio
        frameInizio.setVisible(true);
        
        try {
            
            // Inizializzare l'oggetto Lettore
            lettore = new BufferedReader(new FileReader(nomeFile));
            
            // Saltare la prima riga della tabella in "Classifica.csv" per evitare la lettura dei valori indesiderati presenti in questa
            lettore.readLine();
            
            // Leggere tante righe della tabella in "Classifica.csv" quante ce ne sono
            while((riga = lettore.readLine()) != null) {
                
                // Dividere la riga nei campi corrispondenti separandoli rispettivamente con un punto e virgola
                statoGiocatore = riga.split(";");
                
                // Assegnare l'elemento contenuto nel primo campo a nomeGiocatore
                nomeGiocatore = statoGiocatore[0];
                
                // Assegnare l'elemento contenuto nel secondo campo a punteggio
                punteggio = statoGiocatore[1];
                
                // Inserire i valori di nomeGiocatore e punteggio nell'area apposita della classifica
                frameInizio.getAreaClassifica().append(nomeGiocatore + "\t   ");
                frameInizio.getAreaClassifica().append(punteggio + '\n');
            }
        
        // Gestire l'assenza del file richiamato    
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File \"Classifica.csv\" assente.", "Errore", JOptionPane.ERROR_MESSAGE);
            
        // Gestire l'errore di lettura/scrittura del file richiamato    
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Errore durante la lettura/scrittura del/sul file \"Classifica.csv\".", "Errore", JOptionPane.ERROR_MESSAGE);
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaClassifica;
    private javax.swing.JPanel classifica;
    private javax.swing.JLabel etichettaGiocatori;
    private javax.swing.JLabel etichettaPunteggi;
    private javax.swing.JButton help;
    private javax.swing.JButton reset;
    private javax.swing.JScrollPane scorrimentoGiocatori;
    private javax.swing.JLabel sfondoStart;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
