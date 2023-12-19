package lab10;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int check = 0;
        while (check != 1){
            System.out.println("\n3,4,5 - номера заданий\n1 - выход\nВведите номер: ");
            check = scanner.nextInt();
            switch (check){
                case 3:
                    System.out.print("Введите A: ");
                    int A = scanner.nextInt();

                    System.out.print("Введите B: ");
                    int B = scanner.nextInt();

                    if (A < B) {
                        printNumbersAscending(A, B);
                    } else {
                        printNumbersDescending(A, B);
                    }
                    break;
                case 4:
                    System.out.print("Введите k: ");
                    int k = scanner.nextInt();

                    System.out.print("Введите s: ");
                    int s = scanner.nextInt();

                    int count = countNumbers(k, s, 1);

                    System.out.println(count);
                    break;
                case 5:
                    System.out.print("Введите N: ");
                    int N = scanner.nextInt();
                    int sum = calculateSumOfDigits(N);
                    System.out.println("Сумма цифр числа " + N + " равна " + sum);
                    break;
                case 1:
                    System.out.println("Выход...");
                    break;
            }
        }


        scanner.close();
    }

    public static void printNumbersAscending(int A, int B) {
        if (A <= B) {
            System.out.print(A + " ");
            printNumbersAscending(A + 1, B);
        }
    }
    public static void printNumbersDescending(int A, int B) {
        if (A >= B) {
            System.out.print(A + " ");
            printNumbersDescending(A - 1, B);
        }
    }

    static int countNumbers(int k, int s, int firstDigit) {
        if (k == 1) {
            if (s >= firstDigit && s <= 9) {
                return 1;
            } else {
                return 0;
            }
        }

        int count = 0;
        for (int digit = firstDigit; digit <= 9; digit++) {
            if (s - digit >= 0) {
                count += countNumbers(k - 1, s - digit, 0);
            }
        }
        return count;
    }

    public static int calculateSumOfDigits(int N) {
        if (N == 0) {
            return 0;
        } else {
            int lastDigit = N % 10;
            int remainingDigits = N / 10;
            return lastDigit + calculateSumOfDigits(remainingDigits);
        }
    }
}
