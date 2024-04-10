package EjerciciosString;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena de caracteres
        System.out.println("Ingrese una cadena de caracteres:");
        String cadena = scanner.nextLine();

        // Solicitar al usuario que ingrese un carácter a buscar
        System.out.println("Ingrese un carácter a buscar:");
        char caracter = scanner.next().charAt(0);

        // Llamar al método para contar las ocurrencias del carácter y mostrar el resultado
        int conteo = contarCaracteres(cadena, caracter);
        System.out.println("El carácter '" + caracter + "' aparece " + conteo + " veces en la cadena.");
    }

    // Método para contar las ocurrencias de un carácter en una cadena de caracteres
    public static int contarCaracteres(String cadena, char caracter) {
        int conteo = 0;

        // Iterar sobre la cadena de caracteres y contar las ocurrencias del carácter
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                conteo++;
            }
        }

        return conteo;
    }


}

