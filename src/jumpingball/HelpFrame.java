/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jumpingball;

/**
 *
 * @author 39327
 */
public class HelpFrame extends javax.swing.JFrame {

    // Metodo costruttore di default
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Jumping Ball");
        setResizable(false);

        guida.setBackground(new java.awt.Color(153, 255, 255));

        areaGuida.setEditable(false);
        areaGuida.setBackground(new java.awt.Color(204, 153, 255));
        areaGuida.setColumns(22);
        areaGuida.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        areaGuida.setRows(100);
        areaGuida.setText("Non appena si avvia il gioco, \nquest’ultimo si presenta in tale modo, \ncon una finestra rappresentante \nuna classifica in posizione centrale \nche contiene i migliori 17 giocatori. \nSotto questa classifica \ngiace il tasto Start che, una volta cliccato,\npermette di avviare il gioco.\n\nTramite la pressione del pulsante \nche raffigura il cestino in basso a destra, \nè possibile resettare la classifica generale\ndel gioco dopo aver cliccato su “Yes”.\n\nInvece premendo il pulsante raffigurante\nil punto interrogativo, sempre in basso \na destra ma stavolta a destra del cestino, \nè possibile visualizzare la finestra \ndella guida che spiega le istruzioni d’uso \ndel videogioco.\n\nUna volta premuto il pulsante Start\nnella finestra iniziale, \nil gioco incomincia dopo un countdown \ndella durata di circa tre secondi. \nSubito dopo il conto alla rovescia, \nviene visualizzata la schermata di gioco.\n\nNel caso il giocatore fosse così scarso \nda perdere in tempi relativamente brevi, \nsarebbe costretto a inserire un nickname \nper registrare il suo punteggio in classifica.\nDopo tale inserimento e una volta cliccato\nsu Conferma, si ritorna nella schermata\niniziale.");
        scorrimentoGuida.setViewportView(areaGuida);

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel1.setText("Guida");

        javax.swing.GroupLayout guidaLayout = new javax.swing.GroupLayout(guida);
        guida.setLayout(guidaLayout);
        guidaLayout.setHorizontalGroup(
            guidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guidaLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(guidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scorrimentoGuida, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(24, 24, 24))
        );
        guidaLayout.setVerticalGroup(
            guidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guidaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scorrimentoGuida, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(guida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(guida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaGuida;
    private javax.swing.JPanel guida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane scorrimentoGuida;
    // End of variables declaration//GEN-END:variables
}
