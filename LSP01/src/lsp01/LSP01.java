/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsp01;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class LSP01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int data,i,j,jumlah,temp,pilih;
        char ulang;
        boolean mengulang = true;
        Scanner input = new Scanner(System.in);
        
        while(mengulang){
            try{
                System.out.println("<====================================>");
                System.out.print("Masukan jumlah data: ");
                jumlah = input.nextInt();
                int array[] = new int[jumlah];
                int angka_1[] = new int[jumlah];
                int angka_2[] = new int[jumlah];
                for(i=0;i<jumlah;i++){
                    System.out.printf("Angka ke-%d: ",i+1);
                    data = input.nextInt();
                    array[i] = data;
                    angka_1[i] = data;
                    angka_2[i] = data;
                }
                
                System.out.println("\n<====================================>");
                System.out.println("Pilih metode pengurutan:");
                System.out.println("1. Ascending");
                System.out.println("2. Descending");
                System.out.print("Pilih: ");
                pilih = input.nextInt();
                
                switch(pilih){
                    case 1:
                        for(i=0;i<jumlah;i++){
                            for(j=i;j<jumlah;j++){
                                if(angka_1[i] > angka_2[j]){
                                    temp = angka_1[i];
                                    angka_1[i] = angka_1[j];
                                    angka_1[j] = temp;
                                }
                            }
                        }
                        break;
                    case 2:
                        for(i=0;i<jumlah-1;i++){
                            for(j=i;j<jumlah;j++){
                                if(angka_1[i] < angka_2[j]){
                                    temp = angka_1[i];
                                    angka_1[i] = angka_1[j];
                                    angka_1[j] = temp;
                                }
                            }
                        }
                        break;
                    default:
                        System.err.println("Pilihan tidak ada!!!");
                        return;
                }
                
                int ave,maks,max,mins,min;
                double total,avg;
                total = 0;
                max = array[0];
                min = array[0];
                for(ave=0;ave<array.length;ave++){
                    total += array[ave];
                }
                avg = total/array.length;
                
                for(maks=0;maks<array.length;maks++){
                    if(max < array[maks]){
                        max = array[maks];
                    }
                }
                
                for(mins=0;mins<array.length;mins++){
                    if(min > array[mins]){
                        min = array[mins];
                    }
                }
                
                System.out.println("\nHasil");
                System.out.print("Data sebelum diurutkan: ");
                for(i=0;i<jumlah;i++){
                    System.out.print(array[i]+",");
                }
                System.out.print("\nData sesudah diurutkan: ");
                for(i=0;i<jumlah;i++){
                    System.out.print(angka_1[i]+",");
                }
                System.out.printf("\nRata-rata : %f",avg);
                System.out.printf("\nNilai maks: %d",max);
                System.out.printf("\nNilai mins: %d",min);
                
                System.out.print("\nMau ulang?(y/n) ");
                ulang = input.next().charAt(0);
                switch(ulang){
                    case 'y':
                        break;
                    case 'n':
                    default:
                        return;
                }
            }catch(Exception e){
                System.err.println("Gagal mengimput data!!!!");
                System.out.println(e);
                return;
            }
        }
    }
    
}
