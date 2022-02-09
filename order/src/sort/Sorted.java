package sort;

import java.util.Scanner;

public class Sorted {
// sort data dengan input user mengunakan bubble sort
    public static void main(String[] args) {
        //untuk yang melakukan perhitungan
        int fn_1, fn_2, fn, data, n;
        n = 0;
        //untuk while loop
        int pilih;
        char ulang;
        boolean ulangilagi = true;
        //untuk input user
        Scanner input = new Scanner(System.in);
        //looping untuk kembali ke awal
        while(ulangilagi){
        //untuk menentukan jumlah data berdasarkan user input
        System.out.println("############################################");
        System.out.print("Banyaknya jumlah data : ");
        try {
            n = input.nextInt();
        
        }catch (Exception e) {
                    System.err.println("Data harus angka!");
                    System.exit(0);
        }
        /*membuat array untuk menyimpan data dan menentukan angka pada setiap data
        yang sudah ditentukan diawal*/
        int angka[] = new int[n];
        int nilai_pertama[] = new int[n];
        int nilai_selanjutnya[] = new int[n];
            try{
                for(fn_1=0; fn_1<n; fn_1++){
                System.out.print("Angka ke - " + (fn_1 + 1) + " : ");
                data = input.nextInt();
                angka[fn_1] = data;
                nilai_pertama[fn_1] = data;
                nilai_selanjutnya[fn_1] = data;
            }}catch(Exception e){
                System.err.println("Data Harus angka!");
                System.exit(0);
            }
        //memilih metode pengurutan berdasarkan user input2
        System.out.println("\n###########################################");
        System.out.println("Pilih metode pengurutan");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        System.out.print("Pilih metode: ");
        try{
        pilih = input.nextInt();
        switch(pilih){
            // case 1 untuk metode ascending
            case 1:
                for(fn_1=0; fn_1<n; fn_1++){
                    for(fn_2=fn_1;fn_2<n;fn_2++){
                        if(nilai_pertama[fn_1] > nilai_selanjutnya[fn_2]){
                        fn = nilai_pertama[fn_1];
                        nilai_pertama[fn_1] = nilai_pertama[fn_2];
                        nilai_pertama[fn_2] = fn;
                }
            }
        }
                break;
            case 2:
                //case 2 untuk metode descending
                for(fn_1=0; fn_1<n-1; fn_1++){
                    for(fn_2=fn_1; fn_2<n; fn_2++){
                        if(nilai_pertama[fn_1] < nilai_selanjutnya[fn_2]){
                        fn = nilai_pertama[fn_1];
                        nilai_pertama[fn_1] = nilai_pertama[fn_2];
                        nilai_pertama[fn_2] = fn;
                }
            }
        }
                break;
            default:
                System.err.println("Metode tidak ada");
                System.exit(0);
        }
        //untuk menampilkan data lama
        System.out.println("\nData sebelum diurutkan : ");
        for(fn_1=0; fn_1<n; fn_1++){
            System.out.print(angka[fn_1] + ", ");
        }
        //untuk menampilkan data yang sudah diurutkan
        System.out.println("\n\nData setelah diurutkan : ");
        for(fn_1=0; fn_1<n; fn_1++){
            System.out.print(nilai_pertama[fn_1] + ", ");
        }
        System.out.println("");
        //pilihan untuk loop ke awal lagi
        System.out.println("\nApakah anda ingin kembali kemenu awal? y/n");
                ulang = input.next().charAt(0);
                switch(ulang){
                    case 'y':
                        break;
                    case 'n':
                        ulangilagi = false;
                        break;
                    default:
                        System.err.println("Pilihan tidak ada");
                }
        }catch(Exception e){
            System.err.println("Pilih yang benar!");
            System.exit(0);
        }                
    }
    }

}
