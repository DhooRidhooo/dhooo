/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class listBioskop {
    public static void main(String[] args) {    

        String film="Harry Potter"; 
        String umur;
          
        switch(film){    
        case "Toy Story": umur="Semua Umur";  
        break;    
        case "Harry Potter": umur="13+";  
        break;    
        case "Sayap Sayap Patah": umur="17+";  
        break;  
        default: umur="21+";  
        break;  
        }    
        System.out.println("film Khusus "+umur);  
    }
}
