/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jumpingball;

import java.awt.Color; // Importare la classe Color
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 39327
 */
public class StartFrame extends javax.swing.JFrame {

    // Metodo costruttore di default
    public StartFrame() {
        initComponents();
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

        areaPunteggi.setEditable(false);
        areaPunteggi.setColumns(9);
        areaPunteggi.setRows(17);
        scorrimentoPunteggi.setViewportView(areaPunteggi);

        areaGiocatori.setEditable(false);
        areaGiocatori.setColumns(9);
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
        
        // Dichiarazione e inizializzazione di un oggetto framePrincipale della classe MainFrame e sola dichiarazione di tre oggetti threadClick, threadPartenza e threadMusica appartenenti alla classe NewThread
        MainFrame framePrincipale = new MainFrame();
        NewThread threadClick, threadPartenza, threadMusica;
        
        // Avviare un file audio per segnalare il click del pulsante start
        // Inizializzazione di threadClick
        threadClick = new NewThread();
        // Risettaggio del nome di threadClick
        threadClick.setName("Click");
        // Avvio di threadClick
        threadClick.start();
        
        // Avviare un file audio per segnalare la preparazione al gioco
        // Inizializzazione di threadPartenza
        threadPartenza = new NewThread();
        // Risettaggio del nome di threadPartenza
        threadPartenza.setName("Partenza");
        // Avvio di threadPartenza
        threadPartenza.start();
        
        try {
            sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(StartFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Avviare una musica di background mentre si sta giocando
        // Inizializzazione di threadPartenza
        threadMusica = new NewThread();
        // Risettaggio del nome di threadPartenza
        threadMusica.setName("Musica");
        // Avvio di threadPartenza
        threadMusica.start();
        
        // Settaggio iniziale dei valori delle etichette del punteggio, delle vite e del record massimo
        framePrincipale.getPunteggio().setText("Punti: " + framePrincipale.getNPunti());
        framePrincipale.getVite().setText("Vite: " + framePrincipale.getNVite());
        framePrincipale.getRecordMassimo().setText("Record: " + framePrincipale.getPuntiRecord());
        
        // Settare inizialmente come invisibili tutti i tool riguardanti l'inserimento del nome del giocatore
        framePrincipale.getEtichettaInserimento().setVisible(false);
        framePrincipale.getNomeGiocatore().setVisible(false);
        framePrincipale.getConfirm().setVisible(false);
        
        // Eseguire framePrincipale e chiudere il frame iniziale
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                framePrincipale.setVisible(true);
                dispose();
            }
        });
    }//GEN-LAST:event_startActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        
        // Dichiarazione e inizializzazione dell'oggetto frameAiuto della classe HelpFrame e sola dichiarazione dell'oggetto threadClick della classe NewThread
        HelpFrame frameAiuto = new HelpFrame();
        NewThread threadClick;
        
        // Avviare un file audio per segnalare il click del pulsante help
        // Inizializzazione di threadClick
        threadClick = new NewThread();
        // Risettaggio del nome di threadClick
        threadClick.setName("Click");
        // Avvio di threadClick
        threadClick.start();
        
        // Settare il colore di sfondo del pannello principale contenuto in frameAiuto
        frameAiuto.getContentPane().setBackground(new Color(0, 102, 255));
        
        // Eseguire frameAiuto
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frameAiuto.setVisible(true);
            }
        });
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
        
        // Dichiarazione dell'oggetto threadInizio della classe NewThread
        NewThread threadInizio;
        
        // Inizializzazione di threadInizio
        threadInizio = new NewThread();
        // Risettaggio del nome di threadInizio
        threadInizio.setName("Inizio");
        // Avvio di threadInizio
        threadInizio.start();

        // Eseguire il frame iniziale
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartFrame().setVisible(true);
            }
        });
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
