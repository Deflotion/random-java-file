package fibonaci;
import java.util.*;
public class Fibonaci {
    public static void main(String[] args) {
        int f_n, f_n_1, f_n_2, n;
        Scanner input = new Scanner(System.in);
        // pakai for
        System.out.print("Mengambil fibonaci ke- ");
        n = input.nextInt();
        
        f_n_2 = 1;
        f_n_1 = 0;
        f_n = 0;
        
        for(int i = 0; i <= n; i++){
            System.out.println("nilai ke- "+i+" adalah "+f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;            
        }
        // pakai while
        System.out.println("\n");
        System.out.println("Menggunakan While Loop");
        int a = 1;
        f_n_2 = 0; // 1 , 2
        f_n = 1; // 2 , 3
        f_n_1 = 1; // 2, 3

        while (a <= n){
            System.out.println("Nilai ke - "+a+" adalah "+f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
            a++;
        }
        //pakai do while
        System.out.println("\n");
        System.out.println("Menggunakan While do loop");
        f_n = 0; // 2 , 3
        f_n_1 = 0; // 2, 3
        f_n_2 = 1; // 1 , 2
        int b =0;
        do {
            System.out.println("Nilai ke - "+ b + " adalah "+f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
            b++;
        }while (b <= n);
    }
    
}
