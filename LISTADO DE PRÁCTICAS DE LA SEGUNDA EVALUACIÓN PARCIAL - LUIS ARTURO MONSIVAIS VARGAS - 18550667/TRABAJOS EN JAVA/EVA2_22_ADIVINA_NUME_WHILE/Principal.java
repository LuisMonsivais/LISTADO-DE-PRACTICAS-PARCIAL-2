
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
        Scanner input = new Scanner(System.in);
         double n = Math.random()*10+1;
         //System.out.println("El numero de la PC es:"+(int)n);
         int num =0;
         while(!(num==(int)n)){
             System.out.println("Escoje un numero entre el 1 y el 10");   
             num = input.nextInt();
         }
    }
}