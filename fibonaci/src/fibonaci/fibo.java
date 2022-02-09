package fibonaci;

import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
        System.out.println("bilangan Fibonaci");
        int n,fn,fn_1,fn_2,i;
        fn = 0;
        fn_1 = 0;
        fn_2 = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan data: ");
        n = input.nextInt();
        for(i=0; i<=n; i++){     
            System.out.println("nilai ke- "+ i + " adalah "+ fn);
            fn = fn_1 + fn_2;        
            fn_2 = fn_1;
            fn_1 = fn;            
        }
        
    }
}
