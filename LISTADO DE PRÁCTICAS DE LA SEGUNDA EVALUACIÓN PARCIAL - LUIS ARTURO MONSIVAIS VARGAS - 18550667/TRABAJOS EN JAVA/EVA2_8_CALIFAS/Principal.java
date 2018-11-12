
import java.util.Scanner;

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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Ingresa una calificacion");
        String sLetra = input.nextLine();
        switch (sLetra){
            case "A":
                System.out.println("100");
                break;
            case "B":
                System.out.println("90");
                break;
            case "C":
                System.out.println("80");
                break;
            case "D":
                System.out.println("70");
                break;
            case "F":
                System.out.println("60");
            
            default:
            System.out.println("Valor fuera de rango");
        }
    }
}