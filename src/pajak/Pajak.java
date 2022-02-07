/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pajak;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Pajak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int gaji;
        String nama;
        
        System.out.println("-------------------------------------------");
        System.out.println("-------------PROGRAM PAJAK-----------------");
        System.out.println("-------------------------------------------");
        System.out.print  ("Masukkan Nama Karyawan = " );
        nama = input.nextLine();
        System.out.print  ("Masukkan Gaji Karyawan = " );
        gaji = input.nextInt();
        if (gaji > 10000){
            System.out.println("Kena Pajak 10% = " + (gaji * 10)/100);
            System.out.println("-------------------------------------------");
            System.out.println("-----PROGRAM PAJAK BY Skuy DEVELOPER------");
            System.out.println("-------------------------------------------");
        }
        else{
            System.out.println("Kena Pajak 8% = " + (gaji * 8)/100);
            System.out.println("-------------------------------------------");
            System.out.println("-----PROGRAM PAJAK BY Skuy DEVELOPER------");
            System.out.println("-------------------------------------------");
        }
    }
    
}
