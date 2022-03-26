package oop;
//Danny Revaldo
//XII-RPL 2
//OOP
public class tarifhotel extends hotel{
       private int tarif,total;
       private String kamar,diskon;
       
       //methode harga
       public int get_Harga(){
           if(tipe == 1){
               tarif = 450000;
           }else if(tipe == 2){
               tarif = 900000;
           }else if(tipe == 3){
               tarif = 1500000;
           }
           return tarif;
       }
       
       //method tipe kamar
       public String get_Kamar(){
           if(tipe == 1){
               kamar = "Biasa";
           }else if(tipe == 2){
               kamar = "Ekonomi";
           }else if(tipe == 3){
               kamar = "VIP";
           }
           return kamar;
       }
       
       //method diskon
       public String get_Diskon(){
           if(waktu > 5 && waktu <= 10){
               diskon = "15%";
           }else if(waktu > 10 && waktu <=20){
               diskon = "25%";
           }else{
               diskon = "Tidak ada";
           }
           return diskon;
       }
       
       //method total harga
       public int get_Total(){
           if(waktu > 5&& waktu <= 10){
               return (tarif*waktu)-((tarif*waktu)*15/100);   
          }else if(waktu > 10 && waktu <=20){
              return (tarif*waktu)-((tarif*waktu)*25/100);
          }
           else{
               return tarif*waktu;
           }
       }
}