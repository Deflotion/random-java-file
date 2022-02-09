package perpus2;
import java.sql.*;
public class koneksi {
    private static java.sql.Connection koneksi;
    public static Connection getKoneksi(){
        if(koneksi == null){
            try{
                String host = "jdbc:mysql://localhost:3306/perpus2";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(host , user, pass);
                System.out.println("Berhasil terhubung");
            }catch(Exception e){
                System.err.println("Gagal menghubungkan");
            }
        }
        return koneksi;//danny revaldo
    }
    public static void main(String[] args) {
       getKoneksi();
    }
}
