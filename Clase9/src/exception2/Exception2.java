/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception2;

import java.util.Scanner;

/**
 *
 * @author jahur
 */
public class Exception2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String num;

        Asignacion Asig = new Asignacion();

        for (int i = 0; i < 4; i++) {
            try {
                System.out.println("Ingrese el nombre del Estudiante: ");
                String nombre = input.nextLine();
                System.out.println("Ingrese el apellido del Estudiante: ");
                String apellido = input.nextLine();
                System.out.println("Ingrese la calificacion de Matemáticas: ");
                double nota_mat = verificar(input.nextLine());
                System.out.println("Ingrese la calificacion de Sociales: ");
                double nota_soc = verificar(input.nextLine());
                Asig.setAsignacion1(new Estudiante(nombre, apellido), nota_mat, nota_soc, i);

            } catch (NumberFormatException e) {
                System.err.println("Valor incorrecto de sus calificaciones");
            }
        }

        System.out.println(Asig);

    }

    public static double verificar(String valor) {
        Scanner input = new Scanner(System.in);
        try {
            double num = Double.parseDouble(valor);
            return num;
        } catch (NumberFormatException e) {
            System.out.println("Ingrese un valor valido : ");
            return verificar(input.nextLine());
        }
    }

}
