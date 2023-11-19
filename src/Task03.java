import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("Задание 3");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = sc.nextInt();
        int i = sc.nextInt();

        int mask = 1 << i; // создаем маску для установки i-го бита
        n |= mask; // устанавливаем i-й бит в 1

    }
}
