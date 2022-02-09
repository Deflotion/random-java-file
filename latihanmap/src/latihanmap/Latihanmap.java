package latihanmap;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class Latihanmap {

    public static void main(String[] args) {
        HashMap<String , Integer>buah = new HashMap<String , Integer>();
        
        System.out.println("HashMap");
        buah.put("apel", 22);
        buah.put("mangga", 22);
        buah.put("jeruk", 22);
        buah.put("semangka", 22);
        
        for(HashMap.Entry b:buah.entrySet()){
            System.out.println("nama buah: " + b.getKey() + "\njumlah: " + b.getValue());
        }
        
        LinkedHashMap<Integer, String> fruit = new LinkedHashMap<Integer, String>();

        System.out.println("\nLinkedHashMap");
        fruit.put(22, "apel");
        fruit.put(23, "mangga");
        fruit.put(25, "alpukat");
        fruit.put(27, "jeruk");
        
        for(Map.Entry f:fruit.entrySet()){
            System.out.println("nama buah: " + f.getKey() + "\njumlah: " + f.getValue());
        }
        TreeMap<Integer, String> buahbuah = new TreeMap<Integer, String>();

        System.out.println("\nTreeMap");
        fruit.put(22, "apel");
        fruit.put(23, "mangga");
        fruit.put(25, "alpukat");
        fruit.put(27, "jeruk");
        
        for(Map.Entry bb:buahbuah.entrySet()){
            System.out.println("nama buah: " + bb.getKey() + "\njumlah: " + bb.getValue());
        }
    }
}
