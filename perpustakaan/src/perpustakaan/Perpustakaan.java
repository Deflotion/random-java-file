package perpustakaan;

// import class yg akan dibutuhkan
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Perpustakaan {

    // menyiapkan parameter JDBC untuk koneksi ke database
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/cobaperpus";
    static final String USER = "root";
    static final String PASS = "";
    
    // menyiapkan objek yg diperlukan untuk mengelola database;
    static Connection con;
    static Statement stm;
    static ResultSet rs;
    
    public static void main(String[] args) {
        // melakakukan koneksi ke database 
        // harus dibungkus dalam blok try/ catch
        try{
            // register driver yg akan dipakai
            Class.forName(JDBC_DRIVER);
            
            // buat koneksi ke database
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            
            // buat objek statement
            stm = con.createStatement();
            
            // buat query ke database
            String sql = "SELECT * FROM buku";
            
            // eksekusi query dan simpan hasilnya di objek resultSet
            rs = stm.executeQuery(sql);
            
            // tampilkan hasil query
            while(rs.next()){
                System.out.println("ID BUKU: " + rs.getInt("id_buku"));
                System.out.println("JUDUL BUKU: " + rs.getString("buku"));
                System.out.println("PENGARANG: " + rs.getString("pengarang"));
                System.out.println("JUMLAH: " + rs.getInt("jumlah"));
            }
            //System.out.println("KONEKSI BERHASIL");
            stm.close();
            con.close();
        } catch (Exception kecuali){
            kecuali.printStackTrace();
        }
    }
    
}
