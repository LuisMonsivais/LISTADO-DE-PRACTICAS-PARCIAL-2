//@author Luis Arturo Monsivais Vargas

import java.util.*;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingresa un numero");
        double rValor;
        
        rValor = input.nextDouble();
        if (rValor > 0) {
            System.out.println("El numero es positivo");
        } else {
            if (rValor == 0) {
                System.out.println("El numero es neutro");
            } else {
                System.out.println("El numero es negativo");
            }
        }
    }
}
