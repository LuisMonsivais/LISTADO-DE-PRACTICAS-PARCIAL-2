
import java.util.Random;

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
        Random NumeroAleatorio = new Random();
        int iNumero;
        
        for (int Numero = 0; Numero < 20; Numero++){
        iNumero = 1 + NumeroAleatorio.nextInt(100);
        System.out.println(iNumero);
        }
    }
}
