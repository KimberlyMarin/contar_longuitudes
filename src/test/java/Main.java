import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*se invoca el metodo Scanner para permitir ingresar un valor */
        Scanner entrada = new Scanner(System.in);
        String nombre;

        System.out.print("Ingrese palabra: ");

        nombre = entrada.nextLine();
        /*Asignacion de dato digitado una variable */
        String sPalabra = nombre;

        /*se crea contador para saber la cantidad de vocales*/
        int contador = 0;
        /*se realiza el filtro de la palabra escrita y se almacena el contador */
        long totalCharacters = sPalabra.chars().filter(ch -> ch != ' ').count();
        /*se recorre la palabra por su longuitud para determinar la cantidad de letras*/
        for(int x=0;x<sPalabra.length();x++) {
            if ((sPalabra.charAt(x)=='a') || (sPalabra.charAt(x)=='e') || (sPalabra.charAt(x)=='i') || (sPalabra.charAt(x)=='o') || (sPalabra.charAt(x)=='u')){
                contador++;
            }
        }
        /*Se imprime la cantidad vocales y la longuitud de la palabra*/
        System.out.println("La palabra " + sPalabra + " contiene " + contador + " vocales");
        System.out.println("la longuitud de la palabra es: " + totalCharacters );

    }

}