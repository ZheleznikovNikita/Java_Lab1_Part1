import java.util.Scanner;
public class Task1 {
    public static void CurrentTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите  текущий час: ");
        int hour = scanner.nextInt();
        assert hour < 0 || hour > 23 : "Время за пределами диапазона";
            if (hour >= 0 && hour <= 5){
                System.out.print("Ночь");
            } else if (hour >= 6 && hour <= 11) {
                System.out.print("Утро");
            } else if (hour >= 12 && hour <= 17) {
                System.out.print("День");
            }
            else System.out.print("Вечер");
    }
}
