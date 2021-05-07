import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombre;

        System.out.print("Ingrese palabra: ");

        nombre = entrada.nextLine();
        String sPalabra = nombre;

        int contador = 0;

        long totalCharacters = sPalabra.chars().filter(ch -> ch != ' ').count();

        for(int x=0;x<sPalabra.length();x++) {
            if ((sPalabra.charAt(x)=='a') || (sPalabra.charAt(x)=='e') || (sPalabra.charAt(x)=='i') || (sPalabra.charAt(x)=='o') || (sPalabra.charAt(x)=='u')){
                contador++;
            }
        }
        System.out.println("La palabra " + sPalabra + " contiene " + contador + " vocales");
        System.out.println("la longuitud de la palabra es: " + totalCharacters );

    }

}