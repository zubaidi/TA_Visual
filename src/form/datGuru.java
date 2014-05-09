/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * datGuru.java
 *
 * Created on 15 Jun 13, 13:02:57
 */

package form;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class datGuru extends javax.swing.JInternalFrame {
    DefaultTableModel tabelModel = new DefaultTableModel();
    private String[] colom = {"NIP/K","Nama Guru","Tanggal Lahir","Jekel","Alamat","Agama",
        "Jabatan","Pengampu Mapel","Kode Mapel","Wali Kelas"};
    private Object[][] dTabel = null;
    
    Connection con;
    Statement st,st2;
    ResultSet rs;
    private String date;
    private int row;
    
    
    /** Creates new form datGuru */
    public datGuru() {
        initComponents();
        btnJekel.add(rbLaki);
        btnJekel.add(rbPerempuan);
        baca_data();
        tampil_combo();
        tampil_data();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnJekel = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNIP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbMapel = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cmbWalikelas = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rbLaki = new javax.swing.JRadioButton();
        rbPerempuan = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        cmbAgama = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        dateTanggalLahir = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        txtKodeMapel = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtJabatan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelGuru = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Form Data Guru");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36));
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Data Guru ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" Data Guru "));

        jLabel2.setText("Nomor Induk Karyawan / NIP");

        jLabel3.setText("Nama");

        jLabel4.setText("Pengampu Mata Pelajaran");

        cmbMapel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--- Pilih Mata Pelajaran ---" }));
        cmbMapel.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbMapelPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel5.setText("Wali Kelas");

        cmbWalikelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--- Piih Kelas ---", "Kelas 1", "Kelas 2", "Kelas 3", "Kelas 4", "Kelas 5", "Kelas 6" }));

        jLabel6.setText("Alamat");

        jLabel7.setText("Tanggal Lahir");

        jLabel8.setText("Jenis Kelamin");

        rbLaki.setSelected(true);
        rbLaki.setText("Laki-Laki");

        rbPerempuan.setText("Perempuan");

        jLabel9.setText("Agama");

        cmbAgama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--- Pilih Agama ---", "Islam", "Kristen", "Katholik", "Hindu", "Budha" }));

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Baru");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Keluar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Update");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        dateTanggalLahir.setDateFormatString("dd MMMM yyyy");
        dateTanggalLahir.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateTanggalLahirPropertyChange(evt);
            }
        });

        jLabel10.setText("Kode Mapel");

        txtKodeMapel.setEnabled(false);

        jLabel11.setText("Jabatan");

        txtAlamat.setColumns(20);
        txtAlamat.setLineWrap(true);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbLaki)
                        .addGap(18, 18, 18)
                        .addComponent(rbPerempuan))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNIP, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dateTanggalLahir, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                    .addComponent(txtJabatan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                    .addComponent(cmbAgama, javax.swing.GroupLayout.Alignment.LEADING, 0, 305, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
                                .addGap(36, 36, 36)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cmbMapel, 0, 239, Short.MAX_VALUE)
                                    .addComponent(txtKodeMapel, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                    .addComponent(cmbWalikelas, javax.swing.GroupLayout.Alignment.LEADING, 0, 239, Short.MAX_VALUE))))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton3, jButton4, jButton5, jButton6});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateTanggalLahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbPerempuan)
                            .addComponent(jLabel8)
                            .addComponent(rbLaki)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmbMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKodeMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbWalikelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cmbAgama)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5)
                        .addComponent(jButton3)
                        .addComponent(jButton6)
                        .addComponent(jButton1)
                        .addComponent(jButton4)))
                .addContainerGap())
        );

        tabelGuru.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIP/NIK", "Nama", "Alamat", "Tanggal Lahir", "JeKel", "Agama", "Jabatan", "Pengampu Mapel", "Kode Mapel", "Wali Kelas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelGuru.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabelGuru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelGuruMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelGuru);
        tabelGuru.getColumnModel().getColumn(0).setResizable(false);
        tabelGuru.getColumnModel().getColumn(0).setPreferredWidth(120);
        tabelGuru.getColumnModel().getColumn(1).setResizable(false);
        tabelGuru.getColumnModel().getColumn(1).setPreferredWidth(200);
        tabelGuru.getColumnModel().getColumn(2).setResizable(false);
        tabelGuru.getColumnModel().getColumn(2).setPreferredWidth(220);
        tabelGuru.getColumnModel().getColumn(3).setResizable(false);
        tabelGuru.getColumnModel().getColumn(3).setPreferredWidth(100);
        tabelGuru.getColumnModel().getColumn(4).setResizable(false);
        tabelGuru.getColumnModel().getColumn(4).setPreferredWidth(70);
        tabelGuru.getColumnModel().getColumn(5).setResizable(false);
        tabelGuru.getColumnModel().getColumn(5).setPreferredWidth(100);
        tabelGuru.getColumnModel().getColumn(6).setResizable(false);
        tabelGuru.getColumnModel().getColumn(6).setPreferredWidth(120);
        tabelGuru.getColumnModel().getColumn(7).setResizable(false);
        tabelGuru.getColumnModel().getColumn(7).setPreferredWidth(150);
        tabelGuru.getColumnModel().getColumn(8).setResizable(false);
        tabelGuru.getColumnModel().getColumn(8).setPreferredWidth(120);
        tabelGuru.getColumnModel().getColumn(9).setResizable(false);
        tabelGuru.getColumnModel().getColumn(9).setPreferredWidth(100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(769, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    String nik = txtNIP.getText();
    String nama = txtNama.getText();
    String alamat = txtAlamat.getText();
    String agama = "";
    String mapel = cmbMapel.getSelectedItem().toString();
    String kodemapel = txtKodeMapel.getText();
    String kelas = cmbWalikelas.getSelectedItem().toString();
    String jabatan = txtJabatan.getText();
    if(cmbAgama.getSelectedIndex() == 1){
        agama = "ISLAM";
    }else if(cmbAgama.getSelectedIndex() == 2){
        agama = "KRISTEN";
    }else if(cmbAgama.getSelectedIndex() == 3){
        agama = "KATHOLIK";
    }else if(cmbAgama.getSelectedIndex() == 4){
        agama = "HINDU";
    }else{
        agama = "BUDHA";
    }
    String kelamin = "";
    if(rbLaki.isSelected()){
        kelamin = "Laki-Laki";
    }else{
        kelamin = "Perempuan";
    }
    if(txtNIP.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Masukkan NIK.","Peringatan",JOptionPane.WARNING_MESSAGE);
        txtNIP.requestFocus();
    }else if(txtNama.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Masukkan Nama Guru.","Peringatan",JOptionPane.WARNING_MESSAGE);
        txtNama.requestFocus();
    }else if(txtAlamat.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Masukkan Alamat Guru.","Peringatan",JOptionPane.WARNING_MESSAGE);
        txtAlamat.requestFocus();
    }else if(txtJabatan.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Masukkan Jabatan Guru.","Peringatan",JOptionPane.WARNING_MESSAGE);
        txtJabatan.requestFocus();
    }else if(cmbAgama.getSelectedIndex() == 0){
        JOptionPane.showMessageDialog(null, "Pilih Agama","Peringatan",JOptionPane.WARNING_MESSAGE);
    }else{
        try{
            st = con.createStatement();
            st2 = con.createStatement();
            String insert = "INSERT INTO tbguru VALUES ('"+nik+"',"
                    + "'"+nama+"','"+date+"','"+kelamin+"','"+alamat+"','"+agama+"','"+jabatan+"')";
            String insert2 = "INSERT INTO tbampu VALUES ('"+nik+"','"+kodemapel+"','"+mapel+"','"+kelas+"')";
            st.executeUpdate(insert);
            st2.executeUpdate(insert2);
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan","Informasi",JOptionPane.INFORMATION_MESSAGE);
            mati();
            tampil_data();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal Simpan Data.","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }
}//GEN-LAST:event_jButton1ActionPerformed

private void dateTanggalLahirPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateTanggalLahirPropertyChange
// TODO add your handling code here:
    if(dateTanggalLahir.getDate() != null){
        String tampilan = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(tampilan);
        date = String.valueOf(sdf.format(dateTanggalLahir.getDate())); 
    }
}//GEN-LAST:event_dateTanggalLahirPropertyChange

private void cmbMapelPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbMapelPopupMenuWillBecomeInvisible
// TODO add your handling code here:
    try{
        st = con.createStatement();
        String tampil = "SELECT * FROM tbmapel where mapel = '"+cmbMapel.getSelectedItem()+"'";
        rs = st.executeQuery(tampil);
        while(rs.next()){
            txtKodeMapel.setText(rs.getString("kode_mapel"));
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Data Tidak Ada Dalam Database.","Error",JOptionPane.ERROR_MESSAGE);
        System.out.println(e);
    }
}//GEN-LAST:event_cmbMapelPopupMenuWillBecomeInvisible

private void tabelGuruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelGuruMouseClicked
// TODO add your handling code here:
    try{
            
            int rows = tabelGuru.getSelectedRow();
            String tampil = (tabelGuru.getModel().getValueAt(rows, 0).toString());
            String tampil_data = "SELECT tbguru.nip AS tbguru_nip, "
                    + "tbguru.nama_guru AS tbguru_nama_guru, "
                    + "tbguru.ttl_guru AS tbguru_ttl_guru, "
                    + "tbguru.jekel AS tbguru_jekel, "
                    + "tbguru.alamat_guru AS tbguru_alamat_guru, "
                    + "tbguru.agama_guru AS tbguru_agama_guru, tbguru.jabatan_guru AS tbguru_jabatan_guru,"
                    + "tbampu.kode_mapel AS tbampu_kode_mapel, tbampu.mapel AS tbampu_mapel, "
                    + "tbampu.kelas AS tbampu_kelas FROM tbguru, tbampu WHERE tbguru.nip = '"+tampil+"'";
            st = con.prepareStatement(tampil);
            rs = st.executeQuery(tampil_data);
            if(rs.next()){
                String nip = rs.getString("tbguru_nip");
                txtNIP.setText(nip);
                String nama = rs.getString("tbguru_nama_guru");
                txtNama.setText(nama);
                Date tanggal = rs.getDate("tbguru_ttl_guru");
                dateTanggalLahir.setDate(tanggal);
                if(rs.getString("tbguru_jekel").equals("Laki-Laki")){
                    rbLaki.setSelected(true);
                }else{
                    rbPerempuan.setSelected(true);
                }
                String alamat = rs.getString("tbguru_alamat_guru");
                txtAlamat.setText(alamat);
                if(rs.getString("tbguru_agama_guru").equals("ISLAM")){
                    cmbAgama.setSelectedIndex(1);
                }else if(rs.getString("tbguru_agama_guru").equals("KRISTEN")){
                    cmbAgama.setSelectedIndex(2);
                }else if(rs.getString("tbguru_agama_guru").equals("KATHOLIK")){
                    cmbAgama.setSelectedIndex(3);
                }else if(rs.getString("tbguru_agama_guru").equals("HINDU")){
                    cmbAgama.setSelectedIndex(4);
                }else if(rs.getString("tbguru_agama_guru").equals("BUDHA")){
                    cmbAgama.setSelectedIndex(5);
                }
                String jabatan = rs.getString("tbguru_jabatan_guru");
                txtJabatan.setText(jabatan);
                String kodemapel = rs.getString("tbampu_kode_mapel");
                txtKodeMapel.setText(kodemapel);
                String mapel = rs.getString("tbampu_mapel");
                cmbMapel.setSelectedItem(mapel);
                String kelas = rs.getString("tbampu_kelas");
                cmbWalikelas.setSelectedItem(kelas);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error","ERROR",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
}//GEN-LAST:event_tabelGuruMouseClicked

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// TODO add your handling code here:
    mati();
    txtNIP.requestFocus();
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
// TODO add your handling code here:
    String nip = txtNIP.getText();
    String nama = txtNama.getText();
    String alamat = txtAlamat.getText();
    String agama = "";
    String mapel = cmbMapel.getSelectedItem().toString();
    String kodemapel = txtKodeMapel.getText();
    String kelas = cmbWalikelas.getSelectedItem().toString();
    String jabatan = txtJabatan.getText();
    if(cmbAgama.getSelectedIndex() == 1){
        agama = "ISLAM";
    }else if(cmbAgama.getSelectedIndex() == 2){
        agama = "KRISTEN";
    }else if(cmbAgama.getSelectedIndex() == 3){
        agama = "KATHOLIK";
    }else if(cmbAgama.getSelectedIndex() == 4){
        agama = "HINDU";
    }else{
        agama = "BUDHA";
    }
    String kelamin = "";
    if(rbLaki.isSelected()){
        kelamin = "Laki-Laki";
    }else{
        kelamin = "Perempuan";
    }
    if(txtNIP.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Masukkan NIK.","Peringatan",JOptionPane.WARNING_MESSAGE);
        txtNIP.requestFocus();
    }else if(txtNama.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Masukkan Nama Guru.","Peringatan",JOptionPane.WARNING_MESSAGE);
        txtNama.requestFocus();
    }else if(txtAlamat.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Masukkan Alamat Guru.","Peringatan",JOptionPane.WARNING_MESSAGE);
        txtAlamat.requestFocus();
    }else if(txtJabatan.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Masukkan Jabatan Guru.","Peringatan",JOptionPane.WARNING_MESSAGE);
        txtJabatan.requestFocus();
    }else if(cmbAgama.getSelectedIndex() == 0){
        JOptionPane.showMessageDialog(null, "Pilih Agama","Peringatan",JOptionPane.WARNING_MESSAGE);
    }else{
        try{
            st = con.createStatement();
            st2 = con.createStatement();
            String update = "UPDATE tbguru SET nip= '"+nip+"',nama_guru = '"+nama+"',ttl_guru = '"+date+"',"
                    + "jekel = '"+kelamin+"',alamat_guru='"+alamat+"',"
                    + "agama_guru='"+agama+"',jabatan_guru = '"+jabatan+"'"
                    + "WHERE nip = '"+nip+"'";
            String insert2 = "UPDATE tbampu SET nip = '"+nip+"',mapel = '"+mapel+"',"
                    + "kelas = '"+kelas+"' WHERE nip = '"+nip+"'";
            st.executeUpdate(update);
            st2.executeUpdate(insert2);
            JOptionPane.showMessageDialog(null, "Berhasil Diupdate","Informasi",JOptionPane.INFORMATION_MESSAGE);
            mati();
            tampil_data();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal Update Data.","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }
}//GEN-LAST:event_jButton6ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
    int confirmasi = JOptionPane.showConfirmDialog(null, 
            "Yakin Ingin Menghapus Data Ini?","Konfirmasi",JOptionPane.YES_NO_OPTION);
    if(confirmasi == 0){
        try{
            st = con.createStatement();
            st2 = con.createStatement();
            String hapus = "DELETE FROM tbguru WHERE nip = "
                    + "'"+tabelGuru.getValueAt(tabelGuru.getSelectedRow(), 0).toString() +"'";
            String hapus2 = "DELETE FROM tbampu WHERE kode_mapel = "
                    + "'"+tabelGuru.getValueAt(tabelGuru.getSelectedRow(), 7).toString() +"'";
            st.executeUpdate(hapus);
            st2.executeUpdate(hapus2);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus","Informasi",JOptionPane.INFORMATION_MESSAGE);
            tampil_data();
            mati();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal Dihapus. Pilih Item Terlebih Dahulu","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
// TODO add your handling code here:
    dispose();
}//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnJekel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbAgama;
    private javax.swing.JComboBox cmbMapel;
    private javax.swing.JComboBox cmbWalikelas;
    private com.toedter.calendar.JDateChooser dateTanggalLahir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbLaki;
    private javax.swing.JRadioButton rbPerempuan;
    private javax.swing.JTable tabelGuru;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtJabatan;
    private javax.swing.JTextField txtKodeMapel;
    private javax.swing.JTextField txtNIP;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables

    private void baca_data(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (com.mysql.jdbc.Connection)DriverManager.getConnection("jdbc:mysql://localhost/visual", "root", "");
            st = con.createStatement();            
            System.out.println("Koneksi Sukses");
        } catch (SQLException ex) {
            Logger.getLogger(mainMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void tampil_data(){
        try{
            st = con.createStatement();
            String tampil = "SELECT tbguru.nip AS tbguru_nip, "
                    + "tbguru.nama_guru AS tbguru_nama_guru, "
                    + "tbguru.ttl_guru AS tbguru_ttl_guru, "
                    + "tbguru.jekel AS tbguru_jekel, "
                    + "tbguru.alamat_guru AS tbguru_alamat_guru, "
                    + "tbguru.agama_guru AS tbguru_agama_guru, tbguru.jabatan_guru AS tbguru_jabatan_guru,"
                    + "tbampu.kode_mapel AS tbampu_kode_mapel, tbampu.mapel AS tbampu_mapel, "
                    + "tbampu.kelas AS tbampu_kelas FROM tbguru, tbampu WHERE tbguru.nip = tbampu.nip";
            rs = st.executeQuery(tampil);
            //row = tabelGuru.getSelectedRow();
            ResultSetMetaData metaData = rs.getMetaData();
            int col = metaData.getColumnCount();
            int baris = 0;
            while(rs.next()){
                baris = rs.getRow();
            }
            dTabel = new Object[baris][col];
            int x = 0;
            rs.beforeFirst();
            while(rs.next()){
                dTabel[x][0] = rs.getString("tbguru_nip");
                dTabel[x][1] = rs.getString("tbguru_nama_guru");
                dTabel[x][2] = rs.getString("tbguru_ttl_guru");
                dTabel[x][3] = rs.getString("tbguru_jekel");
                dTabel[x][4] = rs.getString("tbguru_alamat_guru");
                dTabel[x][5] = rs.getString("tbguru_agama_guru");
                dTabel[x][6] = rs.getString("tbguru_jabatan_guru");
                dTabel[x][7] = rs.getString("tbampu_kode_mapel");
                dTabel[x][8] = rs.getString("tbampu_mapel");
                dTabel[x][9] = rs.getString("tbampu_kelas");
                x++;
            }
            /*
            rs.beforeFirst();
            while(rs.next()){
                tabelGuru.setValueAt(rs.getObject("tbguru_nip"), row, 0);
                tabelGuru.setValueAt(rs.getObject("tbguru_nama_guru"), row, 1);
                tabelGuru.setValueAt(rs.getObject("tbguru_ttl_guru"), row, 2);
                tabelGuru.setValueAt(rs.getObject("tbguru_jekel"), row, 3);
                tabelGuru.setValueAt(rs.getObject("tbguru_alamat_guru"), row, 4);
                tabelGuru.setValueAt(rs.getObject("tbguru_jabatan_guru"), row, 5);
                tabelGuru.setValueAt(rs.getObject("tbguru_agama_guru"), row, 6);
                tabelGuru.setValueAt(rs.getObject("tbampu_kode_mapel"), row, 7);
                tabelGuru.setValueAt(rs.getObject("tbampu_mapel"), row, 8);
                tabelGuru.setValueAt(rs.getObject("tbampu_kelas"), row, 9);
            }
             * 
             */
            tabelGuru.setModel(new DefaultTableModel(dTabel,colom));
            int lebar[] = {160, 150, 130, 120, 170,110,130,130,160,120};
            int kolom = tabelGuru.getColumnCount();
            tabelGuru.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
            for(int z = 0; z < kolom; z++){
                javax.swing.table.TableColumn tableColumn = 
                        tabelGuru.getColumnModel().getColumn(z);
                tableColumn.setPreferredWidth(lebar[z]);
            }
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
    
    private void tampil_combo(){
        try {
            st = con.createStatement();
            String tampil_mapel = "SELECT mapel FROM tbmapel";
            rs = st.executeQuery(tampil_mapel);
            while(rs.next()){
                cmbMapel.addItem(rs.getString("mapel"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(datGuru.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    private void mati(){
        txtAlamat.setText(null);
        txtJabatan.setText(null);
        txtKodeMapel.setText(null);
        txtNIP.setText(null);
        txtNama.setText(null);
        cmbAgama.setSelectedIndex(0);
        cmbMapel.setSelectedIndex(0);
        cmbWalikelas.setSelectedIndex(0);
        dateTanggalLahir.setDate(null);
        rbLaki.setSelected(true);
    }
    
}
