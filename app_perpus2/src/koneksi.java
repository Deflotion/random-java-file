import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class koneksi {
    private static Connection koneksi = null;
    
    public static Connection getConnection(){
        boolean kesalahan = false;
        if(!kesalahan){
        try {
            try{
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex){
            
            }                         
                koneksi = DriverManager.getConnection("jdbc:mysql:///perpus", "root", "");
                System.out.println("koneksi berhasil");
        } catch (SQLException ex){
            System.out.println("koneksi gagal");
            kesalahan = true;
        }
        }
        return koneksi;
        }
    public static void main(String[] args) {
        getConnection();
    }
  
}
