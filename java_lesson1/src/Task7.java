import java.util.Scanner;

public class Task7 {
    // Переводит минуты в часы и минуты
    public static void MinsTtHours() {
     Scanner  scanner = new Scanner(System.in);
     System.out.print("Введите количество минут: ");
     int mins = scanner.nextInt();
     var curH = mins / 60;
     var curM = mins % 60;
     System.out.printf("%d ч %d мин", curH, curM);
    }
}
