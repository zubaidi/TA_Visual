/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package form;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author adnan
 */
public class Koneksi {

 static Object[][] databaseInfo;
    static Object[] columns = {"KODE MAPEL", "NAMA MAPEL","NAMA GURU",
            "NIP","HARI","KELAS","JAM"};
private String[] resultt=new String[100];
private Object[] barisSementara;
private String result;
 private DefaultTableModel tabelModel=new DefaultTableModel(databaseInfo,columns);
 private Connection conn = null;
 private String url = "jdbc:mysql://localhost:3306/";
 private String dbName = "visual";
 private String driver ="com.mysql.jdbc.Driver";
 private String userName = "root";
 private String password = "";
 private Statement statement = null;
 private ResultSet resultSet = null;

 


public void pemberitahuan(String a, int b){
    JOptionPane.showMessageDialog(null, a, "SMS", b);
}


public DefaultTableModel getdatajadwal(){
    tabelModel.setRowCount(0);
    try{
        conn = DriverManager.getConnection(url+dbName,userName,password);
        statement = conn.createStatement();
        resultSet = statement.executeQuery("SELECT `tbjadwal`.*, `tbmapel`.`mapel`, `tbguru`.`nama_guru` FROM `tbjadwal`, `tbmapel`, `tbguru` where `tbjadwal`.`nip`=`tbguru`.`nip` and `tbjadwal`.`kode_mapel`=`tbmapel`.`kode_mapel`");

        while(resultSet.next()){
        barisSementara=new Object[]{
            resultSet.getString("kode_mapel"),resultSet.getString("mapel"),resultSet.getString("nama_guru"),resultSet.getString("nip"),resultSet.getString("hari"),resultSet.getString("idkelas"),resultSet.getString("jam")
        };
        tabelModel.addRow(barisSementara);
        }
    }catch(Exception e){
    pemberitahuan("Gagal mencari data \n"+e.getMessage(),0);}

    return (tabelModel);
}

    public void ubahjadwal(String[] isi){
           try{
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url+dbName,userName,password);
            statement = conn.createStatement();
            statement.execute("UPDATE  `visual`.`tbjadwal` SET  `kode_mapel` =  '"+isi[0]+"',`nip` =  '"+isi[1]+"',`idkelas` =  '"+isi[2]+"' WHERE  `tbjadwal`.`hari` =  '"+isi[3]+"' AND  `tbjadwal`.`jam` =  '"+isi[4]+"';");
            pemberitahuan("Berhasil Simpan data",1);
            statement.close();
            conn.close();
      }catch(Exception e){
               pemberitahuan("Gagal Mnyimpan data \n"+e.getMessage(),0);
        }
    }

    public void setDb(String tabel,Object[] isi){
      try{
          String value="";
            for(int i=0;i<=isi.length-1;i++){

                
                if(i!=isi.length-1){
                    value+=isi[i]+",";
                }else{value+=isi[i];}
            }
         
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url+dbName,userName,password);
            statement = conn.createStatement();
            statement.execute("INSERT INTO "+tabel+" VALUES("+value+")");
            pemberitahuan("Berhasil Simpan data",1);
            statement.close();
            conn.close();
      }catch(Exception e){
               pemberitahuan("Gagal Mnyimpan data \n"+e.getMessage(),0);
               e.printStackTrace();
        }

      

  }

   public String[] getidkelas(){
        try{
            resultt=new String[100];
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url+dbName,userName,password);
            statement = conn.createStatement();
            resultSet=statement.executeQuery("SELECT `idkelas` FROM `tbkelas`");
            int a =0;

            while(resultSet.next()){
            resultt[a]=resultSet.getString("idkelas");
            a++;
            }
            statement.close();
            conn.close();
      }catch(Exception e){
               pemberitahuan("Gagal mengambil data kelas \n"+e.getMessage(),0);

      }
        return(resultt);
      
  }

  public String getnamaGuru(String nip){
      try{
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url+dbName,userName,password);
            statement = conn.createStatement();
            resultSet=statement.executeQuery("SELECT `nama_guru` FROM `tbkelas` where `nip`= '"+nip+"'");

            resultSet.next();
            result=resultSet.getString("nama_guru");
            
            statement.close();
            conn.close();
      }catch(Exception e){
               pemberitahuan("Gagal mengambil data kelas \n"+e.getMessage(),0);

      }
        return(result);
  }

   public String getnamaguru(String nip){
      try{
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url+dbName,userName,password);
            statement = conn.createStatement();
            resultSet=statement.executeQuery("SELECT `nama_guru` FROM `tbguru` where `nip`= '"+nip+"'");

            resultSet.next();
            result=resultSet.getString("nama_guru");

            statement.close();
            conn.close();
      }catch(Exception e){
               pemberitahuan("Gagal mengambil nama guru \n"+e.getMessage(),0);

      }
        return(result);
  }

  public String getnamamapel(String mapel){
      try{
            resultt=new String[100];
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url+dbName,userName,password);
            statement = conn.createStatement();
            resultSet=statement.executeQuery("SELECT `mapel` FROM `tbmapel` where `kode_mapel`= '"+mapel+"'");

            resultSet.next();
            result=resultSet.getString("mapel");

            statement.close();
            conn.close();
      }catch(Exception e){
               pemberitahuan("Gagal mengambil data mapel \n"+e.getMessage(),0);

      }
        return(result);
  }

   public String[] getnip(){
        try{
            resultt=new String[100];
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url+dbName,userName,password);
            statement = conn.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM `tbguru`");
            int a =0;

            while(resultSet.next()){
            resultt[a]=resultSet.getString("nip");
            a++;
            }
            statement.close();
            conn.close();
      }catch(Exception e){
               pemberitahuan("Gagal mengambil data guru \n"+e.getMessage(),0);

      }
        return(resultt);

  }


  public String[] getmapel(){
        try{
            resultt=new String[100];
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url+dbName,userName,password);
            statement = conn.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM `tbmapel`");
            int a =0;

            while(resultSet.next()){
            resultt[a]=resultSet.getString("kode_mapel");
            a++;
            }
            statement.close();
            conn.close();
      }catch(Exception e){
               pemberitahuan("Gagal mengambil data mapel \n"+e.getMessage(),0);

      }
        return(resultt);

  }
   
   public String[] get1Db(String tabel, String[] pk,String[] isi){
    String value ="Select * From`"+tabel+"` where ";
    
    for (int i=0;i<=pk.length-1;i++){
        if(i!=pk.length-1){
        value+="`"+pk[i]+"`='"+isi[i]+"' and ";
        }else{
           value+="`"+pk[i]+"`='"+isi[i]+"'";
        }
    }

    
      try{
        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection(url+dbName,userName,password);
        statement = conn.createStatement();
        resultSet = statement.executeQuery(value);
       int a=0;

       while(resultSet.getString(a)==null){
            resultt[a]=resultSet.getString(a);
            a++;
       }
        statement.close();
        conn.close();
     }catch(Exception e){
        pemberitahuan("kode barang tidak ada",0);
        }
      return(resultt);
  }

  public void showTabel(){
      
  }
   
}
