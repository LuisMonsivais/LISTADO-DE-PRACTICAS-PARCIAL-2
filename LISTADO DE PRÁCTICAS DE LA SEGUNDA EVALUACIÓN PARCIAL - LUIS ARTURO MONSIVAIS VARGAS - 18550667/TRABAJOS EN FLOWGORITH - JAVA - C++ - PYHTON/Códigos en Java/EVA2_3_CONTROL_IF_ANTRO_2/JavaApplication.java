//@author Luis Arturo Monsivais Vargas

import java.util.*;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¿Tienes tu INE?");
        boolean bTieneINE;
        
        bTieneINE = input.nextBoolean();
        if (bTieneINE == true) {
            System.out.println("Si tienes INE");
        } else {
            System.out.println("No tienes INE");
        }
    }
}
