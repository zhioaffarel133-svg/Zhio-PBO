/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;  
  
public class Pekerja extends Manusia {  
    // Atribut tambahan private  
    private double gaji;  
  
    // Constructor memanggil constructor kelas induk (super)  
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {  
        super(nama, usia, pekerjaan);  
        this.gaji = gaji;  
    }  
  
    // Getter dan Setter untuk gaji  
    public double getGaji() {  
        return gaji;  
    }  
  
    public void setGaji(double gaji) {  
        this.gaji = gaji;  
    }  
  
    // Override metode toString() untuk menampilkan seluruh info  
    @Override  
    public String toString() {  
        return "=== Data Pekerja ===" +  
               "\nNama      : " + getNama() +  
               "\nUsia      : " + usia + " tahun" +  
               "\nPekerjaan : " + pekerjaan +  
               "\nGaji      : Rp " + String.format("%,.2f", gaji);  
    }  
}  