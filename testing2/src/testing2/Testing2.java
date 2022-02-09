package testing2;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Testing2 {

    
    public static void main(String[] args) throws IOException {
        int i,j,n;
        Scanner input;
        
        input = new Scanner(System.in);
        /*
        System.out.print("masukan nilai 1 = ");
        nilai1 = input.nextInt();
        System.out.print("masukan nilai 2 = ");
        nilai2 = input.nextInt();
        total = 0;*/
        /*while(nilai1 <= nilai2){
            total = total + nilai1;
            System.out.println("ditambah " + nilai1 + " menjadi " + total);
            nilai1++;
        }*/
        
        /*for(;nilai1<=nilai2;nilai1++){
           total = total + nilai1;
           System.out.println("ditambah " + nilai1 + " menjadi " + total);
           
        }*/
        /*do{
            total = total + nilai1;
            System.out.println("ditambah " + nilai1 + " menjadi " + total);
            nilai1++;
        }while(nilai1 <= nilai2);
        */
//        System.out.print("masukan angka: ");
//        n = input.nextInt();
//        for(i = 0;i < n;i++){
//            for(j= 0; j <n ;j++){
//            System.out.print("* ");
//            if(i == j){
//                break;
//            }else if((i+j) == (n+1)){
//                break;
//            }
//            }
//            System.out.print("\n");
//        }
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                if((i+j) <= 3||(i-j) >= 5){
                    System.out.print("  ");
                }else if ((j-i) == 5){
                    break;
                }else if ((i+j) == 13){
                    break;
                }else{
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }

    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*int umur;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        umur = Integer.parseInt(br.readLine());
        /* Scanner input = new Scanner(System.in);
        
        System.out.println("Menu");
        System.out.println("1. Input data");
        System.out.println("2. Edit data");
        System.out.println("3. Menampilkan data");
        System.out.println("4. Exit");
        System.out.println("Pilih menu");
        String menu =input.next();
        
        switch(menu){
            case "input":
                System.out.println("Input");
                break;
            case "show":
                    System.out.println("show");
                    break;
            case "edit":
                    System.out.println("edit");
                    break;
            case "exit":
                System.out.println("exit");
            default:
                System.out.println("mana ada");
                */
                
         /*       
        int d = 10;
        int e = 4;
        float f = (float) d/e;
        System.out.printf("%d / %d = %f\n",d,e,f);*/
        } 

    //menu minuman
//    public static void minum(){
//        System.out.println("menu minumana");
//        System.out.println("1. aer");
//        System.out.println("2. teh");
//    }
    
    
    

