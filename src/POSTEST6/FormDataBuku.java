/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTEST7;

/**
 *
 * @author X455LA
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class FormDataBuku extends javax.swing.JFrame {

    /**
     * Creates new form FormDataBuku
     */
    private DefaultTableModel model;
    private final Connection con = koneksi.getConnection();
    private Statement stt;
    private ResultSet rss;
    
    
    public FormDataBuku() {
        initComponents();
    }
    
    void InitTable(){
    model = new DefaultTableModel();
    model.addColumn("ID BUKU");
    model.addColumn("Judul");
    model.addColumn("Penulis");
    model.addColumn("Harga");
    TBuku.setModel(model);
    } 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        PDasar = new javax.swing.JPanel();
        PKonten = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CBPenulis = new javax.swing.JComboBox<>();
        TFJudul = new javax.swing.JTextField();
        TFHarga = new javax.swing.JTextField();
        PTombol = new javax.swing.JPanel();
        BSave = new javax.swing.JButton();
        BEdit = new javax.swing.JButton();
        BHapus = new javax.swing.JButton();
        BExit = new javax.swing.JButton();
        PPencarian = new javax.swing.JPanel();
        TFPencarian = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BCari = new javax.swing.JButton();
        CBBy = new javax.swing.JComboBox<>();
        PHeader = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        PTable = new javax.swing.JPanel();
        PBuku = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBuku = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PDasar.setBackground(new java.awt.Color(102, 102, 102));

        PKonten.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel1.setText("JUDUL");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel2.setText("PENULIS");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel3.setText("HARGA");

        CBPenulis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tere Liye", "Raditya Dika", "Habiburrahman", "Asma Nadia", "Marga Ti" }));

        PTombol.setLayout(new java.awt.GridLayout(1, 0));

        BSave.setText("Save");
        BSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSaveActionPerformed(evt);
            }
        });
        PTombol.add(BSave);

        BEdit.setText("Edit");
        BEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEditActionPerformed(evt);
            }
        });
        PTombol.add(BEdit);

        BHapus.setText("Hapus");
        BHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHapusActionPerformed(evt);
            }
        });
        PTombol.add(BHapus);

        BExit.setText("Exit");
        BExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BExitMouseClicked(evt);
            }
        });
        PTombol.add(BExit);

        javax.swing.GroupLayout PKontenLayout = new javax.swing.GroupLayout(PKonten);
        PKonten.setLayout(PKontenLayout);
        PKontenLayout.setHorizontalGroup(
            PKontenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PKontenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PKontenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(PKontenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CBPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFHarga)
                    .addComponent(PTombol, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(TFJudul))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PKontenLayout.setVerticalGroup(
            PKontenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PKontenLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(PKontenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(PKontenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CBPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(PKontenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PTombol, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PPencarian.setBackground(new java.awt.Color(153, 204, 255));

        jLabel4.setText("Search");

        BCari.setText("Cari");
        BCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCariActionPerformed(evt);
            }
        });

        CBBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "judul", "penulis", "harga" }));

        javax.swing.GroupLayout PPencarianLayout = new javax.swing.GroupLayout(PPencarian);
        PPencarian.setLayout(PPencarianLayout);
        PPencarianLayout.setHorizontalGroup(
            PPencarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPencarianLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(CBBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BCari)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        PPencarianLayout.setVerticalGroup(
            PPencarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPencarianLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PPencarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(CBBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BCari))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        PHeader.setBackground(new java.awt.Color(51, 255, 255));

        jLabel5.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel5.setText("Form Data Buku");

        javax.swing.GroupLayout PHeaderLayout = new javax.swing.GroupLayout(PHeader);
        PHeader.setLayout(PHeaderLayout);
        PHeaderLayout.setHorizontalGroup(
            PHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(30, 30, 30))
        );
        PHeaderLayout.setVerticalGroup(
            PHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PHeaderLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PTable.setLayout(new java.awt.CardLayout());

        TBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "judul", "Title 3", "Title 4"
            }
        ));
        TBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBuku);

        javax.swing.GroupLayout PBukuLayout = new javax.swing.GroupLayout(PBuku);
        PBuku.setLayout(PBukuLayout);
        PBukuLayout.setHorizontalGroup(
            PBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBukuLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        PBukuLayout.setVerticalGroup(
            PBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBukuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PTable.add(PBuku, "card3");

        javax.swing.GroupLayout PDasarLayout = new javax.swing.GroupLayout(PDasar);
        PDasar.setLayout(PDasarLayout);
        PDasarLayout.setHorizontalGroup(
            PDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PDasarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PDasarLayout.createSequentialGroup()
                        .addComponent(PTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(PDasarLayout.createSequentialGroup()
                        .addComponent(PPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PDasarLayout.createSequentialGroup()
                        .addGroup(PDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PKonten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        PDasarLayout.setVerticalGroup(
            PDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PDasarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PKonten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PDasar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PDasar, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        InitTable();
        TampilData();
    }//GEN-LAST:event_formComponentShown
    /*event untuk menjalankan fungsi tambahData*/
    private void BSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSaveActionPerformed
        // TODO add your handling code here:
        /*mendeklarasikan variable yang akan di butuhkan untuk menjadi parameter di fungsi tambahdata*/
        String id= TBuku.getValueAt(baris, 0).toString();
        String judul = TFJudul.getText();
        String penulis = CBPenulis.getSelectedItem().toString();
        String harga = TFHarga.getText();
        
        TambahData(judul, penulis, harga);//menjalankan fungsi tambah data sesuai dengan apa yang di inputkan di form
        InitTable();//menjalankan method initTable untuk meload ulang model
        TampilData();// untuk menampilkan isi database berdasarkan modelnya
    }//GEN-LAST:event_BSaveActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        TFJudul.setText("");
        TFHarga.setText("");
        TFPencarian.setText("");
    }//GEN-LAST:event_formWindowOpened

    private void BExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BExitMouseClicked
        // TODO add your handling code here:
         int pilihan = JOptionPane.showConfirmDialog(this,"Apa anda yakin ingin Keluar","Keluar???",JOptionPane.YES_NO_OPTION);
        if (pilihan==0) {
            System.exit(0);
        }
        
    }//GEN-LAST:event_BExitMouseClicked
    /*fungsi untuk Hapus data dengan parameter judul*/
    private boolean HapusData(String id){
        try {
            String sql="delete from buku where id='"+id+";";//mendeklarasikan querynya dengan fungsi delete
            /* pembentukan steatment dan eksekusi query*/
            stt = con.createStatement();
            stt.executeUpdate(sql);
            return true; 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    private void BHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHapusActionPerformed
        // TODO add your handling code here:
   int baris = TBuku.getSelectedRow(); //mendekarasikan bahwa baris itu adalah row yang di klik oleh user
   String judul = TBuku.getValueAt(baris, 0).toString(); //mengambil judul yang terletak di indeks ke-0 setiap baris
   int ok=JOptionPane.showConfirmDialog(this,"Apakah Yakin Mendelete record ini???", "Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);
   
       if (ok==0)
       {
        try
         {
            HapusData(judul);//menjalankan fungsi HapusData dengan parameter judul berdasarkan baris yang di pilih
            InitTable();//meload ulang model dari table buku
            TampilData();//menampilkan load ulang dari model table buku
            BSave.setEnabled(true);//menampilkan saat di kli tombol hapus
            JOptionPane.showMessageDialog(this, "Delete Data Sukses");
         }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Delete Data Gagal");
        }
       }

    }//GEN-LAST:event_BHapusActionPerformed
    /*fungsi untuk Edit data dengan parameter judul,penulis,harga*/
    private boolean EditData(String id, String judul, String penulis, String harga){
        try {
            String sql = "update buku set judul='"+judul+"',penulis='"+penulis+"',harga="+harga+" where judul='"+TFJudul.getText()+"'";//penulisan query edit berupa update
            /*pembentukan stetmen dan juga eksekusi query*/
            stt = con.createStatement();
            stt.executeUpdate(sql);
            /*mengosongkan form dan field pada frame*/
            return true;
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
             return false;
        }
   }
    /*Event untuk menjalankan fungsi edit*/
    private void BEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEditActionPerformed
        // TODO add your handling code here:
        /*pendeklarasian variable yang akan di gunakan dalam fungsi yang memiliki parameter*/
        int baris = TBuku.getSelectedRow();
        String id = TBuku.getValueAt( baris, 0).toString();
        String judul = TFJudul.getText();
        String penulis = CBPenulis.getSelectedItem().toString();
        String harga = TFHarga.getText();
        if(EditData(id, judul, penulis, harga))
            JOptionPane.showMessageDialog(null, "Berhasil Ubah Data");
        else
            JOptionPane.showConfirmDialog(null, "Gagal Ubah Data");
    
        
        int ok=JOptionPane.showConfirmDialog(this,"Apakah Yakin Untuk Update Record ini???","Confirmation",JOptionPane.YES_NO_OPTION);
         try
            {
                if(ok==0)
                {
                try
                    {
                        EditData(id,judul,penulis,harga); //menjalankan fungsi EditData tadi dengan parameter yang ada
                        InitTable(); //untuk membuat atau meload ulang model yang ada sehingga akan update ketika ada perubahan setelah dilakukan EditData di database
                        TampilData();//untuk menampilkan model baru yang telah di load
                        BSave.setEnabled(true);//menimbulkan saat bedit di klik
                        JOptionPane.showMessageDialog(this,"Update Data Sukses");
                    }
                catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(this, "Update Data Gagal");
                    }
                }
                
           }catch (Exception e){}
    }//GEN-LAST:event_BEditActionPerformed
    /*event untuk pencarian */
    private void BCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCariActionPerformed
        // TODO add your handling code here:
            DefaultTableModel caritable = (DefaultTableModel)TBuku.getModel(); //pembuatan object instance dari table buku
            if (CBBy.getSelectedItem().equals("judul")){ //pilihan pertama berdasarkan by judul
            
                try{
                    String judul = TFPencarian.getText(); //di deklarasikan judul berasal dari inputan TextField Pencarian
                    String sql = "Select * from buku where judul like '%" + judul + "%'" ; //pendeklarasian query berdasarkan judul
                    stt = con.createStatement(); //membuat steatment
                    rss = stt.executeQuery(sql); //membuat result hasil dari eksekusi kuery yang di dekalarasikan di atas
                    caritable.setRowCount(0); //object caritable di setpada baris ke 0
                    String[] o = new String[3]; // pembentukan object array dengan nama o
                    int x = 1; // mendeklarasikan  x sebagai acuan baris dalam perulangan
                    while(rss.next()){ // perulangan result set dari variable rss hingga tidak terpenuhi untuk perulangan
                    o[0] = rss.getString("judul"); // baris di jadikan array dan index ke-0 dari baris yaitu judul
                    o[1] = rss.getString("penulis");// baris di jadikan array dan index ke-1 dari baris yaitu penulis
                    o[2] = rss.getString("harga");// baris di jadikan array dan index ke-2 dari baris yaitu harga
                    caritable.addRow(o);//menambahkan row atau baris berdasarkan object array o
                    x++; // menandakan x pertambah setiap perulangan
                    }
                    rss.close();//menutup variable rss
                    stt.close();//menutup variable stt
                    TFPencarian.setText(""); // mengosongkan text field pencarian setelah pencarian di lakukan
                }catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Data tidak ada dalam table");
                }
            }            
            //penyeleksian kondisi dimana yang di gunakan by penulis
            else if(CBBy.getSelectedItem().equals("penulis")){
                try{
                    
                    String penulis = TFPencarian.getText(); // karena akan di cari berdasarkan penulis di inisial kan dari field pencarian adalah penulis
                    String sql = "Select * from buku where penulis like '%" + penulis + "%'" ; // query di mana wherenya adalah penulis
                    /* sama seperti pilihan judul*/
                    stt = con.createStatement();
                    rss = stt.executeQuery(sql);
                    caritable.setRowCount(0);
                    String[] o = new String[3];
                    int x = 1;
                    while(rss.next()){
                    o[0] = rss.getString("judul");
                    o[1] = rss.getString("penulis");
                    o[2] = rss.getString("harga");
                    caritable.addRow(o);
                    x++;
                    }
                    rss.close();
                    stt.close();
                    TFPencarian.setText("");
                }catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                }
            }
            /* else ini dimana tidak memilih antara judul dan penulis maka akan di sortir atau di cari berdasarkan harga*/
            else{
            try{
                    String harga = TFPencarian.getText(); // di inisialkan pencarian menjadi harga
                    String sql = "Select * from buku where harga like '%" + harga + "%'" ;// query yang di gunakan wherenya berupa harga
                    /*Dibawah ini sama dengan pilihan sortir pencarian dengan judul*/
                    stt = con.createStatement();
                    rss = stt.executeQuery(sql);
                    caritable.setRowCount(0);
                    String[] o = new String[3];
                    int x = 1;
                    while(rss.next()){
                    o[0] = rss.getString("judul");
                    o[1] = rss.getString("penulis");
                    o[2] = rss.getString("harga");
                    caritable.addRow(o);
                    x++;
                    }
                    rss.close();
                    stt.close();
                    TFPencarian.setText("");
                }catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                }
            }
    }//GEN-LAST:event_BCariActionPerformed
    
    /*fungsi  untuk memilih baris yang akan di edit maupun di delete dengan event mouseclick*/
    private void TBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBukuMouseClicked
        // TODO add your handling code here:
        int baris = TBuku.getSelectedRow(); //di simpan ke dalam variable baris apa yang akan di pilih user di table buku
        String judul_edit = TBuku.getValueAt(baris, 0).toString(); //kolom judul yang ada di table buku di tampung ke variable judul_edit
        String penulis_edit = TBuku.getValueAt(baris, 1).toString();//kolom penulis yang ada di table buku di tampung ke variable penulis_edit
        String harga_edit = TBuku.getValueAt(baris, 2).toString();//kolom harga yang ada di table buku di tampung ke variable harga_edit
       
        /*mengisi form dengan data yang berasal dari baris table yang di pilih*/
        TFJudul.setText(judul_edit);
        TFHarga.setText(harga_edit);
        CBPenulis.setSelectedItem(penulis_edit);
        BSave.setEnabled(false);
        TFJudul.requestFocus();//mengarahkan kefield judul untuk di edit
       
    }//GEN-LAST:event_TBukuMouseClicked
 /* fungsi untuk menampilkan data*/
   public void TampilData(){
         try {
            String sql = "SELECT * FROM buku"; // mendeklarasikan querynya
            /*pembuatan statemen query dan eksekusinya*/
            stt = con.createStatement();
            rss = stt.executeQuery(sql);
            while(rss.next()){
            Object[] o = new Object[4];
// pembuatan object array o untuk menampilkan data di table
            o[0] = rss.getString("ïd");
            o[1] = rss.getString("judul");
            o[2] = rss.getString("penulis");
            o[3] = rss.getString("harga");
            model.addRow(o);
            }
      
        
        } catch (SQLException ex) {
           
             System.out.println(ex.getMessage());
        }
    
    }
    /*fungsi untuk menambahkan data dengan 3 parameter judul,penulis,harga*/
    private void TambahData(String judul, String penulis, String harga){
        try {
            String sql = "INSERT INTO buku VALUES (NULL,'"+judul+"','"+penulis+"','"+harga+"')"; // mendeklarasikan query tambah berupa insert
            /*pembuatan statemen query dan eksekusinya*/
            stt = con.createStatement();
            stt.executeUpdate(sql);
            /*mengembalikan form ke keadaan  semula atau kosong*/
            TFJudul.setText("");
            CBPenulis.setSelectedIndex(0);
            TFHarga.setText("");
            
            
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    }
    
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
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDataBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCari;
    private javax.swing.JButton BEdit;
    private javax.swing.JButton BExit;
    private javax.swing.JButton BHapus;
    private javax.swing.JButton BSave;
    private javax.swing.JComboBox<String> CBBy;
    private javax.swing.JComboBox<String> CBPenulis;
    private javax.swing.JPanel PBuku;
    private javax.swing.JPanel PDasar;
    private javax.swing.JPanel PHeader;
    private javax.swing.JPanel PKonten;
    private javax.swing.JPanel PPencarian;
    private javax.swing.JPanel PTable;
    private javax.swing.JPanel PTombol;
    private javax.swing.JTable TBuku;
    private javax.swing.JTextField TFHarga;
    private javax.swing.JTextField TFJudul;
    private javax.swing.JTextField TFPencarian;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
