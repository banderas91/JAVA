//Задан целочисленный список ArrayList. 
//Найти минимальное, максимальное и среднее из этого списка.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Zadacha003 {
    public static void main(String[] args) {

        List<Integer> foo = Arrays.asList(1 ,82, 10, 8, 12, 15 ,6, 17 ,4, 33);
        int sum = 0;
        for (int i = 0; i < foo.size(); i++) {
            sum = sum+foo.get(i);
        }
        Collections.sort(foo);
        System.out.println("max=" + foo.get(foo.size()-1));
        System.out.println("min=" + foo.get(0));
        System.out.println("avarage=" + sum / foo.size());

    }
}