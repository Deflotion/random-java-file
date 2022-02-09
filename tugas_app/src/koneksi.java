import java.sql.*;
public class koneksi {
    static final String JDBC_Driver = "com.mysql.jdbc.Driver" ;
    static final String url = "jdbc:mysql://localhost/penjualan";
    static final String user = "root";
    static final String pass = "";
    
    public static Connection koneksi;
    public static Connection koneksiDB(){
        try{
            Class.forName(JDBC_Driver);
            koneksi = DriverManager.getConnection(url,user,pass);
            System.out.println("berhasil");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("gagal");
            System.out.println(e);
        }
        return koneksi;
    }
    public static void main(String[] args) {
        koneksiDB();
    }
}
