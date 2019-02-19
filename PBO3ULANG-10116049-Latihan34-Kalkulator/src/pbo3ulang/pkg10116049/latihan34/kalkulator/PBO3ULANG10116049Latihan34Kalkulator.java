/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan34.kalkulator;

import java.util.Scanner;

/**
 *
 * @author ibadguthwara
 * NAMA              : M. Ibad Guthwara
 * KELAS             : PBO 3 ULANG
 * NIM               : 10116049
 * DESKRIPSI PROGRAM : Program ini berisi untuk menampilkan Hasil Perhitungan
 */
public class PBO3ULANG10116049Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Aplikasi Kalkulator Bilangan =====");
        System.out.print("Value 1\t: ");
        int value1 = scanner.nextInt();
        System.out.print("Value 2\t: ");
        int value2 = scanner.nextInt();
        System.out.println();

        Kalkulator kal = new Kalkulator(value1, value2);
        kal.tambahBilangan();
        kal.kurangBilangan();
        kal.kaliBilangan();
        kal.bagiBilangan();
        kal.sisaBilangan();
    }
    
}
