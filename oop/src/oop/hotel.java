package oop;
//Danny Revaldo
//XII-RPL 2
//OOP
public class hotel {
    //untuk memberi akses untuk mengedit attributs dalam package dan subclass yang sama
    protected String nama;
    protected int tipe,waktu;
    
    // membuat function nama
    public String getNama(){
        return nama;
    }
    
    //membuat method nama
    public void setNama(String nama){
        this.nama = nama;
    }
    
    //membuat function tipe
    public int getTipe(){
        return tipe;
    }
    
    //membuat method tipe
    public void setTipe(int tipe){
        this.tipe = tipe; 
    }
    
    //membuat function waktu
    public int getWaktu(){
        return waktu;
    }
    
    //membuat method waktu
    public void setWaktu(int waktu){
        this.waktu = waktu;
    }
}
