/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * kelasForm.java
 *
 * Created on Jun 20, 2013, 4:57:06 PM
 */
package form;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
/**
 *
 * @author Dj_Ubet
 */
public class kelasForm extends javax.swing.JInternalFrame {
    
    ResultSet rs;
    Statement st;
    Connection con;
    
    DefaultTableModel tableModel = new DefaultTableModel();
    private String[] colom = {"NIS","Kelas","Tahun Angkatan","Nama Siswa","Tanggal Lahir","Alamat Siswa","JK","Agama",
                            "Nama Orangtua","Pekerjaan","Alamat Orangtua","Nomor Telfon"};
    private Object[][] dTabel = null;
    
    /** Creates new form kelasForm */
    public kelasForm() {
        initComponents();
        baca_data();
        tampil_nip();
        ImageIcon icon = new ImageIcon(mainMenu.class.getResource("/gambar/siswa.png"));
        java.awt.Image image = icon.getImage();
        tabelSiswa.setSize(880, 380);
        tabelSiswa.setResizable(false);
        tabelSiswa.setIconImage(image);
        tabelSiswa.setTitle("Tabel Keterangan Data Siswa");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (dim.width - tabelSiswa.getSize().width)/2;
        int y = (dim.height - tabelSiswa.getSize().height)/2;
        tabelSiswa.setLocation(x,y);
        baca_data_tabel();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabelSiswa = new javax.swing.JDialog();
        buttonSetData = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelSiswaObjek = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        yearFilter = new com.toedter.calendar.JYearChooser();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        cmbKodekelas = new javax.swing.JComboBox();
        txtKelas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtKapasitas = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        cmbNIP = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        txtNamaGuru = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtNIS = new javax.swing.JTextField();
        buttonCek = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtJenisKelamin = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        buttonSimpan = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();

        buttonSetData.setText("Set Data");
        buttonSetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSetDataActionPerformed(evt);
            }
        });

        tabelSiswaObjek.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabelSiswaObjek);

        jLabel20.setText("Filter Data Berdasarkan Tahun Angkatan");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel20.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        yearFilter.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton3.setText("Set");

        javax.swing.GroupLayout tabelSiswaLayout = new javax.swing.GroupLayout(tabelSiswa.getContentPane());
        tabelSiswa.getContentPane().setLayout(tabelSiswaLayout);
        tabelSiswaLayout.setHorizontalGroup(
            tabelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabelSiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                    .addGroup(tabelSiswaLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(10, 10, 10)
                        .addComponent(yearFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 405, Short.MAX_VALUE)
                        .addComponent(buttonSetData)))
                .addContainerGap())
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
        );
        tabelSiswaLayout.setVerticalGroup(
            tabelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabelSiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonSetData)
                        .addComponent(jButton3))
                    .addComponent(yearFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(14, 14, 14))
        );

        setClosable(true);
        setTitle("Form Pengelolaan Kelas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Pengelolaan Kelas");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(" Kelas "));

        cmbKodekelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--- Pilih Kode ---", "K01", "K02", "K03", "K04", "K05", "K06" }));
        cmbKodekelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKodekelasActionPerformed(evt);
            }
        });

        txtKelas.setEditable(false);

        jLabel6.setText("Kelas");

        jLabel12.setText("Kode Kelas");

        jLabel13.setText("Kapasitas");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel6))
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtKapasitas)
                    .addComponent(txtKelas, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbKodekelas, javax.swing.GroupLayout.Alignment.LEADING, 0, 114, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cmbKodekelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtKapasitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(" Data Wali Kelas "));

        jLabel14.setText("Nomor Induk Karyawan / Pegawai");

        cmbNIP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--- Pilih NIK/P ---" }));
        cmbNIP.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbNIPPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel15.setText("Nama Guru");

        txtNamaGuru.setEditable(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbNIP, 0, 188, Short.MAX_VALUE)
                    .addComponent(txtNamaGuru))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(cmbNIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtNamaGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(" Data Siswa "));

        jLabel16.setText("Nomor Induk Siswa");

        txtNIS.setEditable(false);

        buttonCek.setText("Cek");
        buttonCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCekActionPerformed(evt);
            }
        });

        jLabel17.setText("Nama Siswa");

        txtNama.setEditable(false);

        jLabel18.setText("Jenis Kelamin");

        txtJenisKelamin.setEditable(false);

        jLabel19.setText("Alamat");

        buttonSimpan.setText("Simpan");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        buttonKeluar.setText("Keluar");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });

        txtAlamat.setColumns(20);
        txtAlamat.setEditable(false);
        txtAlamat.setLineWrap(true);
        txtAlamat.setRows(5);
        txtAlamat.setEnabled(false);
        jScrollPane1.setViewportView(txtAlamat);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtNIS, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCek))
                    .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(txtJenisKelamin, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(buttonSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonKeluar)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSimpan)
                            .addComponent(buttonKeluar)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtNIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCek)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void cmbKodekelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKodekelasActionPerformed
// TODO add your handling code here:
    if(cmbKodekelas.getSelectedIndex() == 1){
        txtKelas.setText("Kelas 1");
    }else if(cmbKodekelas.getSelectedIndex() == 2){
        txtKelas.setText("Kelas 2");
    }else if(cmbKodekelas.getSelectedIndex() == 3){
        txtKelas.setText("Kelas 3");
    }else if(cmbKodekelas.getSelectedIndex() == 4){
        txtKelas.setText("Kelas 4");
    }else if(cmbKodekelas.getSelectedIndex() == 5){
        txtKelas.setText("Kelas 5");
    }else{
        txtKelas.setText("Kelas 6");
    }
}//GEN-LAST:event_cmbKodekelasActionPerformed

private void cmbNIPPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbNIPPopupMenuWillBecomeInvisible
// TODO add your handling code here:
    try{
        st = con.createStatement();
        String tampil = "SELECT * FROM tbguru WHERE nip = '"+cmbNIP.getSelectedItem()+"'";
        rs = st.executeQuery(tampil);
        while(rs.next()){
            txtNamaGuru.setText(rs.getString("nama_guru"));
        }
    }catch(Exception e){
        e.printStackTrace();
    }
}//GEN-LAST:event_cmbNIPPopupMenuWillBecomeInvisible

private void buttonCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCekActionPerformed
// TODO add your handling code here:
    tabelSiswa.setVisible(true);
}//GEN-LAST:event_buttonCekActionPerformed

private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
// TODO add your handling code here:
    dispose();
}//GEN-LAST:event_buttonKeluarActionPerformed

private void buttonSetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSetDataActionPerformed
// TODO add your handling code here:
    try{
        int row = tabelSiswaObjek.getSelectedRow();
        String tampil = (tabelSiswaObjek.getModel().getValueAt(row, 0).toString());
        String setData = "SELECT tbsiswa.nis AS siswaNIS, tbsiswa.idkelas AS siswaKelas, tbsiswa.th_angkatan as siswaAngkatan,"
                    + "tbsiswa.nama_siswa AS siswaNama, tbsiswa.tanggal_lahir AS siswaTTL, tbsiswa.alamat_siswa AS siswaAlamat,"
                    + "tbsiswa.jenis_kelamin as siswaJekel, tbsiswa.agama_siswa AS siswaAgama, tbortu.nama_ortu AS ortuNama, tbortu.pekerjaan AS ortuPekerjaan,"
                    + "tbortu.alamat AS ortuAlamat, tbortu.telfon AS ortuTelfon FROM tbsiswa, tbortu WHERE tbsiswa.nis = '"+tampil+"'";
         st = con.prepareStatement(tampil);
         rs = st.executeQuery(setData);
         if(rs.next()){
             String nis = rs.getString("siswaNIS");
             txtNIS.setText(nis);
             String nama = rs.getString("siswaNama");
             txtNama.setText(nama);
             String alamatSiswa = rs.getString("siswaAlamat");
             txtAlamat.setText(alamatSiswa);
             if(rs.getString("siswaJekel").equals("L")){
                txtJenisKelamin.setText("Laki-Laki");
             }else{
                 txtJenisKelamin.setText("Perempuan");
             }
         }
         tabelSiswa.dispose();
    }catch(Exception e){
        System.out.println(e);
        e.printStackTrace();
    }
}//GEN-LAST:event_buttonSetDataActionPerformed

private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_buttonSimpanActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCek;
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonSetData;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JComboBox cmbKodekelas;
    private javax.swing.JComboBox cmbNIP;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JDialog tabelSiswa;
    private javax.swing.JTable tabelSiswaObjek;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtJenisKelamin;
    private javax.swing.JTextField txtKapasitas;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNIS;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNamaGuru;
    private com.toedter.calendar.JYearChooser yearFilter;
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
    
    private void tampil_nip(){
        try{
            st = con.createStatement();
            String tampil = "SELECT * FROM tbguru WHERE nip";
            rs = st.executeQuery(tampil);
            while(rs.next()){
                cmbNIP.addItem(rs.getString("nip"));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    private void baca_data_tabel(){
        try{
            st = con.createStatement();
            String tampil = "SELECT tbsiswa.nis AS siswaNIS, tbsiswa.idkelas AS siswaKelas, tbsiswa.th_angkatan as siswaAngkatan,"
                    + "tbsiswa.nama_siswa AS siswaNama, tbsiswa.tanggal_lahir AS siswaTTL, tbsiswa.alamat_siswa AS siswaAlamat,"
                    + "tbsiswa.jenis_kelamin as siswaJekel, tbsiswa.agama_siswa AS siswaAgama, tbortu.nama_ortu AS ortuNama, tbortu.pekerjaan AS ortuPekerjaan,"
                    + "tbortu.alamat AS ortuAlamat, tbortu.telfon AS ortuTelfon FROM tbsiswa, tbortu WHERE tbsiswa.nis = tbortu.nis";
            rs = st.executeQuery(tampil);
            ResultSetMetaData metaData = (ResultSetMetaData) rs.getMetaData();
            int col = metaData.getColumnCount();
            int baris = 0;
            while(rs.next()){
                baris = rs.getRow();
            }
            dTabel = new Object[baris][col];
            int x = 0;
            rs.beforeFirst();
            while(rs.next()){
                dTabel[x][0] = rs.getString("siswaNIS");
                dTabel[x][1] = rs.getString("siswaKelas");
                dTabel[x][2] = rs.getInt("siswaAngkatan");
                dTabel[x][3] = rs.getString("siswaNama");
                dTabel[x][4] = rs.getDate("siswaTTL");
                dTabel[x][5] = rs.getString("siswaAlamat");
                dTabel[x][6] = rs.getString("siswaJekel");
                dTabel[x][7] = rs.getString("siswaAgama");
                dTabel[x][8] = rs.getString("ortuNama");
                dTabel[x][9] = rs.getString("ortuPekerjaan");
                dTabel[x][10] = rs.getString("ortuAlamat");
                dTabel[x][11] = rs.getString("ortuTelfon");
                x++;
            }
            tabelSiswaObjek.setModel(new DefaultTableModel(dTabel, colom));
            
            int[] lebar = {80,100,100,150,150,180,80,120,150,130,180,120};
            tabelSiswaObjek.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            int kolom = tabelSiswaObjek.getColumnCount();
            for(int z = 0; z < kolom; z++){
                javax.swing.table.TableColumn tableColumn = 
                        tabelSiswaObjek.getColumnModel().getColumn(z);
                tableColumn.setPreferredWidth(lebar[z]);
            }
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
    
    private void lihat_kelas(){
        if(cmbKodekelas.getSelectedIndex() == 1){
            txtKelas.setText("Kelas 1");
        }else if(cmbKodekelas.getSelectedIndex() == 2){
            txtKelas.setText("Kelas 2");
        }else if(cmbKodekelas.getSelectedIndex() == 3){
            txtKelas.setText("Kelas 3");
        }else if(cmbKodekelas.getSelectedIndex() == 4){
            txtKelas.setText("Kelas 4");
        }else if(cmbKodekelas.getSelectedIndex() == 5){
            txtKelas.setText("Kelas 5");
        }else if(cmbKodekelas.getSelectedIndex() == 6){
            txtKelas.setText("Kelas 6");
        }
    }
    
}
