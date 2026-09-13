/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;  
  
public class Manusia {  
    // Definisi atribut sesuai ketentuan modifier di modul  
    private String nama;        // Hanya diakses di kelas Manusia  
    protected int usia;         // Diakses di package yang sama dan subclass  
    public String pekerjaan;    // Diakses bebas dari mana saja  
  
    // Constructor  
    public Manusia(String nama, int usia, String pekerjaan) {  
        this.nama = nama;  
        this.usia = usia;  
        this.pekerjaan = pekerjaan;  
    }  
  
    // Getter dan Setter untuk atribut nama  
    public String getNama() {  
        return nama;  
    }  
  
    public void setNama(String nama) {  
        this.nama = nama;  
    }  
}  