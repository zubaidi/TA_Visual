/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * mainMenu.java
 *
 * Created on 15 Jun 13, 11:49:10
 */

package form;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.sql.*;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author User
 */
public class mainMenu extends javax.swing.JFrame {
    
    Connection con;
    Statement st;
    ResultSet rs;
    
    String tanggal = "dd-MMMM-yyyy";
    SimpleDateFormat sdf = new SimpleDateFormat(tanggal);
    Calendar cal = Calendar.getInstance();
    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH)+1;
    int day = cal.get(Calendar.DAY_OF_MONTH);
    Date tanggal2 = new Date();
    String format_tanggal = sdf.format(tanggal2);
    
    /** Creates new form mainMenu */
    public mainMenu() {
        initComponents();
        setTitle("APLIKASI PENGELOHAN DATA SEKOLAH DASAR");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        ImageIcon icon = new ImageIcon(mainMenu.class.getResource("/gambar/siswa.png"));
        Image image = icon.getImage();
        setIconImage(image);
        jtanggal.setEnabled(false);
        javax.swing.Timer t = new javax.swing.Timer(1000, new ClockListener());
	t.start();
        edit();
        loginDialog.setSize(316, 167);
        loginDialog.setResizable(false);
        loginDialog.setTitle("Login");
        loginDialog.setIconImage(image);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (dim.width - loginDialog.getSize().width)/2;
        int y = (dim.height - loginDialog.getSize().height)/2;
        loginDialog.setLocation(x,y);
        baca_data();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginDialog = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        dekstopPane = new form.mainMenuFormat();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuPengaturan = new javax.swing.JMenu();
        loginSubMenu = new javax.swing.JMenuItem();
        menuLogout = new javax.swing.JMenuItem();
        menuPengaturanAkun = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuMaster = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        menuPengolahanData = new javax.swing.JMenu();
        menuJadwal = new javax.swing.JMenuItem();
        menuKelas = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        menuLaporan = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        try {
            jtanggal =(javax.swing.JMenu)java.beans.Beans.instantiate(getClass().getClassLoader(), "form.mainMenu_jtanggal");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        menuUser = new javax.swing.JMenu();

        jLabel1.setText("UserName");

        jLabel2.setText("Password");

        jButton1.setText("Masuk");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout loginDialogLayout = new javax.swing.GroupLayout(loginDialog.getContentPane());
        loginDialog.getContentPane().setLayout(loginDialogLayout);
        loginDialogLayout.setHorizontalGroup(
            loginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginDialogLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                    .addGroup(loginDialogLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))
                .addContainerGap())
        );
        loginDialogLayout.setVerticalGroup(
            loginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginDialogLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(loginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        getContentPane().add(dekstopPane,java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(102, 255, 51));
        jMenuBar1.setForeground(new java.awt.Color(0, 249, 0));

        menuPengaturan.setText("File");

        loginSubMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        loginSubMenu.setText("Login");
        loginSubMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginSubMenuActionPerformed(evt);
            }
        });
        menuPengaturan.add(loginSubMenu);

        menuLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuLogout.setText("Logout");
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });
        menuPengaturan.add(menuLogout);

        menuPengaturanAkun.setText("Pengaturan Akun");
        menuPengaturanAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPengaturanAkunActionPerformed(evt);
            }
        });
        menuPengaturan.add(menuPengaturanAkun);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuPengaturan.add(jMenuItem3);

        jMenuBar1.add(menuPengaturan);

        menuMaster.setText("Master");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Siswa");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuMaster.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Mata Pelajaran");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuMaster.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Guru");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuMaster.add(jMenuItem6);

        jMenuBar1.add(menuMaster);

        menuPengolahanData.setText("Pengolahan Data");

        menuJadwal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        menuJadwal.setText("Jadwal");
        menuJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuJadwalActionPerformed(evt);
            }
        });
        menuPengolahanData.add(menuJadwal);

        menuKelas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        menuKelas.setText("Kelas");
        menuKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKelasActionPerformed(evt);
            }
        });
        menuPengolahanData.add(menuKelas);

        jMenuItem14.setText("Tabel Jadwal");
        menuPengolahanData.add(jMenuItem14);

        jMenuItem15.setText("Tabel Data Kelas");
        menuPengolahanData.add(jMenuItem15);

        jMenuBar1.add(menuPengolahanData);

        menuLaporan.setText("Laporan");

        jMenuItem9.setText("Siswa");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        menuLaporan.add(jMenuItem9);

        jMenuItem10.setText("Guru");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        menuLaporan.add(jMenuItem10);

        jMenuItem11.setText("Mata Pelajaran");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        menuLaporan.add(jMenuItem11);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setText("Jadwal");
        menuLaporan.add(jMenuItem12);

        jMenuBar1.add(menuLaporan);

        jMenu5.setText("About");

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem13.setText("Tentang Kelompok");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuBar1.add(jMenu5);
        jMenuBar1.add(jtanggal);

        menuUser.setForeground(new java.awt.Color(255, 0, 0));
        menuUser.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuBar1.add(menuUser);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dekstopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dekstopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginSubMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginSubMenuActionPerformed
        // TODO add your handling code here:
        loginDialog.setVisible(true);
    }//GEN-LAST:event_loginSubMenuActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        dataSiswa f = new dataSiswa();
        dekstopPane.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        int confirmasi = JOptionPane.showConfirmDialog(null, "Yakin Ingin Keluar","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(confirmasi == 0){
            JOptionPane.showMessageDialog(null, "Terima Kasih Telah Menggunakan Aplikasi Ini.","Inforamasi",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        mataPelajaran pelajaran = new mataPelajaran();
        dekstopPane.add(pelajaran);
        pelajaran.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        datGuru g = new datGuru();
        dekstopPane.add(g);
        g.setVisible(true);
        try{
            g.setMaximum(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void menuJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuJadwalActionPerformed
        // TODO add your handling code here:
        /*
        jadwalForm form = new jadwalForm();
        dekstopPane.add(form);
        form.setVisible(true);
         * 
         */
        FormJadwal jadwal = new FormJadwal();
        jadwal.setVisible(true);
    }//GEN-LAST:event_menuJadwalActionPerformed

    private void menuKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKelasActionPerformed
        // TODO add your handling code here:
        kelasForm form = new kelasForm();
        dekstopPane.add(form);
        form.setVisible(true);
    }//GEN-LAST:event_menuKelasActionPerformed

private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
// TODO add your handling code here:
    aboutForm form = new aboutForm();
    dekstopPane.add(form);
    form.setVisible(true);
}//GEN-LAST:event_jMenuItem13ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    masuk();
}//GEN-LAST:event_jButton1ActionPerformed

private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
// TODO add your handling code here:
    int confirmasi = JOptionPane.showConfirmDialog(null, "Yakin Ingin Keluar","Konfirmasi",JOptionPane.YES_NO_OPTION);
    if(confirmasi == 0){
        edit();
        menuUser.setText(null);
        setNonAktif();
        JOptionPane.showMessageDialog(null, "Terima Kasih Telah Menggunakan Aplikasi Ini.","Inforamasi",JOptionPane.INFORMATION_MESSAGE);
    }
}//GEN-LAST:event_menuLogoutActionPerformed

private void menuPengaturanAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPengaturanAkunActionPerformed
// TODO add your handling code here:
    pengaturanAkun akun = new pengaturanAkun();
    dekstopPane.add(akun);
    akun.setVisible(true);
}//GEN-LAST:event_menuPengaturanAkunActionPerformed

private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
// TODO add your handling code here:
    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        masuk();
    }
}//GEN-LAST:event_txtPasswordKeyPressed

private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        try {
            // TODO add your handling code here:
                String alamat = "/laporan/dataGuru.jasper";
                HashMap hashMap = new HashMap();
                InputStream inputStream = mainMenu.class.getResourceAsStream(alamat);
                JasperPrint jasperPrint = JasperFillManager.fillReport(inputStream, hashMap, con);
                JasperViewer.viewReport(jasperPrint,false);
        } catch (JRException ex) {
            Logger.getLogger(mainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}//GEN-LAST:event_jMenuItem10ActionPerformed

private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
// TODO add your handling code here:
    cetakSiswa siswa = new cetakSiswa(this, false);
    siswa.setVisible(true);
}//GEN-LAST:event_jMenuItem9ActionPerformed

private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
// TODO add your handling code here:
    try {
            // TODO add your handling code here:
                String alamat = "/laporan/mapel.jasper";
                HashMap hashMap = new HashMap();
                InputStream inputStream = mainMenu.class.getResourceAsStream(alamat);
                JasperPrint jasperPrint = JasperFillManager.fillReport(inputStream, hashMap, con);
                JasperViewer.viewReport(jasperPrint,false);
        } catch (JRException ex) {
            Logger.getLogger(mainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_jMenuItem11ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dekstopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu jtanggal;
    private javax.swing.JDialog loginDialog;
    private javax.swing.JMenuItem loginSubMenu;
    private javax.swing.JMenuItem menuJadwal;
    private javax.swing.JMenuItem menuKelas;
    private javax.swing.JMenu menuLaporan;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JMenu menuMaster;
    private javax.swing.JMenu menuPengaturan;
    private javax.swing.JMenuItem menuPengaturanAkun;
    private javax.swing.JMenu menuPengolahanData;
    private javax.swing.JMenu menuUser;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    class ClockListener implements ActionListener {
    	public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            int h = now.get(Calendar.HOUR_OF_DAY);
            int m = now.get(Calendar.MINUTE);
            int s = now.get(Calendar.SECOND);
            int ml = now.get(Calendar.MILLISECOND);       
            jtanggal.setText("Tanggal: "+format_tanggal+"/ Jam: "+"" + h +":" + m + ":" + s);
        }
    }
    
    private void edit(){
        menuMaster.setEnabled(false);
        menuLaporan.setEnabled(false);
        menuPengolahanData.setEnabled(false);
        menuPengaturanAkun.setEnabled(false);
        menuLogout.setEnabled(false);
    }
    
    private void edit2(){
        menuMaster.setEnabled(true);
        menuLaporan.setEnabled(true);
        menuPengolahanData.setEnabled(true);
        menuPengaturanAkun.setEnabled(true);
        menuLogout.setEnabled(true);
    }
    
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
    
    private void masuk(){
        try{
            String sql = "SELECT user, password FROM tbuser Where user = '"+txtUser.getText()+"' and password = '"+txtPassword.getText()+"'";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            rs.beforeFirst();
            int baris = 0;
                    while(rs.next()){
                        baris = rs.getRow();
                    }
                    if(baris == 1){
                       baris = rs.getRow();
                       JOptionPane.showMessageDialog(null, "Berhasil Login Sebagai "+txtUser.getText(),"Informasi",JOptionPane.INFORMATION_MESSAGE);
                       loginDialog.dispose();
                       menuUser.setText("User: "+txtUser.getText());
                       edit2();
                    }else {
                        JOptionPane.showMessageDialog(null, "Invalid User atau Password", "Error", JOptionPane.ERROR_MESSAGE);
                        txtUser.setText("");
                        txtUser.requestFocus();
                        txtPassword.setText("");
                    }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Yeah, Error","Error",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            txtUser.setText("");
                        txtUser.requestFocus();
                        txtPassword.setText("");
        }
    }
    
    private void setNonAktif(){
        txtUser.setText(null);
        txtPassword.setText(null);
    }
    
    private void hakAkses(){
        try{
            st = con.createStatement();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
