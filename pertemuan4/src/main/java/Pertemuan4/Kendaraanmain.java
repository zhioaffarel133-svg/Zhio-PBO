/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan4;   
public class Kendaraanmain {  
    public static void main(String[] args) {  
        // Membuat objek Mobil  
        Mobil mobil = new Mobil("Toyota Avanza", 180, "Bensin", 5);  
  
        System.out.println("=== Info Kendaraan ===");  
        mobil.tampilkanInfoKendaraan();  
  
        System.out.println("\n=== Info Mobil ===");  
        mobil.tampilkanInfoMobil();  
    }  
} 