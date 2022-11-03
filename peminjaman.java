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
public class peminjaman {
    public static void main(String[] args) {
        int pinjam,total;
        double diskon,bayar;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Berapa Jumlah Buku Yang Anda Pinjam : ");
        pinjam = in.nextInt();
        
        switch (pinjam){
            case 1 : System.out.println("Anda Harus Membayar Rp10.000");
            break;
            case 2 : System.out.println("Anda Harus Membayar Rp20.000");
            break;
            case 3 : System.out.println("Anda Harus Membayar Rp30.000");
            break;
            case 4 : total = 40000;
                     diskon = total*2.5/100;
                     bayar = total - diskon;
                     System.out.println("Anda Mendapatkan Diskon 2,5% Dan Hanya Membayar Rp"+bayar);
            break;
            case 5 : total = 50000;
                     diskon = total*5/100;
                     bayar = total - diskon;
                     System.out.println("Anda Mendapatkan Diskon 5% Dan Hanya Membayar Rp"+bayar);
            break;
            case 10 : total = 50000;
                     diskon = total*10/100;
                     bayar = total - diskon;
                     System.out.println("Anda Mendapatkan Diskon 10% Dan Hanya Membayar Rp"+bayar);
            break;
            default : System.out.println("Anda Melebihi Batas Atau");
        }
    }
}
