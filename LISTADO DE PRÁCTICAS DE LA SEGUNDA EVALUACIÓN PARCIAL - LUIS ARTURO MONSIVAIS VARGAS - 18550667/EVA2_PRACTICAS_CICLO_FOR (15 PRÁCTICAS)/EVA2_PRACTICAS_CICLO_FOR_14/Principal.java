
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
        Scanner Asterisco = new Scanner(System.in);
            System.out.println("Inserta la cantidad de asteriscos (N)");
            int n = 1 + Asterisco.nextInt();
        
            System.out.println("N: ");
        for(int i = 0; i < n; i++){
                for(int j = n - i; j > 0; j--){
                    System.out.print("");
                }
                for(int k = 0; k < i; k++){
                    System.out.print("*");
                }
                System.out.println("");
        }
    }
}
