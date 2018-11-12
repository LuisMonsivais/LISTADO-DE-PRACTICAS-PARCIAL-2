//@author Luis Arturo Monsivais Vargas

import java.util.*;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce tu calificacion");
        int iCalificacion;
        
        iCalificacion = input.nextInt();
        if (iCalificacion == 100) {
            System.out.println("A");
        } else {
            if (iCalificacion == 90) {
                System.out.println("B");
            } else {
                if (iCalificacion == 80) {
                    System.out.println("C");
                } else {
                    if (iCalificacion == 70) {
                        System.out.println("D");
                    } else {
                        if (iCalificacion == 60) {
                            System.out.println("F");
                        } else {
                            System.out.println("Calificacion fuera de rango");
                        }
                    }
                }
            }
        }
    }
}
