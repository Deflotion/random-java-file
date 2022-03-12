package pemdas;
import java.util.Scanner;

public class tes {
    
    // Membuat object Scanner untuk input user
    static Scanner input = new Scanner(System.in);
    
    // Method mengurut array dengan Ascending
    static int[] Ascending(int array[]){
        boolean adaSwap = true; // Membuat variable boolean
        int temp = 0; // Membuat variable int
        
        // Algoritma Ascending
        while(adaSwap){ // Ulang disaat ada pertukaran
            adaSwap = false; // Variable boolean bernilai false
            for(int i=0; i < array.length-1; i++){ // Mengurutkan nilai index satu per satu
                if(array[i] > array[i+1]){// Cek jika index yang dipilih lebih dari index berikutnya
                    // Jika benar, nilai-nilai akan ditukar
                    temp = array[i]; 
                    array[i] = array[i+1];
                    array[i+1] = temp;                    
                    // Variablenya bernilai true karna ada pertukaran
                    adaSwap = true;
                }
            }
        }    
        // Mengembalikan hasil data yang sudah disortir
        return array;
    }
    
    // Method mengurut array dengan Descending
    static int[] Descending(int array[]){
        boolean adaSwap = true;// Membuat variable boolean
        int temp = 0;// Membuat variable int        
        // Algoritma Descending
        while(adaSwap){ // Ulang disaat ada pertukaran
            adaSwap = false; // Variable boolean bernilai false
            for(int i=0; i < array.length-1; i++){// Mengurutkan nilai index satu per satu
                if(array[i] < array[i+1]){// Cek jika index yang dipilih kurang dari index berikutnya                   
                    // Jika benar, nilai-nilai akan ditukar
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;                
                    // Variablenya bernilai true karna ada pertukaran
                    adaSwap = true;
                }
            }
        }
        
        // Mengembalikan hasil data yang sudah disortir
        return array;
    }
    
    // Membuat urutan bilangan untuk array yang ingin dibuat
    static int[] initArray(){
        int jumlh; // Membuat variable int
       
        System.out.print("Masukkan jumlah bilangan: ");// Menampilkan output data
        jumlh = input.nextInt(); // Mengambil input dari inputan user untuk variable
        int array[] = new int[jumlh]; // Membuat array sesuai jumlah yang diinginkan
        
        // Mengisi array yang sudah dibuat
        for(int a=0; a<jumlh; a++){
            System.out.print("Bilangan Ke-" + (a+1) + ": ");
            array[a] = input.nextInt();// Mengambil input dati inputan user untuk array
        }
       
       // Mengembalikan hasil data 
       return array;
    }
    
    // Menentukan nilai Maximal dari hasil array
    static int max(int[] array){
        int max = array[0]; // Membuat variable max dengan index array 0
        
        // Menentukan nilai Maximal
        for(int a=0; a < array.length; a++){
            if(max < array[a]){ // Jika hasil sortir lebih kecil nilai yang dipilih (a)
                max = array[a]; // Maka hasil sortir = nilai yang dipilih
            }
        }
        
        // Mengembalikan hasil data
        return max;
    }
    
    // Menentukan nilai Minimal dari hasil array
    static int min(int[] array){
        int min = array[0];// Membuat variable min dengan index array 0
        
        // Menentukan nilai Minimal
        for(int a=0; a < array.length; a++){
            if(min > array[a]){// Jika hasil sortir lebih kecil nilai yang dipilih (a)
                min = array[a];// Maka hasil sortir = nilai yang dipilih
            }
        }
        
        // Mengembalikan hasil data
        return min;
    }
    
    // Menentukan nilai Rata-rata dari hasil array
    static double avg(int[] array){
        double avg, jumlah = 0;// Membuat variable double untuk nilai rata-rata dan jumlah array
        
        // Menjumlahkan semua data dalam array
        for(int a=0; a < array.length; a++){
            jumlah =+ array[a];
        }
        
        // Mencari rata-rata dengan hasil jumlah array dengan panjang array
        avg = jumlah / array.length;
        
        // Mengembalikan hasil data
        return avg;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Membuat variable yang dibutuhkan
        int pilih, array[], hasil[];             
        array = initArray(); // Membuat urutan bilangan untuk array yang ingin dibuat      
        hasil = new int[array.length];// Menentukan panjang hasil array
        
        // Memilih metode Bubble Sort
        System.out.println("\nPilih Metode");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        System.out.print("Pilihan :");
        pilih = input.nextInt(); // Inputan dari user
        
        // Menentukan pilihan user untuk memilih metode sortir
        switch(pilih){
            case 1:
                hasil = Ascending(array);
            break;
            case 2:
                hasil = Descending(array);
            break;
        }
        
        // Output array sebelumnya
        System.out.println("\nData sebelumnya : ");
        for(int num : array){
            System.out.print(num + ", ");
        }
        
        // Output hasil sortir
        System.out.println("\nHasil list sortir: ");
        for(int rafi : hasil){
            System.out.print(rafi + ", ");
        }
        
        // Output hasil Max, Min, dan Rata-rata
        System.out.println("\nMaximal : " + max(hasil));
        System.out.println("Minimal : " + min(hasil));
        System.out.println("Rata-rata : " + avg(hasil));
            
    }
    
}