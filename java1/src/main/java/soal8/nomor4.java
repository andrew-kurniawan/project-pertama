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
public class nomor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double upah = 2500;
        double pajak = 0.15;
        double jam, gajibersih, potongpajak, total;
        
        System.out.print("Upah Per Jam = 2500 \n");
        System.out.print("Pajak 15% \n");
        System.out.print("Masukkan Jumlah Jam Kerja = ");
        jam = input.nextDouble();
        gajibersih = jam*upah;
        potongpajak = gajibersih*pajak;
        total = gajibersih-potongpajak;
        System.out.print("Total Upah Yang Diterima = " + total);
       
        }
    }
   
