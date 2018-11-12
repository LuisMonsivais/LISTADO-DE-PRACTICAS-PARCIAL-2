//@author Luis Arturo Monsivais Vargas

import java.util.*;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¿Cual es tu edad?");
        int iEdad;
        
        iEdad = input.nextInt();
        System.out.println("¿Tienes tu INE?");
        boolean bTieneINE;
        
        bTieneINE = input.nextBoolean();
        if (iEdad >= 18) {
            if (bTieneINE == true) {
                System.out.println("Puedes entrar al antro");
            } else {
                System.out.println("¡Saquese de aqui!");
            }
        } else {
            System.out.println("¡Saquese de aqui!");
        }
    }
}
