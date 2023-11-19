import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        System.out.println("Задание 4");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = sc.nextInt();
        int i = sc.nextInt();

        int mask = 1 << i; // создаем маску для инвертирования i-го бита
        n ^= mask; // инвертируем i-й бит

        System.out.println(Integer.toBinaryString(n)); // выводим результат в двоичном виде

    }
}
