/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jumpingball;

import java.awt.Color; // Importare la classe Color
import java.io.File; // Importare la classe File
import java.io.FileNotFoundException; // Importare la classe FileNotFoundException 
import java.io.FileReader; // Importare la classe FileReader
import java.io.BufferedReader; // Importare la classe BufferedReader
import java.io.IOException; // Importare la classe IOException 
import java.io.PrintWriter; // Importare la classe PrintWriter
import javax.swing.JButton; // Importare la classe JButton
import javax.swing.JLabel; // Importare la classe JLabel
import javax.swing.JTextArea; // Importare la classe JTextArea
import javax.swing.JOptionPane; // Importare la classe JOptionPane
import javax.swing.JPanel; // Importare la classe JPanel

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
    public JLabel getEtichettaGiocatori() {
        return etichettaGiocatori;
    }
    public JLabel getEtichettaPunteggi() {
        return etichettaPunteggi;
    }
    public JTextArea getAreaClassifica() {
        return areaClassifica; 
    }
    public JPanel getClassifica() {
        return classifica;
    }
    public JLabel getEtichettaPartenza() {
        return etichettaPartenza;
    }
    public JButton getStart() {
        return start;
    }
    public JButton getHelp() {
        return help;
    }
    public JButton getReset() {
        return reset;
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
        etichettaPartenza = new javax.swing.JLabel();
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

        getContentPane().add(classifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 180, 280));

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

        etichettaPartenza.setFont(new java.awt.Font("Bauhaus 93", 0, 36)); // NOI18N
        etichettaPartenza.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(etichettaPartenza, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        sfondoStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumpingball/sfondoInizio.jpg"))); // NOI18N
        getContentPane().add(sfondoStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        
        // Dichiarazione dell'oggetto threadPartenza
        NewThread threadPartenza;
        
        // Avviare 4 file audio di introduzione al gioco
        // Inizializzazione di threadPartenza
        threadPartenza = new NewThread(this);
        // Risettaggio del nome di threadPartenza
        threadPartenza.setName("partenza");
        // Rendere Daemon threadPartenza
        threadPartenza.setDaemon(true);
        // Avvio di threadPartenza
        threadPartenza.start();
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
        // Rendere Daemon threadClick
        threadClick.setDaemon(true);
        // Avvio di threadClick
        threadClick.start();
        
        // Settare il colore di sfondo del pannello principale contenuto in frameAiuto
        frameAiuto.getContentPane().setBackground(new Color(0, 102, 255));
        
        // Rendere visibile frameAiuto
        frameAiuto.setVisible(true);
    }//GEN-LAST:event_helpActionPerformed
                                 

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        
        // Dichiarazione variabili
        int i, confermaReset = JOptionPane.showConfirmDialog(null, "Vuoi confermare il reset della classifica?", "Conferma", JOptionPane.YES_NO_OPTION);
        String nomeFile = "Classifica.csv", nomeGiocatore, punteggio, riga;

        // Dichiarazione array
        String[] statoGiocatore;
        
        // Dichiarazione degli oggetti scrittura, lettura, costruttoreStringa e threadClick
        PrintWriter scrittura;
        BufferedReader lettura;
        StringBuilder costruttoreStringa;
        Thread threadClick;
        
        // Avviare un file audio per segnalare il click del pulsante help
        // Inizializzazione di threadClick
        threadClick = new NewThread();
        // Risettaggio del nome di threadClick
        threadClick.setName("click");
        // Rendere Daemon threadClick
        threadClick.setDaemon(true);
        // Avvio di threadClick
        threadClick.start();
        
        // Se si clicca "Yes" nel pop up aperto
        if (confermaReset == JOptionPane.YES_OPTION) {
            
            // Effettuare il reset della classifica a come quando viene visualizzata alla prima apertura del gioco
            try {
                
                // Inizializzare la variabile scrittura
                scrittura = new PrintWriter(new File(nomeFile));

                // Inizializzare l'oggetto costruttoreStringa
                costruttoreStringa = new StringBuilder(); // Ti permette di costruire una stringa
                
                // Scrivere quindi ciò che giace inizialmente in "Classifica.csv"
                costruttoreStringa.append("Giocatore");
                costruttoreStringa.append(';');
                costruttoreStringa.append("Punteggio");
                costruttoreStringa.append('\n');
                for (i = 0; i < 17; i++){
                    costruttoreStringa.append("AAA");
                    costruttoreStringa.append(';');
                    costruttoreStringa.append("0");
                    if(i < 17)  
                        costruttoreStringa.append('\n');
                }
                scrittura.write(costruttoreStringa.toString());
                
                // Chiudere il file "Classifica.csv" aperto prima in scrittura
                scrittura.close();

            }
            
            // Gestire l'assenza del file richiamato
            catch (FileNotFoundException e){
                JOptionPane.showMessageDialog(null, "File \"Classifica.csv\" assente.", "Errore", JOptionPane.ERROR_MESSAGE);
            }
            
            // Settare "" in areaClassifica
            areaClassifica.setText("");
            
            // Leggere quindi il contenuto del file "Classifica.csv" e inserirlo in areaClassifica
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

    public void letturaClassifica() {
        // Dichiarazione variabili
        String nomeGiocatore, punteggio, nomeFile = "Classifica.csv", riga;
        
        // Dichiarazione array
        String[] statoGiocatore;
        
        // Dichiarazione (e implementazione) dell'oggetto Lettore
        BufferedReader lettore;

        // Rendere visibile frameInizio
        this.setVisible(true);
        
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
                this.getAreaClassifica().append(nomeGiocatore + "\t   ");
                this.getAreaClassifica().append(punteggio + '\n');
            }
        
        // Gestire l'assenza del file richiamato    
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File \"Classifica.csv\" assente.", "Errore", JOptionPane.ERROR_MESSAGE);
            
        // Gestire l'errore di lettura/scrittura del file richiamato    
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Errore durante la lettura/scrittura del/sul file \"Classifica.csv\".", "Errore", JOptionPane.ERROR_MESSAGE);
        } 
    }
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
        
        // Dichiarazione e implementazione dell'oggetto frameInizio
        StartFrame frameInizio = new StartFrame();
        
        // Aggiornamento della classifica di gioco
        frameInizio.letturaClassifica(); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaClassifica;
    private javax.swing.JPanel classifica;
    private javax.swing.JLabel etichettaGiocatori;
    private javax.swing.JLabel etichettaPartenza;
    private javax.swing.JLabel etichettaPunteggi;
    private javax.swing.JButton help;
    private javax.swing.JButton reset;
    private javax.swing.JScrollPane scorrimentoGiocatori;
    private javax.swing.JLabel sfondoStart;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
