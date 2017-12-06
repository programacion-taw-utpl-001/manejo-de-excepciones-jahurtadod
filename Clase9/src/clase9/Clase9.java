                    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

import java.util.Scanner;

/**
 *
 * @author jahur
 */
public class Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre;
        int edad;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        edad = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
                
        
        
        System.out.printf("Su nombre es %s - ", nombre);
        System.out.printf("Su edad es %s", edad);
        
    }
}
