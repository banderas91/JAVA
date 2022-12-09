package home_work_001;

// Вывести все простые числа от 1 до 1000



public class zadacha_001 {
    public static void main(String[] args) {
        int x = 1000;

        for (int index = 1; index < x + 1; index++) {
            boolean flag = true;
            if (index > 1) {
                for (int i = 2; i < index; i++) {
                    if (index % i == 0) {
                        flag = false;
                        break;
                    
                    }

                }
                if (flag == true) {
                    System.out.println(index);
                }
                
            }
            
        }
    }
 

}