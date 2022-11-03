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
public class cekKesehatan {
    public static void main(String[] args) {
        String kis,kws,nkws,nk;
        
        Scanner cek = new Scanner(System.in);
        
        System.out.println("apakah anda mempunyai kis? : ");
        kis = cek.nextLine();
        System.out.println("apakah anda tidak mempunyai kis tapi warga setempat? : ");
        kws = cek.nextLine();
        System.out.println("apakah anda tidak mempunyai kis dan bukan warga setempat? : ");
        nkws = cek.nextLine();
        
        if (kis = "ya"){
            System.out.println("3899");
        }
    }
}
