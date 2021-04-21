package musicplayer;

public class LibraryGUI extends javax.swing.JFrame {
    public LibraryGUI() {
        initComponents();
        this.setTitle("Library");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
     
    DoubleCircularLinkedList newPlaylist = new DoubleCircularLinkedList();
    Queue libraryList = new Queue();
    Library libraryInstance = new Library();
    Graph genresLists = new Graph();
    SongNodeDCLL temp;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgMusicGenres = new javax.swing.ButtonGroup();
        txtSingerName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInformation = new javax.swing.JTable();
        txtSongName = new javax.swing.JTextField();
        txtSongDuration = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        cbxYear = new javax.swing.JComboBox<>();
        lblLibrary = new javax.swing.JLabel();
        btnCreatePlayList = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnPlay = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        lblCurrentSong = new javax.swing.JLabel();
        btnGender = new javax.swing.JButton();
        rbtRock = new javax.swing.JRadioButton();
        rbtPop = new javax.swing.JRadioButton();
        rbtElectronic = new javax.swing.JRadioButton();
        rbtReggae = new javax.swing.JRadioButton();
        rbtSalsa = new javax.swing.JRadioButton();
        rbtMerengue = new javax.swing.JRadioButton();
        rbtInstrumental = new javax.swing.JRadioButton();
        rbtReggaeton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtSingerName.setText("Singer name");
        txtSingerName.setName("txtSingerName"); // NOI18N
        txtSingerName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSingerNameMouseClicked(evt);
            }
        });

        tblInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Singer", "Song", "Duration", "Year"
            }
        ));
        tblInformation.setCellSelectionEnabled(true);
        tblInformation.setName("tblInformation"); // NOI18N
        jScrollPane1.setViewportView(tblInformation);
        tblInformation.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        txtSongName.setText("Song name");
        txtSongName.setName("txtSongName"); // NOI18N
        txtSongName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSongNameMouseClicked(evt);
            }
        });
        txtSongName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSongNameActionPerformed(evt);
            }
        });

        txtSongDuration.setText("Duration of the song");
        txtSongDuration.setName("txtSongDuration"); // NOI18N
        txtSongDuration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSongDurationMouseClicked(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.setName("btnExit"); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        cbxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021" }));
        cbxYear.setName("cbxYear"); // NOI18N

        lblLibrary.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblLibrary.setText("Library");
        lblLibrary.setName("lblLibrary"); // NOI18N

        btnCreatePlayList.setText("Playlist + ");
        btnCreatePlayList.setName("btnCreatePlayList"); // NOI18N
        btnCreatePlayList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePlayListActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.setName("btnAdd"); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnPlay.setText("Play/Pause");
        btnPlay.setName("btnPlay"); // NOI18N
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.setName("btnNext"); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrev.setText("Prev");
        btnPrev.setName("btnPrev"); // NOI18N
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        lblCurrentSong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCurrentSong.setText("No Current Songs");

        btnGender.setText("Genders");
        btnGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenderActionPerformed(evt);
            }
        });

        rbtRock.setText("Rock");
        rbtRock.setName("rbtRock"); // NOI18N

        rbtPop.setText("Pop");
        rbtPop.setName("rbtRock"); // NOI18N

        rbtElectronic.setText("Electronic");
        rbtElectronic.setName("rbtRock"); // NOI18N

        rbtReggae.setText("Reggae");
        rbtReggae.setName("rbtRock"); // NOI18N

        rbtSalsa.setText("Salsa");
        rbtSalsa.setToolTipText("");
        rbtSalsa.setName("rbtRock"); // NOI18N

        rbtMerengue.setText("Merengue");
        rbtMerengue.setName("rbtRock"); // NOI18N

        rbtInstrumental.setText("Instrumental");
        rbtInstrumental.setName("rbtRock"); // NOI18N

        rbtReggaeton.setText("Reggaeton");
        rbtReggaeton.setName("rbtRock"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblLibrary)
                        .addGap(229, 229, 229))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(32, 32, 32))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnGender)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCreatePlayList)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExit))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rbtMerengue)
                                .addGap(18, 18, 18)
                                .addComponent(rbtPop)
                                .addGap(18, 18, 18)
                                .addComponent(rbtElectronic)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbtReggae))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rbtSalsa)
                                .addGap(13, 13, 13)
                                .addComponent(rbtRock)
                                .addGap(13, 13, 13)
                                .addComponent(rbtInstrumental)
                                .addGap(13, 13, 13)
                                .addComponent(rbtReggaeton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSongDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxYear, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSongName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSingerName))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(34, Short.MAX_VALUE)
                        .addComponent(btnPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)
                        .addGap(30, 30, 30))
                    .addComponent(lblCurrentSong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblLibrary)
                .addGap(18, 18, 18)
                .addComponent(txtSingerName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSongName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSongDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtPop)
                    .addComponent(rbtElectronic)
                    .addComponent(rbtReggae)
                    .addComponent(rbtMerengue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtSalsa)
                    .addComponent(rbtInstrumental)
                    .addComponent(rbtReggaeton)
                    .addComponent(rbtRock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lblCurrentSong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlay)
                    .addComponent(btnPrev)
                    .addComponent(btnNext))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreatePlayList)
                    .addComponent(btnExit)
                    .addComponent(btnGender))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
        new HomeScreenGUI().setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCreatePlayListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePlayListActionPerformed
        newPlaylist.IntegrarRecursivo(libraryList.head);        
    }//GEN-LAST:event_btnCreatePlayListActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Song s = new Song(txtSongName.getText(),
                txtSingerName.getText(),
                cbxYear.getSelectedItem().toString(),
                Integer.parseInt(txtSongDuration.getText()));
        addGenres(s);
        libraryList.enqueue(s);
        libraryInstance.updateTable(this.tblInformation, libraryList);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        temp = newPlaylist.head;
        lblCurrentSong.setText(temp.song.songName);

    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
     temp = temp.next;
     lblCurrentSong.setText(temp.song.songName);
        
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
     temp = temp.prev;
     lblCurrentSong.setText(temp.song.songName);
    }//GEN-LAST:event_btnPrevActionPerformed

    private void txtSingerNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSingerNameMouseClicked
        txtSingerName.setText("");
    }//GEN-LAST:event_txtSingerNameMouseClicked

    private void txtSongNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSongNameActionPerformed
        
    }//GEN-LAST:event_txtSongNameActionPerformed

    private void txtSongNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSongNameMouseClicked
        txtSongName.setText("");
    }//GEN-LAST:event_txtSongNameMouseClicked

    private void txtSongDurationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSongDurationMouseClicked
        txtSongDuration.setText("");
    }//GEN-LAST:event_txtSongDurationMouseClicked

    private void btnGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenderActionPerformed
        genresLists.fillEdges(newPlaylist);
        genresLists.printGraph();
//        new GenderClassification().setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_btnGenderActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibraryGUI().setVisible(true);
            }
        });
    }

    public void addGenres(Song songToEdit){
        SimpleStringList genreList = new SimpleStringList();
        if (this.rbtElectronic.isSelected()){
            genreList.add(this.rbtElectronic.getText());
        }
        if (this.rbtReggaeton.isSelected()){
            genreList.add(this.rbtReggaeton.getText());
        }
        if (this.rbtReggae.isSelected()){
            genreList.add(this.rbtReggae.getText());
        }
        if (this.rbtPop.isSelected()){
            genreList.add(this.rbtPop.getText());
        }
        if (this.rbtMerengue.isSelected()){
            genreList.add(this.rbtMerengue.getText());
        }
        if (this.rbtInstrumental.isSelected()){
            genreList.add(this.rbtInstrumental.getText());
        }
        if (this.rbtSalsa.isSelected()){
            genreList.add(this.rbtSalsa.getText());
        }
        if (this.rbtRock.isSelected()){
            genreList.add(this.rbtRock.getText());
        }
        songToEdit.setGenres(genreList);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgMusicGenres;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCreatePlayList;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGender;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnPrev;
    private javax.swing.JComboBox<String> cbxYear;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCurrentSong;
    private javax.swing.JLabel lblLibrary;
    private javax.swing.JRadioButton rbtElectronic;
    private javax.swing.JRadioButton rbtInstrumental;
    private javax.swing.JRadioButton rbtMerengue;
    private javax.swing.JRadioButton rbtPop;
    private javax.swing.JRadioButton rbtReggae;
    private javax.swing.JRadioButton rbtReggaeton;
    private javax.swing.JRadioButton rbtRock;
    private javax.swing.JRadioButton rbtSalsa;
    private javax.swing.JTable tblInformation;
    private javax.swing.JTextField txtSingerName;
    private javax.swing.JTextField txtSongDuration;
    private javax.swing.JTextField txtSongName;
    // End of variables declaration//GEN-END:variables
}
