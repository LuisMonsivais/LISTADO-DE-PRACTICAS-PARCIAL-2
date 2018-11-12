//@author Luis Arturo Monsivais Vargas

import java.util.*;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingresa el valor del primer entero");
        int iEntero1;
        
        iEntero1 = input.nextInt();
        System.out.println("Ingresa el valor del segundo entero");
        int iEntero2;
        
        iEntero2 = input.nextInt();
        if (iEntero1 == iEntero2) {
            System.out.println("El entero 1 y 2 son iguales");
        } else {
            System.out.println("El entero 1 y 2 son diferentes");
        }
    }
}
