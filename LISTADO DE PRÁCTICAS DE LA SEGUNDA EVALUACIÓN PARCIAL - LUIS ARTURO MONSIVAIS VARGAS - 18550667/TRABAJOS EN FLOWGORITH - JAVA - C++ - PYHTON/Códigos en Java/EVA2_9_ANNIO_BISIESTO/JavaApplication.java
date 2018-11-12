//@author Luis Arturo Monsivais Vargas

import java.util.*;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce el annio");
        int iAnnio;
        
        iAnnio = input.nextInt();
        if (iAnnio % 4 == 0) {
            if (!(iAnnio % 100 == 0)) {
                if (!(iAnnio % 400 == 0)) {
                    System.out.println("Annio bisiesto");
                } else {
                    System.out.println("Annio no bisiesto");
                }
            } else {
                System.out.print("Annio bisiesto");
            }
        } else {
            System.out.println("Annio no bisiesto");
        }
    }
}
