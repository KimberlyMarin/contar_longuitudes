import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*se invoca el metodo Scanner para permitir ingresar un valor */
        Scanner entrada = new Scanner(System.in);
        String nombre;

        System.out.print("Ingrese palabra: ");

        nombre = entrada.nextLine();
        /*Asignacion de un dato digitando una variable */
        String sPalabra = nombre;

        /*se crea contador para saber la cantidad de vocales*/
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;
        int contador = 0;

        ArrayList<String> vocales = new ArrayList<String>();
        /*se realiza el filtro de la palabra escrita y se almacena el contador */
        long totalCharacters = sPalabra.chars().filter(ch -> ch != ' ').count();
        /*se recorre la palabra por su longuitud para determinar la cantidad de letras*/
        for(int x=0;x<sPalabra.length();x++) {
            switch (sPalabra.charAt(x)){
                case 'a':
                    if(contadorA<1){
                        vocales.add("a");
                    }
                    contadorA++;
                    contador++;
                    break;
                case 'e':
                    if(contadorE<1){
                        vocales.add("e");
                    }
                    contadorE++;
                    contador++;
                    break;
                case 'i':
                    if(contadorI<1){
                        vocales.add("i");
                    }
                    contadorI++;
                    contador++;
                    break;
                case 'o':
                    if(contadorO<1){
                        vocales.add("o");
                    }
                    contadorO++;
                    contador++;
                    break;
                case 'u':
                    if(contadorU<1){
                        vocales.add("u");
                    }
                    contadorU++;
                    contador++;
                    break;

            }
        }
        /*Se imprime la cantidad de vocales y la longuitud de la palabra*/
        System.out.println("las vocales son: " + vocales );
        System.out.println("La palabra " + sPalabra + " contiene " + contador + " vocales");
        System.out.println("la longuitud de la palabra es: " + totalCharacters );

    }

}