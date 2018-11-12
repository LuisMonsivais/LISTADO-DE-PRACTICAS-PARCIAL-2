//@author Luis Arturo Monsivais Vargas

public class JavaApplication {
    public static void main(String[] args) {
        int iAnnio;
        
        iAnnio = 1996;
        int iResi4;
        
        iResi4 = iAnnio % 4;
        int iResi100;
        
        iResi100 = iAnnio % 100;
        int iResi400;
        
        iResi400 = iAnnio % 400;
        if (iResi4 == 0 && (!(iResi100 == 0) && iResi400 == 0)) {
            System.out.println("Annio bisiesto");
        } else {
            System.out.println("Annio no bisiesto");
        }
    }
}
