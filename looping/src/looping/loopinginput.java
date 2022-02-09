package looping;

import java.util.Scanner;
public class loopinginput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bilangan pertama ");
        int angka = scan.nextInt();
        System.out.println("Batas ");
        int batas = scan.nextInt();
        while(angka<=batas){
            System.out.print(angka+" ");
            angka+= 2;
        }
    }
}
