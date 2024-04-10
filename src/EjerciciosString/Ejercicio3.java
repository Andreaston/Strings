package EjerciciosString;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena de caracteres
        System.out.println("Ingrese una cadena de caracteres:");
        String cadena = scanner.nextLine();

        // Llamar al método para invertir la cadena y mostrar el resultado
        String cadenaInvertida = invertirCadena(cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);
    }

    // Método para invertir una cadena de caracteres
    public static String invertirCadena(String cadena) {
        // Crear un objeto StringBuilder para construir la cadena invertida
        StringBuilder cadenaInvertida = new StringBuilder();

        // Iterar sobre la cadena de caracteres de derecha a izquierda
        for (int i = cadena.length() - 1; i >= 0; i--) {
            // Agregar cada carácter al inicio de la cadena invertida
            cadenaInvertida.append(cadena.charAt(i));
        }

        // Devolver la cadena invertida como una cadena de caracteres
        return cadenaInvertida.toString();
    }
}

