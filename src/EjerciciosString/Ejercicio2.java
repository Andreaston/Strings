package EjerciciosString;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leo = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena de caracteres
        System.out.println("Ingrese una cadena de caracteres:");
        String cadena = leo.nextLine();

        // Contador para almacenar el número de vocales
        int contadorVocales = 0;

        // Convertir la cadena a minúsculas para simplificar la comparación
        cadena = cadena.toLowerCase();

        // Iterar sobre cada carácter de la cadena
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            // Verificar si el carácter es una vocal
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
        }

        // Mostrar el número de vocales
        System.out.println("El número de vocales en la cadena es: " + contadorVocales);
    }
}
