/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class Koneksi {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    private static Connection MySQLConfig;
    public static Connection configDB() throws SQLException{
    try {
    String url = "jdbc:mysql://localhost:3306/databuku";
    String user = "root";
    String pass = "";

    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
    MySQLConfig = DriverManager.getConnection(url, user, pass);
}
    catch (SQLException e) {
    System.out.printin ("KONEKSI KE DATABASE GAGAL" + e.getMessage());
}
    return MySQLConfig;
}
    }
    

