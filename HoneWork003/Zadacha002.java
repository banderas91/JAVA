//Пусть дан произвольный список целых чисел, удалить из него четные числа

public class Zadacha002 {

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Исходный список: ");
        printArray(arr);
        int[] result = removeEven(arr);

        System.out.print("\nПосле удаления чётных чисел: ");
        printArray(result);
    }
    public static void printArray(int[] result)
    {
        for (int i : result)
            System.out.print(i + " ");
    }
    public static int[] removeEven(int[] arr)
    {
        int odd_count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 != 0)
            {
                odd_count++;
            }
        }

        int[] result = new int[odd_count];
        int index = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 != 0)
            {
                result[index++] = arr[i];
            }
        }
        return result;
    }
}