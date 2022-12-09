package home_work_001;

import java.util.Scanner;

public class zadacha_003 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        System.out.printf("Укажите число: ");
        Double a = iScanner.nextDouble(); 
        System.out.printf("Укажите знак операции (+,-,*,/,^): ");
        String s = iScanner.nextLine();
        String x = iScanner.nextLine();
        System.out.printf("Укажите число: ");
        Double b = iScanner.nextDouble(); 
        iScanner.close();

        switch (x){
            case "+": System.out.println(a + b);
                break;
            case "-": System.out.println(a - b);
                break;   
            case "*": System.out.println(a * b);
                break;
            case "/": System.out.println(a / b);
                break;         
            case "^": System.out.println(Math.pow(a, b));
                break;
            default: System.out.println("Указан неверный знак");;
                break;
        }
    }
}