import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Задание 12");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число в двоичной системе: ");
        String binary = sc.nextLine();

        int n = Integer.parseInt(binary, 2);
        boolean hasZero = false;

        for (int i = 0; i < 32; i++) {
            int bit = (n >> i) & 1;
            if (bit == 0) {
                hasZero = true;
                break;
            }
        }

        System.out.println("Исходное число в двоичном виде: " + binary);
        System.out.println("Есть ли в двоичной записи числа n хотя бы один 0? " + hasZero);

    }
}
