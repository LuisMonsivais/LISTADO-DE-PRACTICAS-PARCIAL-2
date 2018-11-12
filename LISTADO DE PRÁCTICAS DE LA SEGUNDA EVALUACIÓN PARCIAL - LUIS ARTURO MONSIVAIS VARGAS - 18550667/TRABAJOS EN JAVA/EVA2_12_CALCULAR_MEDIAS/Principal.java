
import java.util.Scanner;

 //@author Luis Arturo Monsivais Vargas

public class Principal {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double cont = 0;
        double edades;
            System.out.println("Ingresa el valor de la primer edad");
            edades = input.nextInt();
                cont++;
            System.out.println("Ingresa el valor de la segunda edad");
            edades += input.nextInt();
                cont++;       
            System.out.println("Ingresa el valor de la tercera edad");
            edades += input.nextInt();
                cont++;      
            System.out.println("Ingresa el valor de la cuarta edad");
            edades += input.nextInt();
                cont++;    
            System.out.println("Ingresa el valor de la quinta edad");
            edades += input.nextInt();
                cont++;
        double media  = ((edades)/cont);
            System.out.println("La media de las edades es " + media);
    }
}
