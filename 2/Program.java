import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        // System.out.println(inputFloatNumber());
        // task2();
        // task3();
        nullString();
    }

    public static float inputFloatNumber() {
        float num = 0;
        boolean check = true;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                num = Float.parseFloat(sc.nextLine());
                check = false;

            } catch (RuntimeException e) {
                System.out.println("Incorrect input. Try again: ");
            }
        } while (check);

        sc.close();

        return num;
    }

    public static void task2() {
        int[] intArray = new int[10];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 2;
        }

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);

        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

    public static void task3() throws Exception {
        try {
            int a = 90;
            int b = 0;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2, (Integer) null };
            abc[3] = 9;

        } catch (ArithmeticException e) {
            System.out.println("Нельзя делить на ноль!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }

    }

    private static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static void nullString() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        if (input.equals(""))
            throw new RuntimeException("Пустые строки вводить нельзя!");

    }

}
