import java.util.Scanner;

public class Task5 {
    // Подсчёт площади и длины окружности
    public static void CircleSLen() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите радиус окружности: ");
        double rad = scanner.nextDouble();
        // Используем встроенную константу PI для вычислений
        var C = 2 * Math.PI * rad;
        // Math.pow - степень числа
        var S = Math.PI * Math.pow(rad, 2);
        System.out.printf("Длина окружности: %.3f\nПлощадь окружности: %.3f", C, S);
    }
}
