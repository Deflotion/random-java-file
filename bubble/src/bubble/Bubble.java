package bubble;
import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //array
        int i,j,data,jumlah,temp;
        jumlah = 0;

        int pilih;
        char ulang;
        boolean mengulang = true;

        while(mengulang){
            try{
                System.out.println("----------Halo----------");
                System.out.print("Masukan jumlah angka: ");
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

                System.out.println("\nPilih metode:");
                System.out.println("1. Ascending");
                System.out.println("2. Descending");
                System.out.print("Pilih: ");
                pilih = input.nextInt();
                switch(pilih){
                    case 1:
                        for(i=0;i<jumlah;i++){
                            for(j=i;j<jumlah;j++){
                                if(angka_1[i]>angka_2[j]){
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
                                if(angka_1[i]<angka_2[j]){
                                    temp = angka_1[i];
                                    angka_1[i] = angka_1[j];
                                    angka_1[j] = temp;
                                }
                            }
                        }
                        break;
                    default:
                        break;
                }

                //rata-rata,min,maks
                double avg,total;
                int rata;
                total = 0;
                for(rata=0;rata<array.length;rata++){
                    total += array[rata];
                }
                avg = total/array.length;

                int maks,max;
                max = array[0];
                for(maks=0;maks<array.length;maks++){
                    if(max < array[maks]){
                        max = array[maks];
                    }
                }

                int mins,min;
                min = array[0];
                for(mins=0;mins<array.length;mins++){
                    if(min > array[mins]){
                        min = array[mins];
                    }
                }


                System.out.print("\nData sebelum diurutkan: ");
                for(i=0;i<jumlah;i++){
                    System.out.print(array[i]+",");
                }
                System.out.print("\nData sesudah diurutkan: ");
                for(i=0;i<jumlah;i++){
                    System.out.print(angka_1[i]+",");
                }
                System.out.printf("\nNilai rata-rata : %f",avg);
                System.out.printf("\nNilai maksimun  : %d",max);
                System.out.printf("\nNilai minimum   : %d",min);

                System.out.println("\n\n-------------");
                System.out.println("Mau ulang?(y/n) ");
                ulang = input.next().charAt(0);
                switch(ulang){
                    case 'y':
                        break;
                    case 'n':
                        return;
                    default:
                        System.err.println("Pilihan tidak ada");
                        return;
                }
            }catch(Exception e){
                System.err.println("Harus angka!!");
                System.out.println(e);
                return;
            }
        }
    }
    
}
