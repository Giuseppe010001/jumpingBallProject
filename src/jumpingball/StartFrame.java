/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 *
 * Developed by Giuseppe Carlino, Elia Grandi & Sousane Souhaib
 */
package jumpingball;

import java.awt.Color; // Importare la classe Color
import java.awt.Image; // Importare la classe Image
import java.io.File; // Importare la classe File
import java.io.FileNotFoundException; // Importare la classe FileNotFoundException 
import java.io.FileReader; // Importare la classe FileReader
import java.io.BufferedReader; // Importare la classe BufferedReader
import java.io.IOException; // Importare la classe IOException 
import java.io.PrintWriter; // Importare la classe PrintWriter
import javax.swing.ImageIcon; // Importare la classe ImageIcon
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
    
    // Dichiarazione attributi
    private static final Color pulsanteEntrata = new Color(0, 255, 255), pulsanteUscita = new Color(0, 153, 255), pulsantePremuto = new Color(0, 51, 255);

    // Metodi costruttori
    public StartFrame() {
        initComponents();
        
        // Dichiarazione ed implementazione dell'oggetto icona della classe Image
        Image icona = new ImageIcon(this.getClass().getResource("JumpingBall.png")).getImage();
        
        // Settaggio dell'icona di un qualsiasi oggetto StartFrame
        this.setIconImage(icona);
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
        etichettaPosizioni = new javax.swing.JLabel();
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
        start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                startMousePressed(evt);
            }
        });
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        getContentPane().add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 90, 30));

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

        etichettaPosizioni.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        etichettaPosizioni.setText("Posizione");

        javax.swing.GroupLayout classificaLayout = new javax.swing.GroupLayout(classifica);
        classifica.setLayout(classificaLayout);
        classificaLayout.setHorizontalGroup(
            classificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(classificaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etichettaPosizioni, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etichettaGiocatori, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etichettaPunteggi)
                .addContainerGap())
            .addComponent(scorrimentoGiocatori, javax.swing.GroupLayout.Alignment.LEADING)
        );
        classificaLayout.setVerticalGroup(
            classificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, classificaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(classificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etichettaGiocatori)
                    .addComponent(etichettaPunteggi, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etichettaPosizioni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scorrimentoGiocatori, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(classifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 270, 270));

        reset.setBackground(new java.awt.Color(0, 153, 255));
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumpingball/reset.png"))); // NOI18N
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset.setPreferredSize(new java.awt.Dimension(38, 38));
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resetMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                resetMousePressed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 387, -1, -1));

        help.setBackground(new java.awt.Color(0, 153, 255));
        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumpingball/help.png"))); // NOI18N
        help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        help.setPreferredSize(new java.awt.Dimension(38, 38));
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                helpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                helpMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                helpMousePressed(evt);
            }
        });
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
        // Avvio di threadClick
        threadClick.start();
        
        // Settare il colore di sfondo del pannello principale contenuto in frameAiuto
        frameAiuto.getContentPane().setBackground(new Color(0, 102, 255));
        
        // Rendere visibile frameAiuto
        frameAiuto.setVisible(true);
    }//GEN-LAST:event_helpActionPerformed
                   
    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        
        // Dichiarazione variabili
        int i, confermaReset = JOptionPane.showConfirmDialog(null, "Vuoi confermare il reset della classifica?", "Conferma", JOptionPane.YES_NO_OPTION), posizione = 1;
        String nomeGiocatore, punteggio, costruttoreRiga = "", riga, nomeFile = "Classifica.csv";

        // Dichiarazione array
        String[] statoGiocatore;
        
        // Dichiarazione degli oggetti scrittura, lettura e threadClick
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
        
        // Se si clicca "Yes" nel pop up aperto
        if (confermaReset == JOptionPane.YES_OPTION) {
            
            // Effettuare il reset della classifica a come quando viene visualizzata alla prima apertura del gioco
            try {
                
                // Inizializzare la variabile scrittura
                scrittura = new PrintWriter(new File(nomeFile));
                
                // Scrivere quindi ciò che giace inizialmente in "Classifica.csv"
                costruttoreRiga += "Giocatore;Punteggio\n";
                for (i = 0; i < 17; i++){
                    costruttoreRiga += "AAA;0\n";
                }
                scrittura.write(costruttoreRiga);
                
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

                    // Inserire i valori di posizione, nomeGiocatore e punteggio nell'area apposita della classifica
                    areaClassifica.append(posizione + "°\t     ");
                    areaClassifica.append(nomeGiocatore + "\t          ");
                    areaClassifica.append(punteggio + '\n');
                    
                    // Incrementare di 1 posizione
                    posizione++;
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

    private void startMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMouseEntered
        start.setBackground(pulsanteEntrata);
    }//GEN-LAST:event_startMouseEntered

    private void startMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMouseExited
        start.setBackground(pulsanteUscita);
    }//GEN-LAST:event_startMouseExited

    private void startMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMousePressed
        start.setBackground(pulsantePremuto);
    }//GEN-LAST:event_startMousePressed

    private void resetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseEntered
        reset.setBackground(pulsanteEntrata);
    }//GEN-LAST:event_resetMouseEntered

    private void resetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseExited
        reset.setBackground(pulsanteUscita);
    }//GEN-LAST:event_resetMouseExited

    private void resetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMousePressed
        reset.setBackground(pulsantePremuto);
    }//GEN-LAST:event_resetMousePressed

    private void helpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseEntered
        help.setBackground(pulsanteEntrata);
    }//GEN-LAST:event_helpMouseEntered

    private void helpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseExited
        help.setBackground(pulsanteUscita);
    }//GEN-LAST:event_helpMouseExited

    private void helpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMousePressed
        help.setBackground(pulsantePremuto);
    }//GEN-LAST:event_helpMousePressed

    // Metodo di tipo void finalizzato ad effettuare la lettura del file "classifica.csv"
    public void letturaClassifica() {
        
        // Dichiarazione variabili
        int posizione = 1;
        String nomeGiocatore, punteggio, riga, nomeFile = "Classifica.csv";
        
        // Dichiarazione array
        String[] statoGiocatore;
        
        // Dichiarazione (e implementazione) dell'oggetto Lettore
        BufferedReader lettore;
        
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
                
                // Inserire i valori di posizione, nomeGiocatore e punteggio nell'area apposita della classifica
                this.getAreaClassifica().append(posizione + "°\t     ");
                this.getAreaClassifica().append(nomeGiocatore + "\t          ");
                this.getAreaClassifica().append(punteggio + '\n');
                
                // Incrementare di 1 posizione
                posizione++;
            }
        
        // Gestire l'assenza del file richiamato    
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File \"Classifica.csv\" assente.", "Errore", JOptionPane.ERROR_MESSAGE);
            
        // Gestire l'errore di lettura/scrittura del file richiamato    
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Errore durante la lettura/scrittura del/sul file \"Classifica.csv\".", "Errore", JOptionPane.ERROR_MESSAGE);
        }
        
        // Rendere visibile frameInizio
        this.setVisible(true);
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
    private javax.swing.JLabel etichettaPosizioni;
    private javax.swing.JLabel etichettaPunteggi;
    private javax.swing.JButton help;
    private javax.swing.JButton reset;
    private javax.swing.JScrollPane scorrimentoGiocatori;
    private javax.swing.JLabel sfondoStart;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}