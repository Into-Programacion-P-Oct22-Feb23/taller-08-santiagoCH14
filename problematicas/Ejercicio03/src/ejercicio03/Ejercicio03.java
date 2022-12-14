/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author DETPC
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double numero;
        String mensaje = "";
        double transformacion;

        double numerador = 5;
        double denominador = 9;
        double division = numerador / denominador;

        for (numero = 20; numero <= 80; numero += 4) {

            transformacion = division * (numero - 32);

            mensaje = String.format("%s%.0f\t%.2f\n",
                     mensaje, numero, transformacion);

        }

        System.out.printf("°F\t°C\n%s", mensaje);
    }

}
