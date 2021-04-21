package musicplayer;

import musicplayer.GraphModule.Graph;

public class GenderClassificationGUI extends javax.swing.JFrame {
    public GenderClassificationGUI() {
        initComponents();
        this.setTitle("Genders");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    public void loadGenres(Graph genresLists){
        this.setVisible(true);
        txpMerengue.setText(genresLists.vertices[0].printList());
        txpPop.setText(genresLists.vertices[1].printList());
        txpElectronic.setText(genresLists.vertices[2].printList());
        txpReggae.setText(genresLists.vertices[3].printList());
        txpSalsa.setText(genresLists.vertices[4].printList());
        txpRock.setText(genresLists.vertices[5].printList());
        txpInstrumental.setText(genresLists.vertices[6].printList());
        txpReggaeton.setText(genresLists.vertices[7].printList());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txpMerengue = new javax.swing.JTextPane();
        lblMerengue = new javax.swing.JLabel();
        lblPop = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txpPop = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txpReggae = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txpElectronic = new javax.swing.JTextPane();
        lblElectronic = new javax.swing.JLabel();
        lblReggae = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txpRock = new javax.swing.JTextPane();
        lblSalsa = new javax.swing.JLabel();
        lblRock = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txpSalsa = new javax.swing.JTextPane();
        lblReggaeton = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txpInstrumental = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        txpReggaeton = new javax.swing.JTextPane();
        lblInstrumental = new javax.swing.JLabel();
        lblLibrary = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(txpMerengue);

        lblMerengue.setText("Merengue");

        lblPop.setText("Pop");

        jScrollPane2.setViewportView(txpPop);

        jScrollPane3.setViewportView(txpReggae);

        jScrollPane4.setViewportView(txpElectronic);

        lblElectronic.setText("Electronic");

        lblReggae.setText("Reggae");

        jScrollPane5.setViewportView(txpRock);

        lblSalsa.setText("Salsa");

        lblRock.setText("Rock");

        jScrollPane6.setViewportView(txpSalsa);

        lblReggaeton.setText("Reggaeton");

        jScrollPane7.setViewportView(txpInstrumental);

        jScrollPane8.setViewportView(txpReggaeton);

        lblInstrumental.setText("Instrumental");

        lblLibrary.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblLibrary.setText("Genres Classification");
        lblLibrary.setName("lblLibrary"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblLibrary)
                .addGap(134, 134, 134))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane8)
                    .addComponent(jScrollPane7)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMerengue)
                            .addComponent(lblPop)
                            .addComponent(lblElectronic)
                            .addComponent(lblReggae)
                            .addComponent(lblSalsa)
                            .addComponent(lblRock)
                            .addComponent(lblInstrumental)
                            .addComponent(lblReggaeton))
                        .addGap(0, 403, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblLibrary)
                .addGap(27, 27, 27)
                .addComponent(lblMerengue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblElectronic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblReggae)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSalsa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblRock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblInstrumental)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblReggaeton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenderClassificationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblElectronic;
    private javax.swing.JLabel lblInstrumental;
    private javax.swing.JLabel lblLibrary;
    private javax.swing.JLabel lblMerengue;
    private javax.swing.JLabel lblPop;
    private javax.swing.JLabel lblReggae;
    private javax.swing.JLabel lblReggaeton;
    private javax.swing.JLabel lblRock;
    private javax.swing.JLabel lblSalsa;
    private javax.swing.JTextPane txpElectronic;
    private javax.swing.JTextPane txpInstrumental;
    private javax.swing.JTextPane txpMerengue;
    private javax.swing.JTextPane txpPop;
    private javax.swing.JTextPane txpReggae;
    private javax.swing.JTextPane txpReggaeton;
    private javax.swing.JTextPane txpRock;
    private javax.swing.JTextPane txpSalsa;
    // End of variables declaration//GEN-END:variables
}
