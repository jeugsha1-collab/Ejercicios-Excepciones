/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package practica1excepciones1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticaExcepciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        estudiantes estudiante1 = new estudiantes();

        try {
            System.out.print("Ingrese su edad: ");
            estudiante1.setEdad(sc.nextInt());

            estudiante1.mayorEdad();
            System.out.print("Ingrese la primera nota: ");
            float n1 = sc.nextFloat();

            System.out.print("Ingrese la segunda nota: ");
            float n2 = sc.nextFloat();

            System.out.print("Ingrese la tercera nota: ");
            float n3 = sc.nextFloat();

            estudiante1.setNotas(n1, n2, n3);
            estudiante1.calcularpromedio();

            System.out.println("Promedio: " + estudiante1.getPromedio());


        } catch (InputMismatchException e) {
            System.out.println("En edad solo debe ingresar numeros");
            System.out.println("En promedio debe ingresar un numero positivo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
