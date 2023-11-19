import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Задание 5");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = sc.nextInt();
        int i = sc.nextInt();

        int mask = ~(1 << i); // создаем маску для сброса i-го бита
        n &= mask; // сбрасываем i-й бит

    }
}
