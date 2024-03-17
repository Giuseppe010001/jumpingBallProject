/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jumpingball;

import java.awt.Color; // Importare la classe Color
import java.awt.Cursor; // Importare
import java.awt.Desktop; // Importare la classe Desktop
import java.io.IOException; // Importare la classe IOException
import java.net.URI; // Importare la classe URI
import java.net.URISyntaxException; // Importare la classe URISyntaxException
import javax.swing.JOptionPane; // Importare la classe JOptionPane

/**
 *
 * @author 39327
 */
public class HelpFrame extends javax.swing.JFrame {
    
    // Dichiarazione attributi
    private Color coloreLink;

    // Metodi costruttori
    public HelpFrame() {
        initComponents();
    }

    // Altri metodi
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guida = new javax.swing.JPanel();
        scorrimentoGuida = new javax.swing.JScrollPane();
        areaGuida = new javax.swing.JTextArea();
        etichettaGuida = new javax.swing.JLabel();
        collegamentoGuida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Jumping Ball");
        setResizable(false);

        guida.setBackground(new java.awt.Color(153, 255, 255));

        areaGuida.setEditable(false);
        areaGuida.setBackground(new java.awt.Color(204, 153, 255));
        areaGuida.setColumns(24);
        areaGuida.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        areaGuida.setRows(47);
        areaGuida.setText("Non appena si avvia il gioco, \nquest’ultimo si presenta in tale modo, \ncon una finestra rappresentante \nuna classifica in posizione centrale \nche contiene i migliori 17 giocatori. \nSotto questa classifica \ngiace il tasto \"Start\" che,\nuna volta cliccato,\npermette di avviare il gioco.\n\nTramite la pressione del pulsante \nche raffigura il cestino \nin basso a destra, \nè possibile resettare la \nclassifica generale\ndel gioco dopo aver cliccato su “Yes”.\n\nInvece premendo il pulsante\nraffigurante\nil punto interrogativo, sempre in basso \na destra ma stavolta \na destra del cestino, \nè possibile visualizzare la finestra \ndella guida che spiega \nle istruzioni d’uso \ndi Jumping Ball.\n\nUna volta premuto il pulsante Start \nnella finestra iniziale,\nil gioco incomincia dopo un countdown \ndella durata di tre secondi. \nSubito dopo il conto alla rovescia,\nviene visualizzata la \nschermata di gioco. \nInoltre, per permettere \nalla pallina di saltare, \nbisogna semplicemente cliccarla \nuna volta sola quando quest’ultima \nsi trova a terra.\n\nNel caso il giocatore fosse \ncosì scarso \nda perdere in tempi \nrelativamente brevi, \nsarebbe costretto a \ninserire un nickname per \nregistrare il suo \npunteggio in classifica.\nDopo tale inserimento e \nuna volta cliccato\nsu \"Conferma\",\nsi ritorna nella schermata iniziale.");
        scorrimentoGuida.setViewportView(areaGuida);

        etichettaGuida.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        etichettaGuida.setText("Guida");

        javax.swing.GroupLayout guidaLayout = new javax.swing.GroupLayout(guida);
        guida.setLayout(guidaLayout);
        guidaLayout.setHorizontalGroup(
            guidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guidaLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(guidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scorrimentoGuida, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etichettaGuida))
                .addGap(24, 24, 24))
        );
        guidaLayout.setVerticalGroup(
            guidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guidaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(etichettaGuida, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scorrimentoGuida, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        collegamentoGuida.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        collegamentoGuida.setForeground(new java.awt.Color(204, 153, 255));
        collegamentoGuida.setText("<html><span style = \"text-decoration: underline\">Guida estesa<span/><html/>");
        collegamentoGuida.setPreferredSize(new java.awt.Dimension(104, 28));
        collegamentoGuida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collegamentoGuidaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                collegamentoGuidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                collegamentoGuidaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collegamentoGuidaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collegamentoGuidaMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(guida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(collegamentoGuida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(guida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(collegamentoGuida, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void collegamentoGuidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collegamentoGuidaMouseClicked
        
        // Dichiarazione dell'oggetto threadClick
        NewThread threadClick;
        
        // Avviare un file audio per segnalare il click del pulsante help
        // Inizializzazione di threadClick
        threadClick = new NewThread();
        // Risettaggio del nome di threadClick
        threadClick.setName("click");
        // Rendere Daemon threadClick
        threadClick.setDaemon(true);
        // Avvio di threadClick
        threadClick.start();
        
        /*
        Creare un collegamento ipertestuale a "https://github.com/Giuseppe010001/jumpingBallProject/blob/master/JumpingBall%20-%20Guida.pdf"
        per permettere la visualizzazione della guida estesa presente online
        */
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI("https://github.com/Giuseppe010001/jumpingBallProject/blob/master/JumpingBall%20-%20Guida.pdf"));
            } catch (IOException | URISyntaxException ex) {
                JOptionPane.showMessageDialog(null, "Errore durante la lettura/scrittura della/sulla guida estesa.", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_collegamentoGuidaMouseClicked

    private void collegamentoGuidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collegamentoGuidaMouseEntered
        
        // Memorizzare il colore appartenente al testo
        coloreLink = collegamentoGuida.getForeground();
        
        // Settare il testo di colore blu
        collegamentoGuida.setForeground(Color.BLUE);
        
        // Settare la manina come fantasia del cursore
        collegamentoGuida.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_collegamentoGuidaMouseEntered

    private void collegamentoGuidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collegamentoGuidaMouseExited
        
        // Settare il testo del colore di coloreLink
        collegamentoGuida.setForeground(coloreLink);
    }//GEN-LAST:event_collegamentoGuidaMouseExited

    private void collegamentoGuidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collegamentoGuidaMousePressed
        
        // Settare il testo di colore bianco
        collegamentoGuida.setForeground(Color.WHITE);
    }//GEN-LAST:event_collegamentoGuidaMousePressed

    private void collegamentoGuidaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collegamentoGuidaMouseReleased
        
        // Settare il testo del colore di coloreLink
        collegamentoGuida.setForeground(coloreLink);
    }//GEN-LAST:event_collegamentoGuidaMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaGuida;
    private javax.swing.JLabel collegamentoGuida;
    private javax.swing.JLabel etichettaGuida;
    private javax.swing.JPanel guida;
    private javax.swing.JScrollPane scorrimentoGuida;
    // End of variables declaration//GEN-END:variables
}
