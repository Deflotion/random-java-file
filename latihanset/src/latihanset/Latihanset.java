package latihanset;
import java.util.ArrayList;
import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.TreeSet;
        

class buahbuah{
    String nama;
    int jumlah;
    
    buahbuah(String nama, int jumlah){
       this.nama = nama;
       this.jumlah = jumlah;
    }
}  
public class Latihanset {

  
    public static void main(String[] args) {
        ArrayList<buahbuah> buah = new ArrayList<buahbuah>();
        HashSet<buahbuah> fruit = new HashSet<buahbuah>();
//        LinkedHashSet<buahbuah> namanama = new LinkHashSet<buahbuah>();
        
        
        buahbuah buah1 = new buahbuah("apel", 15);
        buahbuah buah2 = new buahbuah("mangga", 13);
        buahbuah buah3 = new buahbuah("jeruk", 12);
        buahbuah buah4 = new buahbuah("alpukat", 19);
        
        fruit.add(buah1);
        fruit.add(buah2);
        fruit.add(buah3);
        fruit.add(buah4);
        
        System.out.println("hashset");
        for(buahbuah f : fruit){
            System.out.println("nama buah " + f.nama + "\njumlah: " + f.jumlah);
            
        }
//        namanama.add(buah2);
//        namanama.add(buah1);
//        namanama.add(buah4);
//        namanama.add(buah3);
//        
//        System.out.println();
//        for(namanama fr : fruit){
//            System.out.println("nama buah " +fr.nama  "\njumlah: " + f.jumlah)
        } 
    
}
