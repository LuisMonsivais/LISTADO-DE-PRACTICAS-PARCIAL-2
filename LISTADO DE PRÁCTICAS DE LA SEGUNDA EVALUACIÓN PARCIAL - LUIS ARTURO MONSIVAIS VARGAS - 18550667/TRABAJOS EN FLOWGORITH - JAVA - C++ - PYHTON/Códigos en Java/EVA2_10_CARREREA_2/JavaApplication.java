//@author Luis Arturo Monsivais Vargas

public class JavaApplication {
    public static void main(String[] args) {
        boolean servicio;
        boolean residencias;
        boolean materias;
        
        servicio = true;
        residencias = true;
        materias = true;
        if (servicio == true && residencias == true && materias == true) {
            System.out.println("Te puedes titular");
        } else {
            System.out.println("No te puedes titular");
        }
    }
}
