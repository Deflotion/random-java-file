package pemdas;
import java.util.Scanner;

public class Pemdas {
    
    public static void main(String[] args) {
        int i, j, temp, data, jumlah; 
        int pilih;
        char ulang;
        boolean ulanglagi = true;
        double avg,total;
        
        total = 0;
        jumlah = 0;
        Scanner input = new Scanner(System.in);
        
        while(ulanglagi){
        System.out.println("<===================================>");
        System.out.print("Jumlah data : ");
        try {
            jumlah = input.nextInt();
        
        }catch (Exception e) {
                    System.err.println("Data harus angka!");
                    System.exit(0);
        }
        int array[] = new int[jumlah];
        int nilai_1[] = new int[jumlah];
        int nilai_2[] = new int[jumlah];
            try{
                for(i=0; i<jumlah; i++){
                System.out.print("Angka ke - " + (i + 1) + " : ");
                data = input.nextInt();
                array[i] = data;
                nilai_1[i] = data;
                nilai_2[i] = data;
            }}catch(Exception e){
                System.err.println("Data Harus angka!");
                System.exit(0);
            }
        
        System.out.println("\n<===================================>");
        System.out.println("Pilih metode pengurutan");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        System.out.print("Pilih metode: ");
        try{
        pilih = input.nextInt();
        switch(pilih){
            case 1:
                for(i=0; i<jumlah; i++){
                    for(j=i;j<jumlah;j++){
                        if(nilai_1[i] > nilai_2[j]){
                        temp = nilai_1[i];
                        nilai_1[i] = nilai_1[j];
                        nilai_1[j] = temp;
                }
            }
        }
                break;
            case 2:
                for(i=0; i<jumlah-1; i++){
                    for(j=i; j<jumlah; j++){
                        if(nilai_1[i] < nilai_2[j]){
                        temp = nilai_1[i];
                        nilai_1[i] = nilai_1[j];
                        nilai_1[j] = temp;
                }
            }
        }
                break;
            default:
                System.err.println("Metode tidak ada");
                System.exit(0);
        }
        //rata-rata
        for(int ave=0;ave<array.length;ave++){
            total += array[ave];
        }
        avg = total / array.length;
        
        //nilai maksimal
        int max = array[0];
        for(int maks=0;maks<array.length;maks++){
            if(max < array[maks])
            max = array[maks];
        }
        
        //nilai minimal
        int min = array[0];
        for(int mins=0;mins<array.length;mins++){
            if(min > array[mins])
            min = array[mins];
        }
        
        
        //output
        System.out.print("\nData sebelum diurutkan: ");
        for(i=0; i<jumlah; i++){
            System.out.print(array[i] + ",");
        }
        System.out.print("\nData setelah diurutkan: ");
        for(i=0; i<jumlah; i++){
            System.out.print(nilai_1[i] + ",");
        }
        System.out.println("\nNilai rata-rata: "+avg);
        System.out.println("Nilai maks: "+max);
        System.out.println("Nilai min: "+min);
        System.out.print("\nIngin kembali keawal?(y/n) :");
                ulang = input.next().charAt(0);
                switch(ulang){
                    case 'y':
                        break;
                    case 'n':
                        ulanglagi = false;
                        break;
                    default:
                        System.err.println("Pilihan tidak ada");
                        ulanglagi = false;
                }
        }catch(Exception e){
            System.err.println("Pilih yang benar!");
            System.exit(0);
        }                
    }
    }
    
}
