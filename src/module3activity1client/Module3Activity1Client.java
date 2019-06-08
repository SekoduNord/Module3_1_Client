/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module3activity1client;

import java.util.Scanner;

/**
 *
 * @author Olivier
 */
public class Module3Activity1Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Application menu
        System.out.println("Select a function:\n"
                + "1-Addition, 2-Substraction, 3-Quit");
        String entry = in.nextLine();
        Double n1 = 0.0;
        Double n2 = 0.0;

        while (!entry.equals("3")) {
            switch (entry) {
                case "1":
                    System.out.println("Addition selected \n"
                            + "Enter number 1 and number 2 (N1 N2)");
                    n1 = in.nextDouble();
                    n2 = in.nextDouble();
                    System.out.println("= " + add(n1, n2));
                    entry = in.nextLine();
                    break;

                case "2":
                    System.out.println("Addition selected \n"
                            + "Enter number 1 and number 2 (N1 N2)");
                    n1 = in.nextDouble();
                    n2 = in.nextDouble();
                    System.out.println("= " + sub(n1, n2));
                    entry = in.nextLine();
                    break;

                default:
                    System.out.println("Wrong entry");
            }
            System.out.println("Select a function:\n"
                    + "1-Addition, 2-Substraction, 3-Quit");
            entry = in.nextLine();

        }
        System.out.println("Exit selected");
        quit();
    }

    /**
     * Quit is used to exit the console application.
     */
    public static void quit() {
        System.exit(0);
    }

    private static Double add(java.lang.Double number1, java.lang.Double number2) {
        servs.CalculatorWebService_Service service = new servs.CalculatorWebService_Service();
        servs.CalculatorWebService port = service.getCalculatorWebServicePort();
        return port.add(number1, number2);
    }

    private static Double sub(java.lang.Double number1, java.lang.Double number2) {
        servs.CalculatorWebService_Service service = new servs.CalculatorWebService_Service();
        servs.CalculatorWebService port = service.getCalculatorWebServicePort();
        return port.sub(number1, number2);
    }



    

}
