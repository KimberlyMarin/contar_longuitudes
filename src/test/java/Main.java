import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Invocar scanner para lectura de de los parametros de entrada*/
        Scanner leer =  new Scanner(System.in);
        int notas;

        System.out.print("ingrese cantidad de notas:");
        /*se setea los valores de los campos */
        notas = leer.nextInt();

        int suma = 0;
        int prom = 0;
        int nota = 0;
        /*se recorre las notas dependiendo de la cantidad de notas que se asignen*/
        for(int i=1; i<= notas; i++){
            System.out.println("ingrese nota"+" "+i+" "+"de"+" "+notas+":");
            nota = leer.nextInt();
            /*se suman las notas luego de definir la cantidad de notas*/
            suma = suma + nota;
        }
        /*se realiza el promedio de con base a la cantidad de notas vs cada nota*/

        prom = suma / notas;
        System.out.println("promedio de las notas:"+prom );
    }
}