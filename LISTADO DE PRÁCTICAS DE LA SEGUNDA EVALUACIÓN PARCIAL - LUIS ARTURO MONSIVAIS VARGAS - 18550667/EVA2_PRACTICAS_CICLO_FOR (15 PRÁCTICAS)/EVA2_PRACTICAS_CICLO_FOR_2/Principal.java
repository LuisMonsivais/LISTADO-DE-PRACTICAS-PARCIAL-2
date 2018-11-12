
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Arturo Monsivais Vargas
 */

public class Principal {
    private static Scanner input = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingresa tu nombre");
        String sNombre;
        
        sNombre = input.nextLine();
        System.out.println("¿Cuantas veces deseas imprimir tu nombre?");
        int iVeces;
        
        iVeces = input.nextInt();
        int imprimirNombre;
        
        for (imprimirNombre = 1; imprimirNombre <= iVeces; imprimirNombre++) {
            System.out.println(sNombre);
        }
    }
}
