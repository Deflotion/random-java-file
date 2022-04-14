/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsp02;

/**
 *
 * @author ASUS
 */
public class Hotel {
    protected String nama;
    protected int tipe,waktu;
    
    public String getName(){
        return nama;
    }
    
    public int getTipe(){
        return tipe;
    }
    
    public int getWaktu(){
        return waktu;
    }
    
    public void setName(String nama){
        this.nama = nama;
    }
    
    public void setTipe(int tipe){
        this.tipe = tipe;
    }
    
    public void setWaktu(int waktu){
        this.waktu = waktu;
    }
}
