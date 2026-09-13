/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author acer
 */
public class Hewanmain {

    public static void main (String[] args) {
        Hewan kucing = new Hewan("Mimi", 7);
        kucing.suara();
        kucing.info();
        Hewan anjing = new Hewan("Leo", 8);
        anjing.info();
        anjing.berlari();
    }
}
