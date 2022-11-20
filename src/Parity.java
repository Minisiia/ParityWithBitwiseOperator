import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число");
        int number = scanner.nextInt();
        // Версія 1 Використання маски
        // через побітове І з 0000 0001
        // якщо число парне, то результатом стане 0000 0000
        // якщо число непарне, то результатом стане 0000 0001
        if ((number & 1) == 0) System.out.println("Число парне");
        else System.out.println("Число непарне");

        // Версія 2 Використання 2-х зсувів вліво та вправо
        // >> 1 - нульвий біт втрачається
        // << 1 - у нульовий біт записується 0
        // порівнюємо отримане число з початковим
        // якщо числа рівні, то початкове число було парним
        int numberShift = number >> 1;
        if ((numberShift << 1) == number) System.out.println("Число парне");
        else System.out.println("Число непарне");

        // Версія 3 Використання 7 зсувів вправо
        // << 7 - нульовий біт пересувається у 7 позицію, інші біти заміняються нулями
        // якщо отримане число буде дорівнювати 0, то задане число парне
        if ((byte) (number << 7) == 0)
            System.out.println("Число парне");
        else
            System.out.println("Число непарне");
    }
}
