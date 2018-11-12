//@author Luis Arturo Monsivais Vargas

public class JavaApplication {
    public static void main(String[] args) {
        boolean maTTer;
        
        maTTer = true;
        if (maTTer == true) {
            boolean serLib;
            
            serLib = true;
            if (serLib == true) {
                boolean resLib;
                
                resLib = true;
                if (resLib == true) {
                    System.out.println("Te puedes titular");
                } else {
                    System.out.println("No te puedes titular");
                }
            } else {
                System.out.println("No te puedes titular");
            }
        } else {
            System.out.println("No te puedes titular");
        }
    }
}
