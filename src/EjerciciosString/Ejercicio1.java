package EjerciciosString;

public class Ejercicio1 {
    public static void main(String[] args) {

        String cadena="Andre Rios Martinez";

        for (int i=0; i < cadena.length(); i++){
            char caracter = cadena.charAt(i);
            System.out.print(caracter);
        }
    }
}
