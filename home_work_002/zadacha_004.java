
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.Level;

public class zadacha_004 {

    public static void main(String[] args) throws SecurityException, IOException {
        FileHandler file = new FileHandler("log_zadacha_004.log", true);
        Logger logger = Logger.getLogger(zadacha_004.class.getName());
        Scanner iScanner = new Scanner(System.in);

        System.out.printf("Укажите число: ");
        Double a = iScanner.nextDouble();
        System.out.printf("Укажите знак операции (+,-,*,/,^): ");
        String s = iScanner.nextLine();
        String x = iScanner.nextLine();
        System.out.printf("Укажите число: ");
        Double b = iScanner.nextDouble();
        logger.addHandler(file);
        iScanner.close();
        Double res;

        switch (x) {
            case "+":
                System.out.println((a + b));
                logger.log(Level.INFO, String.valueOf((a + " " + x + " " + b + " = " + (a + b))));
             
            case "-":
                System.out.println(a - b);
                logger.log(Level.INFO, String.valueOf((a + " " + x + " " + b + " = " + (a - b))));                break;
               
            case "*":
                System.out.println(a * b);
                logger.log(Level.INFO, String.valueOf((a + " " + x + " " + b + " = " + (a * b))));                break;

            case "/":
                System.out.println(a / b);
                logger.log(Level.INFO, String.valueOf((a + " " + x + " " + b + " = " + (a  / b))));                break;
            case "^":
                System.out.println(Math.pow(a, b));
                logger.log(Level.INFO, String.valueOf((a + " " + x + " " + b + " = " + Math.pow(a, b))));                break;
                
            default:
                System.out.println("Указан неверный знак");
                logger.log(Level.INFO, String.valueOf(("Указан неверный знак")));               
            
                
        }

    }  

}
