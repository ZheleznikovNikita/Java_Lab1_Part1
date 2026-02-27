import java.util.Scanner;

public class Task2 {
    // Конвертирует температуру в градусы Фаренгейта и Кельвина
    public static void ConvertTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия: ");
        // Считываем вещественное число
        double C = scanner.nextDouble();
        // Считаем температуры в Фаренгейтах и Кельвинах
        var F = C * 9/5 + 32;
        var K = C + 273.15;
        // Форматированный вывод где %.Nf - количество цифр после запятой
        System.out.printf("Температура в градусах Фаренгейта: %.2f\nТемпература в градусах Кельвина: %.2f", F, K);
    }
}
