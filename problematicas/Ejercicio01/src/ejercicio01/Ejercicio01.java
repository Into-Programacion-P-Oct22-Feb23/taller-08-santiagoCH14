/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author DETPC
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int indice;
        int limite;
        String mensaje = "";
        String nombre[];
        String posicion[];
        int edad[];
        double estatura[];
        double contador = 1;
        double totalEdades;
        double totalEstaturas;
        double sumaEdades = 0;
        double sumaEstaturas = 0;
        String listaE = "";

        System.out.println("¿Cuantos jugadores vas a ingresar?");
        limite = entrada.nextInt();

        nombre = new String[limite];
        posicion = new String[limite];
        edad = new int[limite];
        estatura = new double[limite];

        for (indice = 0; indice < limite; indice++) {
            entrada.nextLine();

            System.out.println("Ingrese el nombre del jugador");
            nombre[indice] = entrada.nextLine();

            System.out.println("Ingrese la posicíon del jugador");
            posicion[indice] = entrada.nextLine();

            System.out.println("Ingrese la edad del jugador");
            edad[indice] = entrada.nextInt();

            System.out.println("Ingrese la estatura del jugador");
            estatura[indice] = entrada.nextDouble();

            listaE = String.format("%s %d", listaE, edad[indice]);
            sumaEdades = sumaEdades + edad[indice];
            sumaEstaturas = sumaEstaturas + estatura[indice];

            mensaje = String.format("%s%.0f.%s -%s-, edad %d, estatura %.2f\n",
                    mensaje,
                    contador,
                    nombre[indice],
                    posicion[indice],
                    edad[indice],
                    estatura[indice]);

            contador = contador + 1;
        }

        totalEdades = sumaEdades / limite;
        totalEstaturas = sumaEstaturas / limite;

        mensaje = String.format("Listado de jugadores\n%sLista de edades:%s\n"
                + "Promedio de edades: %.1f\n"
                + "Promedio de estaturas: %.2f",
                mensaje,
                listaE,
                totalEdades,
                totalEstaturas);

        System.out.println(mensaje);
    }

}
