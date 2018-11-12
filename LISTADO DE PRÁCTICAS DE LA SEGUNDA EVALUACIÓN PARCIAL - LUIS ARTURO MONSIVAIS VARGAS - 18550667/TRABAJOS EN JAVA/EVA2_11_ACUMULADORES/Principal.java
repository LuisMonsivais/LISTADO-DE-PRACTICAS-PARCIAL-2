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
        //Acumulador:
        int iSuma = 0; //Punto de partida
            System.out.println("Valor de suma: " + iSuma);
        iSuma = iSuma + 10; //0 + 10
            System.out.println("Valor de suma: " + iSuma);
        iSuma = iSuma + 10;
            System.out.println("Valor de suma: " + iSuma);
        iSuma += iSuma + 10; //Operador de crecimiento
        System.out.println("Valor de suma: " + iSuma);
       
        //Multiplicacion
        int iMult = 5;
            System.out.println("Valor de iMult: " + iMult);
        
        //Resta
        int iResta = 100;
            System.out.println("Valor de iResta: " + iResta);
        iResta -= 5;
            System.out.println("Valor de iResta: " + iResta);
        
        //Contador
        //Tipo especial de acumulador
        int iCont = 0;
            System.out.println("Cuanto tienes = " + iCont);
        iCont = iCont + 1;
            System.out.println("Cuanto tienes = " + iCont);
        iCont+= iCont + 1; //Incremente el valor de cualquier
            System.out.println("Cuanto tienes = " + iCont);
        iCont++; // Solo incrementa en 1
            System.out.println("Cuanto tienes = " + iCont);
        
        //Te quitaron dinero
        iCont --;
            System.out.println("Cuanto tienes = " + iCont);
        String sCade = "Hola"; //Se puede juntar esta cadena...
            System.out.println(sCade);
        sCade = sCade + "Mundo"; //...con esta.
            System.out.println(sCade);
        
        //sCade ?= sCade - "Quiubo"; //NO SE PUEDEN RESTAR CADENAS
        
            System.out.println(sCade);
            System.out.println("********");
            System.out.println("Valor de iCont = " + iCont);
            System.out.println("Valor de iCont = " + iCont++);
            System.out.println("Valor de iCont = " + ++iCont);
        
        //iCont++ --> se aplica después
        //++iCont --> se aplica al momento
        
            System.out.println("++++++++++++" + iCont);
            System.out.println("Valor de iCont = " + iCont);
        iCont++;
        
            System.out.println("Valor de iCont = " + iCont);
        
    }
}
