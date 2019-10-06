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
public class nomor1 {
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int harga = 660000;
    int jumlah, total;
    
    System.out.print ("Harga Printer = 660.000\n");
    
    System.out.print ("Masukkan Jumlah Barang = ");
    jumlah = input.nextInt();
    total = harga*jumlah;
   
    System.out.print("Total Yang Harus Dibayar Bayar = " + total);
    
}
}
