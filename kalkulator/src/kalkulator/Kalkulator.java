
package kalkulator;
import java.util.Scanner;

public class Kalkulator {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float nilai1, nilai2, nilai3,hasil;
//        String  jawabanstr;
        char jawabanchar;
        
        System.out.println("kalkulator");
        System.out.print("massukan nilai pertama: ");
        nilai1 = scan.nextFloat();
        System.out.print("massukan nilai kedua: ");
        nilai2 = scan.nextFloat();
        System.out.print("operasi bilanagan: ");
        jawabanchar = scan.next().charAt(0);
        
        if (jawabanchar == '+'){
            hasil = nilai1 + nilai2;
            System.out.println(nilai1 + " + " + nilai2 + " = " + hasil);
        } else if(jawabanchar == '-'){
            hasil = nilai1 - nilai2;
            System.out.println(nilai1 + " - " + nilai2 + " = " + hasil);
        } else if(jawabanchar == '*'){
            hasil = nilai1 * nilai2;
            System.out.println(nilai1 + " * " + nilai2 + " = " + hasil);
        } else if(jawabanchar == '/'){
            hasil = nilai1 / nilai2;
            System.out.println(nilai1 + " / " + nilai2 + " = " + hasil);
        } else if(jawabanchar == '%'){
            hasil = nilai1 % nilai2;
            System.out.println(nilai1 + " % " + nilai2 + " = " + hasil);
        }
        else {
            System.err.print("Error");
        }
    }
        
    }
    

