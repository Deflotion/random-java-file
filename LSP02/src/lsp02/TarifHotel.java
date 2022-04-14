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
public class TarifHotel extends Hotel{
    private String kamar,diskon;
    private int tarif,disk;
    
    public int get_Harga(){
        if(tipe==1){
            tarif = 300000;
        }else if(tipe == 2){
            tarif = 400000;
        }else if(tipe == 3){
            tarif = 600000;
        }
        return tarif;
    }
    
    public String get_Kamar(){
        if(tipe==1){
            kamar = "Biasa";
        }else if(tipe == 2){
            kamar = "Ekonomi";
        }else if(tipe == 3){
            kamar = "First class";
        }
        return kamar;
    }
    
    public String get_Diskon(){
        if(waktu >=5 && waktu < 12){
            diskon = "20%";
        }else if(waktu >= 12 && waktu < 17){
            diskon = "25%";
        }else if(waktu >= 17){
            diskon = "35%";
        }else{
            diskon = "Tidak ada";
        }
        return diskon;
    }
    
    public int get_Disk(){
        if(waktu >=5 && waktu < 12){
            disk = (tarif*waktu)*20/100;
        }else if(waktu >= 12 && waktu < 17){
            disk = (tarif*waktu)*25/100;
        }else if(waktu >= 17){
            disk = (tarif*waktu)*35/100;
        }else{
            diskon = "Tidak ada";
        }
        return disk;
    }
    
    public int get_Total(){
        if(waktu >=5 && waktu < 12){
            return (tarif*waktu)-((tarif*waktu)*20/100);
        }else if(waktu >= 12 && waktu < 17){
            return (tarif*waktu)-((tarif*waktu)*25/100);
        }else if(waktu >= 17){
            return (tarif*waktu)-((tarif*waktu)*35/100);
        }else{
            return tarif*waktu;
        }
    }
}
