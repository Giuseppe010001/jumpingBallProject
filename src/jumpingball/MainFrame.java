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
    private long velocita;
    
    // Metodo costruttore di default
    public MainFrame() {
        
        // Dichiarazione variabili
        String riga, nomeFile = "Classifica.csv";
        
        // Dichiarazione array
        String[] statoGiocatore;
        
        // Dichiarazione dell'oggetto lettura della classe BufferedReader
        BufferedReader lettura;
        
        initComponents();
        
        yPallina = pallina.getY();
        xOstacoli = granchio.getX();
        nPunti = 0;
        try {
            
            // Inizializzare l'oggetto Lettore
            lettura = new BufferedReader(new FileReader(nomeFile));
            
            // Saltare la prima riga della tabella in "Classifica.csv" ed effettuare la lettura della seconda, contenente i dati del primo classificato
            lettura.readLine();
            riga = lettura.readLine();
            
            // Dividere la riga nei campi corrispondenti separandoli rispettivamente con un punto e virgola
            statoGiocatore = riga.split(";");
                
            // Assegnare l'elemento contenuto nel secondo campo della riga a puntiRecord
            puntiRecord = Integer.parseInt(statoGiocatore[1]);
            
        // Gestire l'assenza del file richiamato    
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File \"Classifica.csv\" assente.", "Errore", JOptionPane.ERROR_MESSAGE);
            
        // Gestire l'errore di lettura/scrittura del file richiamato    
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Errore durante la lettura/scrittura del/sul file \"Classifica.csv\".", "Errore", JOptionPane.ERROR_MESSAGE);
        } 
        nVite = 3;
        velocita = 10;
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
    public int getPuntiRecord() {
        return puntiRecord;
    }
    public int getNVite() {
        return nVite;
    }
    public long getVelocita() {
        return velocita;
    }
    public JTextField getNomeGiocatore() {
        return nomeGiocatore;
    }
    public JButton getConfirm() {
        return confirm;
    }
    public JLabel getFotoRingraziamenti() {
        return fotoRingraziamenti;
    }
    public JLabel getEtichettaRingraziamenti() {
        return etichettaRingraziamenti;
    }
    public JLabel getGiuseppe() {
        return giuseppe;
    }
    public JLabel getElia(){
        return elia;
    }
    public JLabel getSousane() {
        return sousane;
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
    public void decrementoNPunti() {
        nPunti -= 20;
    }
    public void incrementoNVite() {
        nVite++;
    }
    public void decrementoNVite() {
        nVite--;
    }
    public void decrementoVelocita() {
        velocita--;
    }

    // Altri metodi
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etichettaRingraziamenti = new javax.swing.JLabel();
        giuseppe = new javax.swing.JLabel();
        elia = new javax.swing.JLabel();
        sousane = new javax.swing.JLabel();
        fotoRingraziamenti = new javax.swing.JLabel();
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

        etichettaRingraziamenti.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        etichettaRingraziamenti.setForeground(new java.awt.Color(0, 153, 255));
        etichettaRingraziamenti.setText("Da noi tre: grazie per aver giocato!!!");
        getContentPane().add(etichettaRingraziamenti, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        giuseppe.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        giuseppe.setForeground(new java.awt.Color(0, 153, 255));
        giuseppe.setText("Giuseppe Carlino");
        getContentPane().add(giuseppe, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        elia.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        elia.setForeground(new java.awt.Color(0, 153, 255));
        elia.setText("Elia Grandi");
        getContentPane().add(elia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        sousane.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        sousane.setForeground(new java.awt.Color(0, 153, 255));
        sousane.setText("Sousane Souhaib");
        getContentPane().add(sousane, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        fotoRingraziamenti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumpingball/Ringraziamenti.jpg"))); // NOI18N
        getContentPane().add(fotoRingraziamenti, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        pallina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumpingball/pallina.png"))); // NOI18N
        pallina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pallinaMouseClicked(evt);
            }
        });
        getContentPane().add(pallina, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 280, -1, -1));

        granchio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumpingball/granchio.gif"))); // NOI18N
        getContentPane().add(granchio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-64, 280, -1, -1));

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

        terrenoGioco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumpingball/terrenoDiGioco.jpg"))); // NOI18N
        getContentPane().add(terrenoGioco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        nomeGiocatore.setColumns(3);
        nomeGiocatore.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nomeGiocatore.setText("AAA");
        nomeGiocatore.setToolTipText("");
        nomeGiocatore.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomeGiocatoreKeyTyped(evt);
            }
        });
        getContentPane().add(nomeGiocatore, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 50, 30));

        confirm.setBackground(new java.awt.Color(0, 153, 255));
        confirm.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        confirm.setText("Conferma");
        confirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        getContentPane().add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 120, 30));

        etichettaInserimento.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        etichettaInserimento.setText("Inserisci nome");
        getContentPane().add(etichettaInserimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        gabbiano.setPreferredSize(new java.awt.Dimension(98, 32));
        getContentPane().add(gabbiano, new org.netbeans.lib.awtextra.AbsoluteConstraints(-98, 216, -1, -1));

        sfondoMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumpingball/sfondoPrincipale.jpg"))); // NOI18N
        getContentPane().add(sfondoMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        
        // Dichiarazione (e implementazione) variabili
        String nomeGiocatoreLetto = "", riga, punteggioLetto = "0", nomeGiocatoreCambio = "", punteggioCambio = "0", nomeFile = "Classifica.csv";
        
        // Dichiarazione array
        String[] statoGiocatore;
        
        /* 
        Dichiarazione (e implementazione) degli oggetti frameInizio, scrittura, costruttoreStringa e lettura
        */
        StartFrame frameInizio = new StartFrame();
        PrintWriter scrittura = null;
        StringBuilder costruttoreStringa;
        BufferedReader lettura;
        
        try {
            
            // Inizializzare l'oggetto Lettore
            lettura = new BufferedReader(new FileReader(nomeFile));

            // Inizializzare l'oggetto costruttoreStringa
            costruttoreStringa = new StringBuilder();
            
            // Aggiornare la classifica con la solita prima riga di testo indicativa dei dati che si vanno a leggere
            costruttoreStringa.append("Giocatore");
            costruttoreStringa.append(';');
            costruttoreStringa.append("Punteggio");
            costruttoreStringa.append('\n');
            
            // Saltare la prima riga del file "Classifica.csv"
            lettura.readLine();
            
            // Cancellare la vecchia classifica
            frameInizio.getAreaClassifica().setText("");
            
            // Leggere tante righe della tabella in "Classifica.csv" quante ce ne sono
            while((riga = lettura.readLine()) != null && nPunti < Integer.parseInt(punteggioLetto)) {
                
                // Dividere la riga nei campi corrispondneti separandoli rispettivamente con un punto e virgola
                statoGiocatore = riga.split(";");
                
                // Assegnare l'elemento contenuto nel primo campo a nomeGiocatoreLetto
                nomeGiocatoreLetto = statoGiocatore[0];
                
                // Assegnare l'elemento contenuto nel secondo campo a punteggioLetto
                punteggioLetto = statoGiocatore[1];
                    
                // Aggiungere il prossimo risultato alla classifica aggiornata
                costruttoreStringa.append(nomeGiocatoreLetto);
                costruttoreStringa.append(';');
                costruttoreStringa.append(punteggioLetto);
                costruttoreStringa.append('\n');
                
                // Inserire i valori di nomeGiocatoreLetto e punteggioLetto nell'area apposita della classifica aggiornata
                frameInizio.getAreaClassifica().append(nomeGiocatoreLetto + "\t   ");
                frameInizio.getAreaClassifica().append(punteggioLetto + '\n');
            }
            
            
            if (nPunti > Integer.parseInt(punteggioLetto)) {
                
                // Dividere la riga nei campi corrispondneti separandoli rispettivamente con un punto e virgola
                statoGiocatore = riga.split(";");
                
                // Assegnare l'elemento contenuto nel primo campo a nomeGiocatoreLetto
                nomeGiocatoreLetto = statoGiocatore[0];
                
                // Assegnare l'elemento contenuto nel secondo campo a punteggioLetto
                punteggioLetto = statoGiocatore[1];
                
                // Aggiungere il nuovo risultato alla classifica aggiornata
                costruttoreStringa.append(nomeGiocatore.getText());
                costruttoreStringa.append(';');
                costruttoreStringa.append(nPunti);
                costruttoreStringa.append('\n');
                
                // Inizializzare l'oggetto scrittura
                scrittura = new PrintWriter(new File(nomeFile));
                
                // Adattare la classifica in base al nuovo risultato aggiunto
                while ((riga = lettura.readLine()) != null) {
                    System.out.println(costruttoreStringa);

                    // Dividere la riga nei campi corrispondneti separandoli rispettivamente con un punto e virgola
                    statoGiocatore = riga.split(";");
                    
                    // Memorizzare il giocatore da spostare di una posizione in basso
                    // Memorizzare il nome da spostare di una posizione in basso
                    nomeGiocatoreCambio = nomeGiocatoreLetto;
                    // Memorizzare il punteggio da spostare di una posizione in basso
                    punteggioCambio = punteggioLetto;

                    // Effettuare la sostituzione
                    costruttoreStringa.append(nomeGiocatoreCambio);
                    costruttoreStringa.append(';');
                    costruttoreStringa.append(punteggioCambio);
                    costruttoreStringa.append('\n');
                    
                    // Assegnare l'elemento contenuto nel primo campo a nomeGiocatoreLetto
                    nomeGiocatoreLetto = statoGiocatore[0];

                    // Assegnare l'elemento contenuto nel secondo campo a punteggioLetto
                    punteggioLetto = statoGiocatore[1];
                }
                
                // Scrivere in "Classifica.csv" la nuova classifica
                scrittura.write(costruttoreStringa.toString());
                
                // Chiudere "Classifica.csv" aperto prima in scrittura
                scrittura.close();
            }
        
        // Gestire l'assenza del file richiamato    
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File \"Classifica.csv\" assente.", "Errore", JOptionPane.ERROR_MESSAGE);
            
        // Gestire l'errore di lettura/scrittura del file richiamato    
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Errore durante la lettura/scrittura del/sul file \"Classifica.csv\".", "Errore", JOptionPane.ERROR_MESSAGE);
        }
        
        // Aggiornamento della classifica
        frameInizio.letturaClassifica();

        // Rendere visibile frameInizio
        frameInizio.setVisible(true);
        
        // Chiudere un oggetto di tipo MainFrame
        dispose();
    }//GEN-LAST:event_confirmActionPerformed

    private void pallinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pallinaMouseClicked
        
        // Se la pallina si trova a terra
        if (pallina.getY() == 280) {
            
            // Dichiarazione degli oggetti threadPallina e threadSalto
            NewThread threadPallina, threadSalto;

            // Permettere alla pallina di saltare
            // Inizializzazione di threadPallina
            threadPallina = new NewThread(this);
            // Risettaggio del nome di threadPallina
            threadPallina.setName("pallina");
            // Rendere Daemon threadPallina
            threadPallina.setDaemon(true);
            // Avvio di threadPallina
            threadPallina.start();

            // Emettere un suono in grado di imitare il rimbalzo di una pallina
            // Inizializzazione di threadPallina
            threadSalto = new NewThread();
            // Risettaggio del nome di threadSalto
            threadSalto.setName("salto");
            // Rendere Daemon threadSalto
            threadSalto.setDaemon(true);
            // Avvio di threadSalto
            threadSalto.start();
        }
    }//GEN-LAST:event_pallinaMouseClicked

    private void nomeGiocatoreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeGiocatoreKeyTyped
        
        // Inserire un massimo di tre caratteri per l'inserimento del nome
        if (nomeGiocatore.getText().length() == 3)
            evt.consume();
    }//GEN-LAST:event_nomeGiocatoreKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirm;
    private javax.swing.JLabel elia;
    private javax.swing.JLabel etichettaInserimento;
    private javax.swing.JLabel etichettaRingraziamenti;
    private javax.swing.JLabel fotoRingraziamenti;
    private javax.swing.JLabel gabbiano;
    private javax.swing.JLabel giuseppe;
    private javax.swing.JLabel granchio;
    private javax.swing.JTextField nomeGiocatore;
    private javax.swing.JLabel pallina;
    private javax.swing.JLabel punteggio;
    private javax.swing.JLabel recordMassimo;
    private javax.swing.JLabel sfondoMain;
    private javax.swing.JLabel sousane;
    private javax.swing.JLabel terrenoGioco;
    private javax.swing.JLabel vite;
    // End of variables declaration//GEN-END:variables
}
