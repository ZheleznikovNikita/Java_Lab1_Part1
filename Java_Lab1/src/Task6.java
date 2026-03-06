import java.util.Scanner;

public class Task6 {
    // Ищет расстояние между двумя точками
    public static void Dist(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координаты первой точки: ");
        // Считываем два числа из введённой строки
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Введите координаты второй точки: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        // Math.sqrt считает корень
        var dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("Расстояние между точками (%.3f, %.3f) и (%.3f, %.3f): %.3f", x1, y1, x2, y2, dist);
    }
}
