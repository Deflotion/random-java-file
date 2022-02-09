package formregis;

import java.sql.*;

public class koneksi {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost/perpustakaan";
    static final String USER = "root";
    static final String PASS = "";


public static Connection konek;

public static Connection konekDB(){
    try {
    Class.forName(JDBC_DRIVER);
    konek = DriverManager.getConnection(URL, USER, PASS);
        System.out.println("Berhasil");
    }catch(Exception e){
        e.printStackTrace();
        System.err.println("Gagal");
    }
    return konek;
  }
    public static void main(String[] args) {
        konekDB();
    }
}
