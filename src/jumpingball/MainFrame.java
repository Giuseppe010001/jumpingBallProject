/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jumpingball;

import java.io.BufferedReader; // Importare la classe BufferedReader
import java.io.File; // Importare la classe File
import java.io.FileNotFoundException; // Importare la classe FileNotFoundException
import java.io.FileReader; // Importare la classe FileReader
import java.io.IOException; // Importare la classe IOException
import java.io.PrintWriter; // Importare la classe PrintWriter
import javax.swing.JButton; // Importare la classe JButton
import javax.swing.JLabel; // Importare la classe JLabel
import javax.swing.JOptionPane; // Importare la classe JOptionPane
import javax.swing.JTextField; // Importare la classe JTextField

/**
 *
 * @author 39327
 */
public class MainFrame extends javax.swing.JFrame {
    
    // Dichiarazione attributi
    private int yPallina, xOstacoli, nPunti, nVite, puntiRecord;
    private long velocitaMovimento;
    
    // Metodo costruttore di default
    public MainFrame() {
        initComponents();
        yPallina = pallina.getY();
        xOstacoli = granchio.getX();
        nPunti = puntiRecord = 0;
        nVite = 3;
        velocitaMovimento = 10;
    }
    
    // Metodi getters
    public JLabel getPallina() {
        return pallina;
    }
    public JLabel getGranchio() {
        return granchio;
    }
    public JLabel getGabbiano() {
        return gabbiano;
    }
    public JLabel getPunteggio() {
        return punteggio;
    }
    public JLabel getVite() {
        return vite;
    }
    public JLabel getRecordMassimo() {
        return recordMassimo;
    }
    public JLabel getEtichettaInserimento() {
        return etichettaInserimento;
    }
    public int getYPallina() {
        return yPallina;
    }
    public int getXOstacoli() {
        return xOstacoli;
    }
    public int getNPunti() {
        return nPunti;
    }
    public int getNVite() {
        return nVite;
    }
    public int getPuntiRecord() {
        return puntiRecord;
    }
    public long getVelocitaMovimento() {
        return velocitaMovimento;
    }
    public JTextField getNomeGiocatore() {
        return nomeGiocatore;
    }
    public JButton getConfirm() {
        return confirm;
    }
    
    // Metodi setters
    public void incrementoYPallina(int gravita) {
        yPallina += gravita;
    }
    public void decrementoYPallina(int gravita) {
        yPallina -= gravita;
    }
    public void incrementoXOstacoli() {
        xOstacoli += 4;
    }
    public void decrementoXOstacoli() {
        xOstacoli -= 4;
    }
    public void ripristinoXOstacoliAvanti() {
        xOstacoli = -64;
    }
    public void ripristinoXOstacoliIndietro() {
        xOstacoli = 600;
    }
    public void incrementoNPunti() {
        nPunti += 20;
    }
    public void incrementoNVite() {
        nVite++;
    }
    public void decrementoNVite() {
        nVite--;
    }
    public void decrementoVelocitaMovimento() {
        velocitaMovimento--;
    }

    // Altri metodi
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pallina = new javax.swing.JLabel();
        granchio = new javax.swing.JLabel();
        recordMassimo = new javax.swing.JLabel();
        punteggio = new javax.swing.JLabel();
        vite = new javax.swing.JLabel();
        terrenoGioco = new javax.swing.JLabel();
        nomeGiocatore = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        etichettaInserimento = new javax.swing.JLabel();
        gabbiano = new javax.swing.JLabel();
        sfondoMain = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jumping Ball");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pallina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumpingball/Pallina.png"))); // NOI18N
        pallina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pallinaMouseClicked(evt);
            }
        });
        getContentPane().add(pallina, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 280, -1, -1));

        granchio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumpingball/Granchio.gif"))); // NOI18N
        getContentPane().add(granchio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        recordMassimo.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        recordMassimo.setForeground(new java.awt.Color(0, 153, 255));
        recordMassimo.setPreferredSize(new java.awt.Dimension(120, 50));
        getContentPane().add(recordMassimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 210, 20));

        punteggio.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        punteggio.setForeground(new java.awt.Color(0, 153, 255));
        punteggio.setPreferredSize(new java.awt.Dimension(120, 50));
        getContentPane().add(punteggio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 200, 20));

        vite.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        vite.setForeground(new java.awt.Color(0, 153, 255));
        vite.setPreferredSize(new java.awt.Dimension(120, 50));
        getContentPane().add(vite, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 180, 20));

        terrenoGioco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumpingball/Terreno di gioco.jpg"))); // NOI18N
        getContentPane().add(terrenoGioco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        nomeGiocatore.setText("AAA");
        getContentPane().add(nomeGiocatore, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 160, 30));

        confirm.setBackground(new java.awt.Color(0, 153, 255));
        confirm.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        confirm.setText("Conferma");
        confirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        getContentPane().add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 120, 30));

        etichettaInserimento.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        etichettaInserimento.setText("Inserisci nome");
        getContentPane().add(etichettaInserimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        gabbiano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumpingball/gabbiano.gif"))); // NOI18N
        gabbiano.setPreferredSize(new java.awt.Dimension(64, 64));
        getContentPane().add(gabbiano, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 164, 270, 110));

        sfondoMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumpingball/Sfondo Principale.jpg"))); // NOI18N
        getContentPane().add(sfondoMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, -10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        
        // Dichiarazione variabili
        String nomeGiocatore, riga, punteggio, nomeFile = "Classifica.csv";
        
        // Dichiarazione array
        String[] statoGiocatore;
        
        // Dichiarazione e implementazione dell'oggetto frameInizio della classe StartFrame e sola dichiarazione dell'oggetto lettore della classe BufferedReader
        StartFrame frameInizio = new StartFrame();
        BufferedReader lettore;

        /*
        try{

            PrintWriter writer = new PrintWriter(new File(nomeFile));
            
            writer.write("ciao");
            
            StringBuilder sb = new StringBuilder();
            sb.append("id");
            sb.append(',');
            sb.append("Name");
            sb.append(',');
            sb.append("Address");
            sb.append('\n');

            sb.append("101");
            sb.append(',');
            sb.append("John Doe");
            sb.append(',');
            sb.append("Las Vegas");
            sb.append('\n');

            writer.write(sb.toString());
            writer.close();
            System.out.println("done!");

        }catch (FileNotFoundException e){
            
            System.out.println(e.getMessage());
         } */
        
        try {
            
            // Inizializzare l'oggetto Lettore
            lettore = new BufferedReader(new FileReader(nomeFile));
            
            // Saltare la prima riga della tabella in "Classifica.csv" per evitare la lettura dei valori indesiderati presenti in questa
            lettore.readLine();
            
            // Leggere tante righe della tabella in "Classifica.csv" quante ce ne sono
            while((riga = lettore.readLine()) != null) {
                
                // Dividere la riga nei campi corrispondneti separandoli rispettivamente con un punto e virgola
                statoGiocatore = riga.split(";");
                
                // Assegnare l'elemento contenuto nel primo campo a nomeGiocatore
                nomeGiocatore = statoGiocatore[0];
                
                // Assegnare l'elemento contenuto nel secondo campo a punteggio
                punteggio = statoGiocatore[1];
                
                // Inserire i valori di nomeGiocatore e punteggio nelle apposite aree della classifica
                frameInizio.getAreaGiocatori().append(nomeGiocatore + '\n');
                frameInizio.getAreaPunteggi().append(punteggio + '\n');
            }
        
        // Gestire l'assenza del file richiamato    
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File \"Classifica.csv\" assente.", "Errore", JOptionPane.ERROR_MESSAGE);
            
        // Gestire l'errore di lettura/scrittura del file richiamato    
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Errore durante la lettura/scrittura del/sul file \"Classifica.csv\".", "Errore", JOptionPane.ERROR_MESSAGE);
        } 

        // Rendere visibile frameInizio
        frameInizio.setVisible(true);
        
        // Chiudere un oggetto di tipo MainFrame
        dispose();
    }//GEN-LAST:event_confirmActionPerformed

    private void pallinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pallinaMouseClicked
        if (pallina.getY() == 280) {
            NewThread threadPallina, threadSalto;

            threadPallina = new NewThread(this);
            threadPallina.setName("pallina");
            threadPallina.start();

            threadSalto = new NewThread();
            threadSalto.setName("salto");
            threadSalto.start();
        }
    }//GEN-LAST:event_pallinaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirm;
    private javax.swing.JLabel etichettaInserimento;
    private javax.swing.JLabel gabbiano;
    private javax.swing.JLabel granchio;
    private javax.swing.JTextField nomeGiocatore;
    private javax.swing.JLabel pallina;
    private javax.swing.JLabel punteggio;
    private javax.swing.JLabel recordMassimo;
    private javax.swing.JLabel sfondoMain;
    private javax.swing.JLabel terrenoGioco;
    private javax.swing.JLabel vite;
    // End of variables declaration//GEN-END:variables
}
