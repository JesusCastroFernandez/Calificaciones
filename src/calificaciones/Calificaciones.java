/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificaciones;

import java.util.Scanner;

/**
 *
 * @author JESUS
 */
public class Calificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variables
        Scanner teclado = new Scanner(System.in);  // Objeto Scanner para la lectura desde teclado
        double calificacionNumerica;               // Variable de entrada
        String calificacionCualitativa= "SUSPENSO"; // Variable de salida

        // Entrada de datos
        System.out.print("Introduzca la calificación (entre 0.0 y 10.0): ");
        calificacionNumerica= teclado.nextDouble();

        // Procesamiento
        if (calificacionNumerica>=5 ) {
            calificacionCualitativa= "APROBADO";
            } else {
            calificacionCualitativa= "SUSPENSO";
}

// Salida de resultados
System.out.println (calificacionCualitativa);
    }
}
