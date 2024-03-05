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
import java.util.logging.Level; // Importare la classe Level
import java.util.logging.Logger; // Importare la classe Logger
import javax.sound.sampled.AudioFormat; // Importare la classe AudioFormat
import javax.sound.sampled.AudioInputStream; // Importare la classe AudioInputStream
import javax.sound.sampled.AudioSystem; // Importare la classe AudioSystem
import javax.sound.sampled.Clip; // Importare la classe Clip
import javax.sound.sampled.LineUnavailableException; // Importare la classe LineUnavailableException
import javax.sound.sampled.UnsupportedAudioFileException; // Importare la classe UnsupportedAudioFileException
import javax.swing.JTextArea;

/**
 *
 * @author 39327
 */
public class StartFrame extends javax.swing.JFrame {

    // Metodo costruttore di default
    public StartFrame() {
        initComponents();
    }
    
    // Metodi Getters
    public JTextArea getAreaGiocatori(){
        return areaGiocatori; 
    }
    
    public JTextArea getAreaPunteggi(){  
        return areaPunteggi; 
    }
    
    
    
    // Altri metodi
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        start = new javax.swing.JButton();
        classifica = new javax.swing.JPanel();
        scorrimentoPunteggi = new javax.swing.JScrollPane();
        areaPunteggi = new javax.swing.JTextArea();
        scorrimentoGiocatori = new javax.swing.JScrollPane();
        areaGiocatori = new javax.swing.JTextArea();
        etichettaGiocatori = new javax.swing.JLabel();
        etichettaPunteggi = new javax.swing.JLabel();
        help = new javax.swing.JButton();
        sfondoStart = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jumping Ball");
        setMinimumSize(new java.awt.Dimension(600, 425));
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
        getContentPane().add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 90, 30));

        classifica.setBackground(new java.awt.Color(153, 255, 255));

        areaPunteggi.setBackground(new java.awt.Color(204, 153, 255));
        areaPunteggi.setColumns(8);
        areaPunteggi.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        areaPunteggi.setRows(17);
        scorrimentoPunteggi.setViewportView(areaPunteggi);

        areaGiocatori.setEditable(false);
        areaGiocatori.setBackground(new java.awt.Color(204, 153, 255));
        areaGiocatori.setColumns(8);
        areaGiocatori.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        areaGiocatori.setRows(17);
        scorrimentoGiocatori.setViewportView(areaGiocatori);

        etichettaGiocatori.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        etichettaGiocatori.setText("Giocatore");

        etichettaPunteggi.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        etichettaPunteggi.setText("Punteggio");

        javax.swing.GroupLayout classificaLayout = new javax.swing.GroupLayout(classifica);
        classifica.setLayout(classificaLayout);
        classificaLayout.setHorizontalGroup(
            classificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, classificaLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(classificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scorrimentoGiocatori, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etichettaGiocatori))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(classificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scorrimentoPunteggi, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etichettaPunteggi, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        classificaLayout.setVerticalGroup(
            classificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, classificaLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(classificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etichettaGiocatori)
                    .addComponent(etichettaPunteggi, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(classificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scorrimentoGiocatori, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scorrimentoPunteggi, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(classifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 250, 280));

        help.setBackground(new java.awt.Color(0, 153, 255));
        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumpingball/Help.png"))); // NOI18N
        help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        help.setPreferredSize(new java.awt.Dimension(38, 38));
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });
        getContentPane().add(help, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 387, -1, -1));

        sfondoStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumpingball/Sfondo Inizio.jpg"))); // NOI18N
        getContentPane().add(sfondoStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        
        /* 
        Dichiarazione e inizializzazione di un oggetto framePrincipale della classe MainFrame e di un oggetto srcPartenza della classe AudioInputStream 
        e sola dichiarazione di un oggetto formatoPartenza della classe AudioFormat, di un oggetto partenza della classe Clip e
        di due oggetti threadClick e threadMusica appartenenti alla classe NewThread
        */
        Random genRand = new Random();
        MainFrame framePrincipale = new MainFrame();
        AudioInputStream srcPartenza = null;
        AudioFormat formatoPartenza;
        Clip partenza;
        NewThread threadClick, threadMusica, threadPunti, threadGranchioGabbiano;
        
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
                srcPartenza.close();

            // Eccezione nel caso di errore nello scambio di dati dal e al file audio utilizzato
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // Settaggio iniziale dei valori delle etichette del punteggio, delle vite e del record massimo
        framePrincipale.getPunteggio().setText("Punti: " + framePrincipale.getNPunti());
        framePrincipale.getVite().setText("Vite: " + framePrincipale.getNVite());
        framePrincipale.getRecordMassimo().setText("Record: " + framePrincipale.getPuntiRecord());
        
        // Settare inizialmente come invisibili tutti i tool riguardanti l'inserimento del nome del giocatore
        framePrincipale.getEtichettaInserimento().setVisible(false);
        framePrincipale.getNomeGiocatore().setVisible(false);
        framePrincipale.getConfirm().setVisible(true);
        
        
        // Rendere visibile framePrincipale
        framePrincipale.setVisible(true);
        
        // Chiudere l'oggetto StartFrame creato
        dispose();
        
        // Avviare una musica di background mentre si sta giocando
        // Inizializzazione di threadMusica
        threadMusica = new NewThread();
        // Risettaggio del nome di threadMusica
        threadMusica.setName("musica");
        // Avvio di threadMusica
        threadMusica.start();
        
        // Avviare un contatore di punti
        // Inizializzazione di threadPunti
        threadPunti = new NewThread(framePrincipale);
        // Risettaggio del nome di threadPunti
        threadPunti.setName("incrementoPunti");
        // Avvio di threadMusica
        threadPunti.start();
        
        // Avviare il movimento del granchio
        // Inizializzazione di threadGranchio
        threadGranchioGabbiano = new NewThread(framePrincipale);
        // Risettaggio del nome di threadGranchioGabbiano, a seconda del valore assunto da threadGranchioGabbiano
        switch (genRand.nextInt(2)) {
            case 0 -> threadGranchioGabbiano.setName("granchio");
            case 1 -> threadGranchioGabbiano.setName("gabbiano");
        }
        // Avvio di threadGranchio
        threadGranchioGabbiano.start();
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
        String nomeGiocatore, riga, punteggio, nomeFile = "Classifica.csv";
        
        // Dichiarazione array
        String[] statoGiocatore;
        
        // Dichiarazione e implementazione dell'oggetto frameInizio della classe StartFrame e sola dichiarazione dell'oggetto threadInizio della classe NewThread
        StartFrame frameInizio = new StartFrame();
        Thread threadInizio;
        
        // Avviare un file audio di benvenuto al gioco
        // Inizializzazione di threadInizio
        threadInizio = new NewThread();
        // Risettaggio del nome di threadInizio
        threadInizio.setName("inizio");
        // Avvio di threadInizio
        threadInizio.start();

        // Rendere visibile frameInizio
        frameInizio.setVisible(true);
        
        try {
            BufferedReader Lettore = new BufferedReader(new FileReader(nomeFile));
            //readLine() metodo della classe che consent di leggere una riga
            Lettore.readLine();
            while((riga = Lettore.readLine())!=null)
            {
                statoGiocatore = riga.split(";");
                //estrae ogni elemento in una variabile opportuna
                nomeGiocatore = statoGiocatore[0];
                punteggio = statoGiocatore[1];
                
                frameInizio.getAreaGiocatori().append(nomeGiocatore + '\n');
                frameInizio.getAreaPunteggi().append(punteggio + '\n');
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Impossibile trovare il file " + nomeFile);
        } catch (IOException ex) {
            System.out.println("Errore nella lettura del file " + nomeFile);
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaGiocatori;
    private javax.swing.JTextArea areaPunteggi;
    private javax.swing.JPanel classifica;
    private javax.swing.JLabel etichettaGiocatori;
    private javax.swing.JLabel etichettaPunteggi;
    private javax.swing.JButton help;
    private javax.swing.JScrollPane scorrimentoGiocatori;
    private javax.swing.JScrollPane scorrimentoPunteggi;
    private javax.swing.JLabel sfondoStart;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
