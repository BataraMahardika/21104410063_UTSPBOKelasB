/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UTS_Soal1;

/**
 *
 * @author Batara Mahardika
 * TI-B
 * 21104410063
 */
public class Dangdut {
    String penyanyi = "Ayu Ting Ting";
    String lagu = "Alamat Palsu";
    
    Dangdut(){
        
    }
    
    public void singer(String penyanyi){
        this.penyanyi = penyanyi;
    }
    
    public void song(String lagu){
        this.lagu = lagu;
    }
    
    public void cetakLabel(){
        System.out.println( this.penyanyi + " <=> " + this.lagu);
    }

    void song(String via_Vallen, String kopi_Dangdut) {
        
    }
}
