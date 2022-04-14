/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsp02;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class LSP02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama;
        int waktu,tipe;
        char ulang;
        boolean mengulang = true;
        TarifHotel hotel = new TarifHotel();
        Scanner input = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
        
        while(mengulang){
            System.out.println("<=====================================>");
            System.out.println("<===============Welcome===============>");
            System.out.println("<=====================================>\n");
            System.out.print("Masukan nama anda: ");
            nama = name.next();
            hotel.setName(nama);
            
            System.out.println("\nPilih kamar: ");
            System.out.println("1. Biasa");
            System.out.println("2. Ekonomi");
            System.out.println("3. First Class");
            System.out.print("Pilih: ");
            tipe = input.nextInt();
            hotel.setTipe(tipe);
            if(tipe >= 4){
                System.err.println("Kamar tidak ada!!!");
                return;
            }
            
            System.out.print("\nLama menginap: ");
            waktu = input.nextInt();
            hotel.setWaktu(waktu);
            
            System.out.println("<=====================================>");
            System.out.println("Struk pemesanan");
            System.out.print("Nama               : "+hotel.getName());
            System.out.print("\nTipe kamar         : "+hotel.getTipe());
            System.out.print("\nLama menginap      : "+hotel.getWaktu());
            System.out.print("\nDiskon             : "+hotel.get_Diskon());
            System.out.print("\nHarga permalam     : Rp."+hotel.get_Harga());
            System.out.print("\nTotal potongan     : Rp."+hotel.get_Disk());
            System.out.print("\nTotal keseluruhan  : Rp."+hotel.get_Total());
            System.out.print("\n\nMau pesan lagi? ");
            ulang = input.next().charAt(0);
            switch(ulang){
                case 'y':
                    break;
                case 'n':
                    System.out.println("Terima kasih telah memesan");
                default:
                    return;
            }
        }
    }
    
}
