/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UTS_Soal2;

/**
 *
 * @author Batara Mahardika
 * TI-B
 * 21104410063
 */
public class Kinetik {
    double kinetik;
    final double Ek = 0.5;

    public double getKinetik() {
        return kinetik;
    }

    public void setKinetik(double massa, double kecepatan) {
        this.kinetik = Ek * massa * (kecepatan * kecepatan);
    }
    
    
}
