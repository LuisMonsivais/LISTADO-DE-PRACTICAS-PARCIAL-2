//@author Luis Arturo Monsivais Vargas

import java.util.*;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter temperature (°C)");
        int iTemperature;
        
        iTemperature = input.nextInt();
        if (iTemperature < 0) {
            System.out.println("Freezing Weather");
        } else {
            if (iTemperature >= 0 && iTemperature <= 10) {
                System.out.println("Very Cold Weather");
            } else {
                if (iTemperature >= 11 && iTemperature <= 20) {
                    System.out.println("Cold Weather");
                } else {
                    if (iTemperature >= 21 && iTemperature <= 30) {
                        System.out.println("Normal in Temp");
                    } else {
                        if (iTemperature >= 31 && iTemperature <= 40) {
                            System.out.println("It's Hot");
                        } else {
                            if (iTemperature >= 41) {
                                System.out.println("It's very Hot");
                            } else {
                                System.out.println("The Entered Value is not Recognized");
                            }
                        }
                    }
                }
            }
        }
    }
}
