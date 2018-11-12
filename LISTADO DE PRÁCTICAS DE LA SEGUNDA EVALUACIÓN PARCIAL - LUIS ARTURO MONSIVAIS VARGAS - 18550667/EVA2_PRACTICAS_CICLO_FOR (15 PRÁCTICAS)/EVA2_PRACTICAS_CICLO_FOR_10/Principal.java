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
        int iNumero;
        
        for (iNumero = 1; iNumero <= 100; iNumero++) {
            System.out.print(iNumero + "   ");
        }
        
        int iNumeroSumatoria;
            System.out.println();
            System.out.println();
            System.out.println("Resultado de la sumatoria: ");
        for (iNumeroSumatoria = 1; iNumeroSumatoria <= 100; iNumeroSumatoria++){
            System.out.print(iNumeroSumatoria + " + ");
        }
    }
}
