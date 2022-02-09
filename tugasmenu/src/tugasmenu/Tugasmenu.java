package tugasmenu;
import java.util.Scanner;

public class Tugasmenu {

    public static void main(String[] args) {
            Scanner paket = new Scanner(System.in);
            
            int diamondbiasa,paketbundle,pilihpaket;
            char belilagi;
            boolean ulanglagi = true;
            while(ulanglagi){
            System.out.println("Daftar Harga Diamond: ");
            System.out.println("1. Paket bundle");
            System.out.println("2. Diamond biasa");
            System.out.println("Pilih Paket: ");
            pilihpaket = paket.nextInt();
            
            if(pilihpaket == 1){
                System.out.println("Silakan Pilih paket yang ingin dibeli:");
                System.out.println("1. 3.480 diamond + Battle Pass");
                System.out.println("2. 5.000 diamond + 60x Material Ascend");
                System.out.println("3. 2.000 diamond + Battle Pass + 3.000.000 Gold");
                paketbundle = paket.nextInt();
                if(paketbundle == 1){
                    System.out.println("\nPaket yang anda akan bayar adalah Rp 300.000,-");
                } else if(paketbundle == 2){
                    System.out.println("\nPaket yang anda akan bayar adalah Rp Rp 350.000,-");
                } else if (paketbundle == 3){
                    System.out.println("\nPaket yang anda akan bayar adalah Rp 250.000,-");
                }}
                else if(pilihpaket == 2){
                System.out.println("Silahkan pilih jumlah diamond:");
                System.out.println("1. 200 Diamond");
                System.out.println("2. 1.200 Diamond");
                System.out.println("3. 2.000 Diamond");
                System.out.println("4. 5.000 Diamond");
                diamondbiasa = paket.nextInt();
                if(diamondbiasa == 1){
                    System.out.println("\nJumlah diamond yang anda akan bayar adalah Rp 20.000,-");
                } else if(diamondbiasa == 2){
                    System.out.println("\nJumlah diamond yang anda akan bayar adalah Rp 75.000,-");
                } else if (diamondbiasa == 3){
                    System.out.println("\njumlah diamond yang anda akan bayar adalah Rp 150.000,-");
                } else if(diamondbiasa == 4){
                    System.out.println("\nJumlah diamond yang anda akan bayar adalah RP 450.000,-");
                }
                }
                System.out.println("\nApakah anda ingin membeli lagi? y/n");
                belilagi = paket.next().charAt(0);
                switch(belilagi){
                    case 'y':
                        break;
                    case 'n':
                        ulanglagi = false;
                        break;
                }
                }
            }

    }
    

