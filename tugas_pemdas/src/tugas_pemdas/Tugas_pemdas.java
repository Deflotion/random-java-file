//Danny Revaldo
//XII-RPl 2
//Tugas LSP Pemdas
package tugas_pemdas;
import java.util.Scanner;

public class Tugas_pemdas {

    public static void main(String[] args) {
        //variable untuk array(input dan sort)
        int i,j,temp,data,jumlah;        
        jumlah = 0;
        
        //variable untuk looping while
        int pilih;
        char ulang;
        boolean mengulang = true;
        
        //object Scanner
        Scanner input = new Scanner(System.in);
        
        //menaruh looping while
        while(mengulang){
            //menggunakan try untuk jika kesalahan input akan otomatis stop
            try{          
                System.out.println("<===================================>");
                System.out.println("Selamat datang");
                System.out.print("Jumlah angka: ");
                jumlah = input.nextInt();
                int array[] = new int[jumlah];
                int nilai_1[] = new int[jumlah];
                int nilai_2[] = new int[jumlah];
                
                //untuk menentukan dan menyimpan array
                for(i=0;i<jumlah;i++){
                    System.out.print("Angka ke-"+(i+1)+": ");
                    data = input.nextInt();
                    array[i] = data;
                    nilai_1[i] = data;
                    nilai_2[i] = data;
                }
                
                //membuat metode pengurutan
                System.out.println("\n<===================================>");
                System.out.println("Tentukan metode:");
                System.out.println("1. Ascending");
                System.out.println("2. Descending");
                System.out.print("Pilih: ");
                pilih = input.nextInt();
                //membuat switch
                switch(pilih){
                    case 1:
                        //membuat ascending
                        for(i=0;i<jumlah;i++){
                            for(j=i;j<jumlah;j++){
                                if(nilai_1[i]>nilai_2[j]){
                                    temp = nilai_1[i];
                                    nilai_1[i] = nilai_1[j];
                                    nilai_1[j] = temp;
                                }
                            }
                        }
                        break;
                    case 2:
                        //membuat descending
                        for(i=0;i<jumlah-1;i++){
                            for(j=i;j<jumlah;j++){
                                if(nilai_1[i]<nilai_2[j]){
                                    temp = nilai_1[i];
                                    nilai_1[i] = nilai_1[j];
                                    nilai_1[j] = temp;
                                }
                            }
                        }
                        break;
                }
                
                //menentukan rata-rata
                //membuat variable
                double avg,total;
                int rata;
                total = 0;
                //membuat looping mengambil data dari array
                for(rata=0;rata<array.length;rata++){
                    total += array[rata];
                }
                //rumus rata-rata
                avg = total/array.length;
                
                //menentukan nilai maksimal
                //membuat variable
                int maks,max;
                max = array[0];
                //membuat looping untuk mencari nilai terbesar
                for(maks=0;maks<array.length;maks++){
                    //untuk mencari nilai terbesar
                    if(max < array[maks]){
                        max = array[maks];
                    }
                }
                
                //menentukan nilai minimal
                //membuat variable
                int mins,min;
                min = array[0];
                //membuat looping untuk mencari nilai terbesar
                for(mins=0;mins<array.length;mins++){
                    //untuk mencari nilai terbesar
                    if(min > array[mins]){
                        min = array[mins];
                    }
                }
                
                //membuat output
                System.out.print("Data sebelum diurutkan: ");
                //membuat looping untuk mengambil data array
                for(i=0;i<jumlah;i++){
                    System.out.print(array[i]+",");
                }
                System.out.print("\nData sesudah diurutkan: ");
                //membuat looping untuk mengambil data yg sudah diurutkan
                for(i=0;i<jumlah;i++){
                    System.out.print(nilai_1[i]+",");
                }
                //ounput untuk data-rata,maks,min
                System.out.println("\nNilai rata-rata: "+avg);
                System.out.println("Nilai maksimal: "+max);
                System.out.println("Nilai minimal: "+min);
                
                //membuat aksi untuk menghentikan looping ulang atau tidak
                System.out.print("\nIngin kembali keawal?(y/n) ");
                ulang = input.next().charAt(0);
                //membuat switch
                switch(ulang){
                    case 'y':
                        break;
                    case 'n':
                        mengulang = false;
                        System.exit(0);
                        break;
                    default:
                        System.err.println("Pilihan tidak ada!");
                        mengulang = false;
                        System.exit(0);
                }
            }catch(Exception e){
                System.err.println("Harap input yang benar!!");
                System.exit(0);
        }
    }
    }
}
