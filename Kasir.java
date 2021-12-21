package Ui;

import java.io.*;
import java.util.*;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
public class Kasir extends javax.swing.JFrame {

    Random random = new Random();
    DefaultTableModel model;
    
    public Kasir() {
        initComponents();
        model = new DefaultTableModel();
        upCombox();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelJumlahHarga = new javax.swing.JLabel();
        jLabelHarga = new javax.swing.JLabel();
        jLabelTotalSemua = new javax.swing.JLabel();
        jLabelKembalian = new javax.swing.JLabel();
        jTextBayar = new javax.swing.JTextField();
        jTextBeli = new javax.swing.JTextField();
        jButtonKeranjang = new javax.swing.JButton();
        jButtonTotal = new javax.swing.JButton();
        jButtonSelesai = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButtonUbahMenu = new javax.swing.JButton();
        jButtonLihatTransaksi = new javax.swing.JButton();
        jButtonCetakKeranjang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kasir\n");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Menu", "Harga", "Jumlah Beli", "Total "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabel);
        if (Tabel.getColumnModel().getColumnCount() > 0) {
            Tabel.getColumnModel().getColumn(0).setResizable(false);
            Tabel.getColumnModel().getColumn(1).setResizable(false);
            Tabel.getColumnModel().getColumn(2).setResizable(false);
            Tabel.getColumnModel().getColumn(3).setResizable(false);
        }

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabelJumlahHarga.setText("0");

        jLabelHarga.setText("0");

        jLabelTotalSemua.setText("0");

        jLabelKembalian.setText("0");

        jTextBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBayarActionPerformed(evt);
            }
        });

        jTextBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBeliActionPerformed(evt);
            }
        });

        jButtonKeranjang.setText("Masukkan Keranjang");
        jButtonKeranjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKeranjangActionPerformed(evt);
            }
        });

        jButtonTotal.setText("Total");
        jButtonTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTotalActionPerformed(evt);
            }
        });

        jButtonSelesai.setText("Selesai Transaksi");
        jButtonSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelesaiActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama Menu       :");

        jLabel2.setText("Harga                  :");

        jLabel4.setText("Jumlah Beli        :");

        jLabel5.setText("Jumlah Harga    :");

        jLabel7.setText("Total Semua  :");

        jLabel9.setText("Bayar            :");

        jLabel10.setText("Kembalian     :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelHarga)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelJumlahHarga)))
                    .addComponent(jButtonKeranjang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonSelesai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(21, 21, 21)
                            .addComponent(jLabelKembalian)
                            .addGap(9, 9, 9)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTotalSemua)
                            .addComponent(jTextBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonTotal))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelHarga)
                    .addComponent(jLabel7)
                    .addComponent(jLabelTotalSemua))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(jTextBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelJumlahHarga)
                    .addComponent(jLabel10)
                    .addComponent(jLabelKembalian))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonKeranjang)
                    .addComponent(jButtonSelesai)))
        );

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("CAFE MANTUL");

        jButtonUbahMenu.setText("Ubah Menu");
        jButtonUbahMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUbahMenuActionPerformed(evt);
            }
        });

        jButtonLihatTransaksi.setText("Lihat Transaksi");
        jButtonLihatTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLihatTransaksiActionPerformed(evt);
            }
        });

        jButtonCetakKeranjang.setText("Keranjang");
        jButtonCetakKeranjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCetakKeranjangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(245, 245, 245))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonUbahMenu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCetakKeranjang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonLihatTransaksi))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUbahMenu)
                    .addComponent(jButtonLihatTransaksi)
                    .addComponent(jButtonCetakKeranjang))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
         try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/cafe","root","");
            String fetch = "SELECT * FROM menu WHERE nama_menu=?";
            PreparedStatement st = cn.prepareStatement(fetch);
            st.setString(1, (String)jComboBox1.getSelectedItem());
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                jLabelHarga.setText(rs.getString("harga_menu"));
            }
        } catch (SQLException ex) {}
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBeliActionPerformed
        int a = Integer.parseInt(jLabelHarga.getText());
        int b = Integer.parseInt(jTextBeli.getText());
        int c = a*b;
        
        jLabelJumlahHarga.setText(String.valueOf(c));
    }//GEN-LAST:event_jTextBeliActionPerformed

    private void jButtonKeranjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKeranjangActionPerformed
        DefaultTableModel tmodel = (DefaultTableModel)Tabel.getModel();
        TableModel tabelModel;
        tabelModel = Tabel.getModel();
        
        if (jTextBeli.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Masukkan Jumlah");
        }else{
            String data[] = {(String)jComboBox1.getSelectedItem(),jLabelHarga.getText(),jTextBeli.getText(),jLabelJumlahHarga.getText()};
            tmodel.addRow(data);
            JOptionPane.showMessageDialog(this, "Pesanan Berhasil Dimasukkan"); }
        
        jTextBeli.setText("");
        jLabelJumlahHarga.setText("0");
    }//GEN-LAST:event_jButtonKeranjangActionPerformed

    private void jButtonTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTotalActionPerformed
        int jumlahBaris = Tabel.getRowCount();
        int totalBiaya = 0;
        int hargaBarang;
                
        TableModel tabelModel;
        tabelModel = Tabel.getModel();
        
        for (int i=0; i<jumlahBaris; i++){
            hargaBarang = Integer.parseInt(tabelModel.getValueAt(i, 3).toString());
            totalBiaya = totalBiaya + hargaBarang;
        }
        jLabelTotalSemua.setText(String.valueOf(totalBiaya));
    }//GEN-LAST:event_jButtonTotalActionPerformed

    private void jTextBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBayarActionPerformed
        int a = Integer.parseInt(jLabelTotalSemua.getText());
        int b = Integer.parseInt(jTextBayar.getText());
        int c = b-a;
        
        if (c < 0) {
            JOptionPane.showMessageDialog(this, "Uang Pembeli Kurang");
        }else{
            jLabelKembalian.setText(String.valueOf(c));
        }
    }//GEN-LAST:event_jTextBayarActionPerformed

    private void jButtonSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelesaiActionPerformed
        TableModel tabelModel;
        tabelModel = Tabel.getModel();
        
        Random ran = new Random();
        int max = 99999;
        int kode = ran.nextInt(max);
        
        if (jLabelKembalian.getText().equals("0")) {
            JOptionPane.showMessageDialog(this, "Transaksi Belum Selesai");
        }else{
            try {
                for (int i=0; i<Tabel.getRowCount(); i++){
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/cafe","root","");
                    Integer.parseInt(tabelModel.getValueAt(i, 3).toString());
                    cn.createStatement().executeUpdate("insert into transaksi values('"+ kode +"','"+tabelModel.getValueAt(i, 0)+"','"+jLabelTotalSemua.getText()+"','"+jTextBayar.getText()+"',null)");
                }
                
                DefaultTableModel tmodel = (DefaultTableModel)Tabel.getModel();
                jLabelTotalSemua.setText("0");
                jTextBayar.setText("");
                jLabelKembalian.setText("0");
                tmodel.setRowCount(0);
                
                JOptionPane.showMessageDialog(this,"Transaksi Selesai");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,"Transaksi Gagal");
            }
        }
    }//GEN-LAST:event_jButtonSelesaiActionPerformed

    private void jButtonUbahMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUbahMenuActionPerformed
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_jButtonUbahMenuActionPerformed

    private void jButtonLihatTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLihatTransaksiActionPerformed
        transaksi();
        jButtonKeranjang.setEnabled(false);
    }//GEN-LAST:event_jButtonLihatTransaksiActionPerformed

    private void jButtonCetakKeranjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCetakKeranjangActionPerformed
        String [] jud = {"Nama Menu","Harga","Jumlah Beli","Total"};
        model = new DefaultTableModel(jud,0);
        Tabel.setModel(model); 
        DefaultTableModel tmodel = (DefaultTableModel)Tabel.getModel();
        tmodel.setRowCount(0);
        jButtonKeranjang.setEnabled(true);
    }//GEN-LAST:event_jButtonCetakKeranjangActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kasir().setVisible(true);
            }
        });
    }
    
    public void keranjang(){
        String [] jud = {"Nama Menu","Harga","Jumlah Beli","Total"};
        model = new DefaultTableModel(jud,0);
        Tabel.setModel(model); 
        DefaultTableModel tmodel = (DefaultTableModel)Tabel.getModel();
        tmodel.setRowCount(0);
    }
    
    public void upCombox(){
         try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/cafe","root","");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM menu");
            while(rs.next()){
                jComboBox1.addItem(rs.getString("nama_menu"));
            }
        } catch (SQLException ex) {}
    }
    
    public void transaksi(){
        String [] jud = {"kode","menu pesanan","total pesanan","bayar","tanggal"};
        model = new DefaultTableModel(jud,0);
        Tabel.setModel(model);     
        int row = Tabel.getRowCount();
        for(int a = 0; a<row;a++){
            model.removeRow(0);
        }
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/cafe","root","");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM transaksi");
            while(rs.next()){
                String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)};
                model.addRow(data);
            }
        } catch (SQLException ex) {}
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabel;
    private javax.swing.JButton jButtonCetakKeranjang;
    private javax.swing.JButton jButtonKeranjang;
    private javax.swing.JButton jButtonLihatTransaksi;
    private javax.swing.JButton jButtonSelesai;
    private javax.swing.JButton jButtonTotal;
    private javax.swing.JButton jButtonUbahMenu;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelHarga;
    private javax.swing.JLabel jLabelJumlahHarga;
    private javax.swing.JLabel jLabelKembalian;
    private javax.swing.JLabel jLabelTotalSemua;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextBayar;
    private javax.swing.JTextField jTextBeli;
    // End of variables declaration//GEN-END:variables
}
