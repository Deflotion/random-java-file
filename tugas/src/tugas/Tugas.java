package tugas;

import java.util.ArrayList;

class Animal{
    String nama;
    int jumlah;
    
    Animal(String nm, int jmlh){
        this.nama = nm;
        this.jumlah = jmlh;
    }
}

public class Tugas {
    public static void main(String[] args) {
        
        ArrayList<Animal> hewan = new ArrayList<Animal>();
        ArrayList<Animal> hewan2 = new ArrayList<Animal>();
        System.out.println("Array List");
        
        for(int a = 0; a <= 10; a++){
            hewan.add(new Animal("ANJING" + a, 130 + a));
        }
        
        for(int b = 1; b <= 10; b++){
        hewan2.add(new Animal("KUCING" + b, 10 + b));
    }
        
        System.out.println("cara 1");
        for(int a = 0; a < hewan.size(); a++){
            System.out.println("nama" + hewan.get(a).nama+ "jumlah" + hewan.get(a).jumlah);
//            System.out.println(hewan.get(a).jumlah);
        }
        System.out.println("\ncara 2");
        System.out.println("print dengan objek");
        for(Animal h2: hewan2){
            System.out.println("nama adada" + h2.nama +"jumlah"+ h2.jumlah + 2021);
        }
    }
   
}