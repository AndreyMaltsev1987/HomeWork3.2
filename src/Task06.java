import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        System.out.println("Задание 6");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = sc.nextInt();
        int i = sc.nextInt();

        int mask = (1 << i) - 1; // создаем маску для обнуления всех битов, кроме i-го
        n &= mask; // обнуляем все биты, кроме i-го

        System.out.println(Integer.toBinaryString(n)); // выводим результат в двоичном виде

    }
}
