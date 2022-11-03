/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class swicthCaseKendaraan { 
    public static void main(String[] args) {    

        String kendaraan="motor"; 
        int penumpang;
          
        switch(kendaraan){    
        case "sepeda": penumpang=1;  
        break;    
        case "motor": penumpang=2;  
        break;    
        case "mobil": penumpang=4;  
        break;  
        case "bus": penumpang=30;  
        break;
        default: penumpang=0;  
        break;  
        }    
        System.out.println("Disarankan penumpang maksimal "+penumpang+" orang");  
    }
}

