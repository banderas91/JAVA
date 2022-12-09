package home_work_001;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)


import java.util.Scanner;

public class zadacha_002 {

    public static void main(String args[]) throws Exception {
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.printf("Укажите число: ");
            int n = iScanner.nextInt();     

            sum(n);
            fact(n);
        }
    }   
    
    public static void sum(Integer n) {

        int sum = 0;
        for (int i = 1; i < n + 1; i++) {
            sum += i;
        }
        System.out.printf("Треугольное число (сумма от 1 до %d) = %d \n", n, sum);
    }
    public static void fact(Integer n) {

        int fac = 1;
        for (int i = 1; i < n + 1; i++) {
            fac *= i;
        }
        System.out.printf("Факториал числа %d! = %d", n, fac);
    }
}