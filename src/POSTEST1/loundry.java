package POSTEST1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simbolon-PC
 */

import javax.swing.JOptionPane;
public class loundry extends javax.swing.JFrame {
        public static int hargacuci = 5000;
        public static int hargacucisetrika = 8000;
        public static int hargasetrika = 4000;
        public static int hargaselimut = 12000;
    /**
     * Creates new form loundry
     */
    public loundry() {
      
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbcuci = new javax.swing.JCheckBox();
        cbcucisetrika = new javax.swing.JCheckBox();
        cbsetrika = new javax.swing.JCheckBox();
        cbselimut = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfcuci = new javax.swing.JTextField();
        tfcucisetrika = new javax.swing.JTextField();
        tfselimut = new javax.swing.JTextField();
        tfTotal = new javax.swing.JTextField();
        tfsetrika = new javax.swing.JTextField();
        bHitung = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        cbcuci.setForeground(new java.awt.Color(65, 63, 63));
        cbcuci.setText("cuci : 5000");
        cbcuci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcuciActionPerformed(evt);
            }
        });

        cbcucisetrika.setForeground(new java.awt.Color(65, 63, 63));
        cbcucisetrika.setText("cuci+setrika : 8000");
        cbcucisetrika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcucisetrikaActionPerformed(evt);
            }
        });

        cbsetrika.setForeground(new java.awt.Color(65, 63, 63));
        cbsetrika.setText("setrika : 4000");
        cbsetrika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsetrikaActionPerformed(evt);
            }
        });

        cbselimut.setForeground(new java.awt.Color(65, 63, 63));
        cbselimut.setText("selimut : 12000");
        cbselimut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbselimutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 63, 63));
        jLabel1.setText("SUKSES LOUNDRY");

        jLabel2.setForeground(new java.awt.Color(65, 63, 63));
        jLabel2.setText("jumlah :");

        tfcuci.setEditable(false);
        tfcuci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcuciActionPerformed(evt);
            }
        });

        tfcucisetrika.setEditable(false);

        tfselimut.setEditable(false);

        tfTotal.setEditable(false);
        tfTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTotalActionPerformed(evt);
            }
        });

        tfsetrika.setEditable(false);

        bHitung.setText("Hitung");
        bHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHitungActionPerformed(evt);
            }
        });

        bClear.setText("Clear");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });

        jLabel3.setText("Kg");

        jLabel4.setText("Kg");

        jLabel5.setText("Kg");

        jLabel6.setText("Kg");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbcucisetrika, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbcuci, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbsetrika, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbselimut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfcucisetrika, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfsetrika, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfselimut, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(tfcuci, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(bHitung)
                            .addGap(18, 18, 18)
                            .addComponent(bClear))))
                .addGap(0, 253, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1)
                .addGap(195, 195, 195))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbcuci)
                            .addComponent(tfcuci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfcucisetrika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbcucisetrika)
                        .addComponent(jLabel4)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbsetrika)
                        .addComponent(tfsetrika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfselimut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbselimut)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bHitung)
                    .addComponent(bClear))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbcuciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcuciActionPerformed
        if (cbcuci.isSelected() == true){
            tfcuci.setEditable(true);
        }
        else{
            tfcuci.setEditable(false);
            tfcuci.setText("");
        }
    }//GEN-LAST:event_cbcuciActionPerformed

    private void tfcuciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcuciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcuciActionPerformed

    private void tfTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTotalActionPerformed
//        float Angka1, Angka2, Hasil1;
//        
//        Angka1 = Float.parseFloat(isiSoto.getText());
//        Angka2 = Float.parseFloat(isi.getText());
//        Hasil1 = Angka1 + Angka2;
//        Hasil.setText(String.valueOf(Hasil1));
    }//GEN-LAST:event_tfTotalActionPerformed

    private void cbcucisetrikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcucisetrikaActionPerformed
            if (cbcucisetrika.isSelected() == true){
            tfcucisetrika.setEditable(true);
        }
        else{
            tfcucisetrika.setEditable(false);
            tfcucisetrika.setText("");
        }
    }//GEN-LAST:event_cbcucisetrikaActionPerformed

    private void cbsetrikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsetrikaActionPerformed
        if (cbsetrika.isSelected() == true){
            tfsetrika.setEditable(true);
        }
        else{
            tfsetrika.setEditable(false);
            tfsetrika.setText("");
        }
    }//GEN-LAST:event_cbsetrikaActionPerformed

    private void cbselimutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbselimutActionPerformed
        if (cbselimut.isSelected() == true){
            tfselimut.setEditable(true);
        }
        else{
            tfselimut.setEditable(false);
            tfselimut.setText("");
        }
    }//GEN-LAST:event_cbselimutActionPerformed

    private void bHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHitungActionPerformed
    int totalHarga = 0;
    
        if(cbcuci.isSelected()){
            if(!tfcuci.getText().equalsIgnoreCase("")){
                totalHarga+=Integer.parseInt(tfcuci.getText())* hargacuci;
            }
            else
            JOptionPane.showMessageDialog(null,"Maaf Jumlah Makanan Belum Terisi","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(cbsetrika.isSelected()){
            if(!tfsetrika.getText().equalsIgnoreCase("")){
                totalHarga+=Integer.parseInt(tfsetrika.getText())* hargasetrika;
            }
            else
            JOptionPane.showMessageDialog(null,"Maaf Jumlah Makanan Belum Terisi","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(cbcucisetrika.isSelected()){
            if(!tfcucisetrika.getText().equalsIgnoreCase("")){
                totalHarga+=Integer.parseInt(tfcucisetrika.getText())* hargacucisetrika;
            }
            else
            JOptionPane.showMessageDialog(null,"Maaf Jumlah Makanan Belum Terisi","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(cbselimut.isSelected()){
            if(!tfselimut.getText().equalsIgnoreCase("")){
                totalHarga+=Integer.parseInt(tfselimut.getText())* hargaselimut;
            }
            else
            JOptionPane.showMessageDialog(null,"Maaf Jumlah Makanan Belum Terisi","Error",JOptionPane.ERROR_MESSAGE);
        }
        tfTotal.setText(""+totalHarga);
    }//GEN-LAST:event_bHitungActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
tfcuci.setText("");
tfselimut.setText("");
tfcucisetrika.setText("");
tfsetrika.setText("");
tfTotal.setText("");
cbcuci.setSelected(false);
cbsetrika.setSelected(false);
cbcucisetrika.setSelected(false);
cbselimut.setSelected(false);
tfcuci.setEditable(false);
tfselimut.setEditable(false);
tfcucisetrika.setEditable(false);
tfsetrika.setEditable(false);
    }//GEN-LAST:event_bClearActionPerformed

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
            java.util.logging.Logger.getLogger(loundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loundry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClear;
    private javax.swing.JButton bHitung;
    private javax.swing.JCheckBox cbcuci;
    private javax.swing.JCheckBox cbcucisetrika;
    private javax.swing.JCheckBox cbselimut;
    private javax.swing.JCheckBox cbsetrika;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfTotal;
    private javax.swing.JTextField tfcuci;
    private javax.swing.JTextField tfcucisetrika;
    private javax.swing.JTextField tfselimut;
    private javax.swing.JTextField tfsetrika;
    // End of variables declaration//GEN-END:variables
}
