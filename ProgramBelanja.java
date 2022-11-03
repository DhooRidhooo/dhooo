/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class ProgramBelanja {
    public static void main(String[] args) {
        int total,bayar;
        
        Scanner belanja = new Scanner(System.in);
        
        System.out.print("Masukkan Total Belanja Anda : Rp");
        total = belanja.nextInt();
        
        if (total > 100000){
            bayar = total - 10000;
            System.out.println("Bayar : Rp"+bayar);
        }else if (total > 150000){
            bayar = total - 20000;
            System.out.println("Bayar : Rp"+bayar);
        }else if (total > 300000){
            bayar = total - 50000;
            System.out.println("Bayar : Rp"+bayar);
        }else if (total > 500000){
            bayar = total - 75000;
            System.out.println("Bayar : Rp"+bayar);
        }
    }
}
