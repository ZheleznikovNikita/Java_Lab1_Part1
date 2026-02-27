import java.util.Scanner;

public class Task3 {
    // Простые арифметические действия с двумя введёнными числами
    public static void SimpleArithmetic() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int fst = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int snd = scanner.nextInt();
        System.out.printf("Сумма: %d\n" +
                          "Разность: %d\n" +
                          "Произведение: %d\n" +
                          "Частное (целочисленное деление): %d\n" +
                          "Остаток от деления первого на второе: %d\n" +
                          "Большое из двух чисел: %d",
                fst + snd, fst - snd, fst * snd, fst / snd, fst % snd, Math.max(fst, snd)); // Math.max - максимальное из 2х чисел
    }
}
