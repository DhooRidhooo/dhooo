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
public class ifElse {
    public static void main(String[] args) {
        String nama;
        int nilai;
        
        Scanner lulus = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Anda : ");
        nama = lulus.nextLine();
        System.out.print("Masukkan Nilai Anda : ");
        nilai = lulus.nextInt();
        
        if (nilai >= 75 && nilai < 100){
            System.out.println("Selamat "+nama+" Anda Lulus");
        }else if (nilai < 75 && nilai > 0){
            System.out.println("Maaf "+nama+" Anda Belum Lulus");
        }else {
            System.out.println("Nilai Tidak Terdeteksi");
        }
    }
}
