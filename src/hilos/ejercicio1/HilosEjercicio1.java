/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilos.ejercicio1;

/**
 *
 * @author carlos
 */
public class HilosEjercicio1 {

    public static void main(String[] args) {
        // Crear las instancias de los hilos
        HiloAscendente hiloAscendente = new HiloAscendente();
        HiloDescendente hiloDescendente = new HiloDescendente();

        // Iniciar los hilos
        hiloAscendente.start();
        hiloDescendente.start();
    }

}


