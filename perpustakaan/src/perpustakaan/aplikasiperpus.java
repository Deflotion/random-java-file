package perpustakaan;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class aplikasiperpus {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/cobaperpus";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection con;
    static Statement stm;
    static ResultSet rs;
    
    // untuk mengambil input dari keyboard
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader brinput = new BufferedReader(isr); 
    
    // pembuatan method showMenu
    static void showMenu(){
        System.out.println("\n======= MENU UTAMA =======");
        System.out.println("1. Insert Data");
        System.out.println("2. Show Data");
        System.out.println("3. Edit Data");
        System.out.println("4. Delete Data");
        System.out.println("0. Keluar");
        System.out.println();
        System.out.print("Pilih Menu: ");
        
        try{
            int menu = Integer.parseInt(brinput.readLine());
            
            switch(menu){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    insertBuku();
                    break;
                case 2:
                    showData();
                    break;
                case 3:
                    updateBuku();
                    break;
                case 4:
                    deleteBuku();
                    break;
                default:
                    System.err.println("OPSI TIDAK ADA");                
            }
        } catch(Exception e){
            e.printStackTrace();
        }
                
    }
                        
    public static void main(String[] args) {
        
        try{
            //register driver
            Class.forName(JDBC_DRIVER);
            
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            stm = con.createStatement();
            
            while(!con.isClosed()){
                showMenu();
            }
            
            stm.isClosed();
            con.isClosed();
            
        } catch(Exception e){
            e.printStackTrace();        
        }        
        
    }
    // membuat halaman masing masing menu
    // insert data
    static void insertBuku(){        
        try{
            // ambil input dari user
            System.out.print("Judul: ");
            String judul = brinput.readLine().trim();
            System.out.print("Pengarang: ");
            String pengarang = brinput.readLine().trim();     
            System.out.print("Jumlah: ");
            int jumlah = Integer.parseInt(brinput.readLine());
            
            // menyimpan data atau querynya
            String sql = "INSERT INTO buku(buku, pengarang, jumlah) VALUE('%s', '%s', '%d')";
            sql =  String.format(sql, judul, pengarang, jumlah);
            
            // simpan buku
            stm.execute(sql);            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    // showData
    static void showData(){
        String sql = "SELECT * FROM buku";
        
        try{
            rs = stm.executeQuery(sql);
            
            System.out.println("+---------------------------------------+");
            System.out.println("|       DATA BUKU DI PERPUSTAKAAN       |");
            System.out.println("+---------------------------------------+");
            
            while(rs.next()){
                int idbuku = rs.getInt("id_buku");
                String buku = rs.getString("buku");
                String pengarang = rs.getString("pengarang");
                int jumlah = rs.getInt("jumlah");
            
                System.out.println(String.format("%d. %s -- (%s) (%d) pcs", idbuku, buku, pengarang, jumlah));
            }            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    // update buku
    static void updateBuku(){
        try{
            // ambil input dari user
            System.out.print("ID yang mau diedit: ");
            int idbuku = Integer.parseInt(brinput.readLine());
            System.out.print("Judul: ");
            String judul = brinput.readLine().trim();
            System.out.print("Pengarang: ");
            String pengarang = brinput.readLine().trim();
            System.out.print("Jumlah: ");
            int jumlah = Integer.parseInt(brinput.readLine());
            
            // query update
            String sql = "UPDATE buku SET buku='%s', pengarang='%s', jumlah='%d' WHERE id_buku='%d'";
            sql = String.format(sql, judul, pengarang, jumlah, idbuku);
            
            // update data buku
            stm.execute(sql);            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    // delete buku
    static void deleteBuku(){
        try{
            // ambil input dari user
            System.out.print("Mau ID yang mana: ");
            int idbuku = Integer.parseInt(brinput.readLine());
            
            // proses hapus query
            String sql = String.format("DELETE FROM buku WHERE id_buku=%d", idbuku);
            // hapus data
            stm.execute(sql);
            
            System.out.println("DATA TELAH TERHAPUS...");           
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
