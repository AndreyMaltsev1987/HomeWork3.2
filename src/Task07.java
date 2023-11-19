import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        System.out.println("Задание 7");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = sc.nextInt();
        int i = sc.nextInt();

        int mask = 1 << i; // создаем маску для получения i-го бита
        int bit = (n & mask)!= 0? 1 : 0; // получаем значение i-го бита

        System.out.println(Integer.toBinaryString(bit)); // выводим результат в двоичном виде

    }
}
