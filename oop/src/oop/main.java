package oop;
//Danny Revaldo
//XII-RPL 2
//OOP
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        String nama;
        int waktu,tipe;
        Scanner input = new Scanner(System.in);
        
        //membuat objek hotel dari file tarifdhotel
        tarifhotel hotel = new tarifhotel();
        
        //menginput nama pembeli
        Scanner name = new Scanner(System.in); // memakai scanner terpisah supaya tidak tabrakan dengan yang lain
         System.out.println("<=================Hotel Pelita=================>");
        System.out.print("Masukan nama anda: ");
        nama = name.next();
        hotel.setNama(nama);
        
        //untuk memilih tipe kamar
        System.out.println("\nPilih tipe kamar:");
        System.out.println("1. Biasa");
        System.out.println("2. Ekonomi");
        System.out.println("3. VIP");
        System.out.print("Pilih: ");
        tipe = input.nextInt();
        hotel.setTipe(tipe);
        
        //menginput durasi menginap
        
        System.out.print("\nBerapa lama: ");
        waktu = input.nextInt();
        hotel.setWaktu(waktu);
        
        //hasil dari total harga
        System.out.println("<=================Total harga=================>");
        System.out.println("Nama pelanggan  : "+hotel.getNama());
        System.out.println("Pilihan kamar   : "+hotel.get_Kamar());
        System.out.println("Lama menginap   : "+hotel.getWaktu());
        System.out.println("Tarif permalam  : Rp."+hotel.get_Harga());
        System.out.println("Diskon          : "+hotel.get_Diskon());
        System.out.println("Total           : Rp."+hotel.get_Total());
        System.out.println("<=============================================>");
        System.out.println("<=============================================>");
    }
}
