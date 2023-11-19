import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        System.out.println("Задание 9");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число M: ");
        int M = sc.nextInt();
        System.out.print("Введите число N: ");
        int N = sc.nextInt();

        int signMask = M & (1 << 31); // создаем маску для получения знака числа M
        int signN = N & (1 << 31); // создаем маску для получения знака числа N

        if (signMask!= signN) { // проверяем, имеют ли числа разные знаки
            System.out.println("Числа имеют разные знаки");
        } else {
            System.out.println("Числа имеют одинаковый знак");
        }

    }
}
