/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UTS_Soal2;

import java.util.Scanner;

/**
 *
 * @author Batara Mahardika
 * TI-B
 * 21104410063
 */
public class MainEnergi {
    public static void main(String[] args) {
        
        Kinetik kinetik = new Kinetik();
        
        double kecepatan, massa;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Massa benda     : ");
        massa = input.nextDouble();
        System.out.print("Masukkan kecepatan benda : ");
        kecepatan = input.nextDouble();
        
        kinetik.setKinetik(massa, kecepatan);
        
        System.out.println("Hasilnya adalah : " + kinetik.getKinetik());
    }
}
