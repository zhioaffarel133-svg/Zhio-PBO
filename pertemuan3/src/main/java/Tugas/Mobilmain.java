/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas;

/**
 *
 * @author acer
 */
public class Mobilmain {
    public static void main (String[] args) {
        Mobil mbl1 = new Mobil ("Chervolet", "Chr99", 2009, "Abuabu");
        Mobil mbl2 = new Mobil ("Porcse", "Prc99", 2013, "Kuning");
        
        mbl1.displayInfo(1);
        mbl2.displayInfo(2);
        
        mbl1.gantiWarna("Hitam", 1);
        mbl1.displayInfo(1);
    }
}
