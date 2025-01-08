/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos.ejercicio1;

/**
 *
 * @author carlo
 */
public class HiloAscendente extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100000; i++) {
            System.out.println("Ascendente: " + i);
        }
    }
}