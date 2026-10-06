/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RESPONSI_UTS;

public class Main {
    public static void main(String[] args) {
        // Dua objek Produk & dua objek Pegawai, semua dipegang referensi induk
        Produk produk1 = new Elektronik("Laptop", 15000000, 2);
        Produk produk2 = new Makanan("Snack", 15000, "2023-12-30");
        Pegawai pegawai1 = new PegawaiTetap("Zhio", 5000000, 1000000); // ganti "Budi" dengan namamu
        Pegawai pegawai2 = new PegawaiKontrak("Andi", 3000000, 12);

        System.out.println("1. Output Produk");
        produk1.tampilkanInfo();

        System.out.println("\n2. Output Pegawai");
        pegawai1.tampilkanInfo();

        System.out.println("\n3. Output Polimorfisme");
        produk2.tampilkanInfo();
        pegawai2.tampilkanInfo();
    }
}