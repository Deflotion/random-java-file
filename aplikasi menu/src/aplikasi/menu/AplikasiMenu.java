package aplikasi.menu;

import java.util.Scanner;

public class AplikasiMenu {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int pilihanmakan, pilihanminum, makanan;
        
        System.out.println("APLIKASI MENU MAKAN");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.println("3. Paket Hemat");
        System.out.print("pilih menu: ");
        pilihanmakan = input.nextInt();
        
        if(pilihanmakan == 1){
            System.out.println("1. Rendang\tRp. 15.000");
            System.out.println("2. Ayam Bakar\tRp. 12.000");
            System.out.println("3. Indomie\tRp. 8.000");
            System.out.print("pilih makanan: ");
            makanan = input.nextInt();
            if(makanan == 1){
                System.out.println("Makanan yg dipilih rendang");
            }
            System.out.println("\nMINUMAN");
            System.out.println("1. Jus Jeruk");
            System.out.println("2. Es Teh");
            System.out.println("3. Air Mineral");
            System.out.print("pilih minuman: ");
            pilihanminum = input.nextInt();
            if(pilihanminum == 1){
                System.out.println("minuman yg dipilih jus jeruk");
            } else if(pilihanminum == 2){
                int rasa;
                System.out.println("minuman yg dipilih es teh");
                System.out.println("1. manis");
                System.out.println("2. tawar");
                System.out.print("pilih rasa: ");
                rasa = input.nextInt();
                if(rasa == 1){
                    System.out.println("yg dipilih adalah es teh manis");
                }
            }
        }
        
        
    }
    
}
