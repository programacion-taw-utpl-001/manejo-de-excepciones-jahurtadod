/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones;

import java.util.Scanner;

/**
 *
 * @author jahur
 */
public class Exception1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = 0;

        while (true) {
            try {
                System.out.println("Ingrese un numero a dividir : ");
                num = input.nextInt();
                num = 10 / num;
                System.out.println("Su resultado fue : " + num);
                break;
            } catch (ArithmeticException e) {
                System.err.println("Error al dividir");
            }
        }

    }
}