/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal8;

/**
 *
 * @author HP
 *
 */

import java.util.Scanner;
public class nomor3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    int upah = 2500;
    int jam, jumlah;
    
    System.out.print ("Upah Per Jam = 2500\n");
    
    System.out.print ("Masukkan Total Jam Kerja = \n");
    jam = input.nextInt();
    jumlah = upah*jam;
   
    System.out.print("Upah Yang Diterima = " + jumlah);
    }
    
    
}
