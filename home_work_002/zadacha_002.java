// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class zadacha_002 {

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(zadacha_002.class.getName());
        FileHandler fileHandler = new FileHandler("log_zadacha_002.log", true);
        logger.addHandler(fileHandler);
        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            Random rand = new Random();
            data[i] = rand.nextInt(20);
        }
        System.out.printf("Изначальный массив: %s\n", Arrays.toString(data));
        int i = 0;
        boolean flag = true;
        while (i < data.length - 1) {
            flag = false;
            for (int j = 1; j < data.length - i; j++) {
                if (data[j - 1] > data[j]) {
                    int temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                    logger.log(Level.INFO, "Hello logging: {0}", temp);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
            i++;
        }

        System.out.printf("Конечный массив: %s\n", Arrays.toString(data));
    }
}