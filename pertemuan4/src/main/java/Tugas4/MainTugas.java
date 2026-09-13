/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas4;  
  
public class MainTugas {  
    public static void main(String[] args) {  
        // Inisialisasi objek Pekerja  
        Pekerja pekerja1 = new Pekerja("Budi Santoso", 28, "Software Engineer", 12500000);  
  
        // 1. Tampilkan data awal via toString()  
        System.out.println(pekerja1);  
  
        // 2. Ubah nama pekerja menggunakan setter lalu tampilkan ulang  
        pekerja1.setNama("Budi Wicaksono");  
        System.out.println("\nSetelah nama diubah:");  
        System.out.println(pekerja1);  
  
        // 3. Eksperimen akses langsung atribut  
        System.out.println("\n--- Pengujian Akses Langsung ---");  
        System.out.println("Akses pekerjaan (public) : " + pekerja1.pekerjaan); // Berhasil  
        System.out.println("Akses usia (protected)   : " + pekerja1.usia);      // Berhasil (karena masih dalam package Tugas)  
  
        // Uji coba akses atribut private (akan memicu compiler error jika diaktifkan):  
        // System.out.println(pekerja1.nama); // ERROR: nama has private access in Manusia  
        // System.out.println(pekerja1.gaji); // ERROR: gaji has private access in Pekerja  
    }  
}  