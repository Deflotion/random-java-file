package data;

import java.util.Scanner;

public class Data {
    
    public static void main(String[] args) {
        //variable
        int n1,n2,n3,rumus;
        char ulang;
        boolean ulanglagi = true;
        String n;
        
        Scanner input = new Scanner(System.in);
        
        //untuk looping
        while(ulanglagi){
        System.out.println("Masukan data: ");
        System.out.print("Nama           : ");
        n = input.next();
        System.out.print("Nilai Harian   : ");
        n1 = input.nextInt();
        if(n1 > 100){
            System.err.println("Angka melebihi 100");
            System.exit(0); 
        }
        System.out.print("Nilai UTS      : ");
        n2 = input.nextInt();
        if(n2 > 100){
            System.err.println("Angka melebihi 100");
            System.exit(0); 
        }
        System.out.print("Nilai UAS      : ");
        n3 = input.nextInt();
        if(n3 > 100){
            System.err.println("Angka melebihi 100");
            System.exit(0); 
        }
        //rumus untuk rata-rata
        rumus = (n1 + n2 + n3)/3;
        
        System.out.println("\n==========================\n");
        
        System.out.println("Nama           : " + n);
        System.out.println("Nilai Harian   : " + n1);
        System.out.println("Nilai UTS      : " + n2);
        System.out.println("Nilai UAS      : " + n3);
        System.out.println("Rata-rata      : " + rumus);
        System.out.print  ("Predikat       : ");
        //untuk menampilkan hasil predikat
        if(rumus >= 80){
            System.out.println("A"); 
        }else if(rumus < 80 && rumus >= 70){
            System.out.println("B");
        }else if(rumus < 70 && rumus >= 60 ){
            System.out.println("C");
        }else if(rumus < 60 && rumus >= 50 ){
            System.out.println("D");
        }else if(rumus < 50 ){
            System.out.println("E");
        }
            System.out.print("Ingin mengulangi lagi? ");
            ulang = input.next().charAt(0);
            switch(ulang){
                case'y':
                    break;
                case 'n':
                    ulanglagi = false;
                    break;
                    
            }
        }  
    }
    
}
