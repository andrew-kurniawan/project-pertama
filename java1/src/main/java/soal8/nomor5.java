/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal8;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class nomor5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int tujuan, total ;
        int ongkos_sby = 2500;
        int ongkos_bdg = 4000;
        int jarak_sby = 169;
        int jarak_bdg = 452;
        
        // Tampilkan Daftar Tujuan
        System.out.print("Kota Tujuan \n");
        System.out.print("1. Surabaya \n");
        System.out.print("2. Bandung \n");
        // Input Pilihan Tujuan
        System.out.print ("Masukkan Kota Tujuan = ");
        tujuan = input.nextInt();
        // Tampilkan Ongkos Kirim
        switch (tujuan){
        case 1 : System.out.print ("Kota Tujuan = Surabaya \n");
                 System.out.print("Jarak Malang-Surabaya = 169km \n");
                 System.out.print("Ongkos Kirim Per Km = Rp. 2500 \n");
                 total = jarak_sby*ongkos_sby;
                 System.out.print("Total Biaya Kirim Ke Surabaya = " + total);
                 break;
        case 2 : System.out.print ("Kota Tujuan = Bandung \n");
                 System.out.print("Jarak Malang-Bandung = 452km \n");
                 System.out.print("Ongkos Kirim Per Km = Rp. 4000 \n");
                 total = jarak_bdg*ongkos_bdg;
                 System.out.print("Total Biaya Kirim Ke Bandung = " + total);
                 break;
                 
        }
    }
        
        
        
   
    }
    