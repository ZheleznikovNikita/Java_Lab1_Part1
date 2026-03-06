import java.util.Scanner;

public class Task1 {
    // Выводит приветствие и возраст через 5 лет
    public static void Greeting(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Как вас зовут? ");
        // Считываем строку
        String name = scanner.nextLine();
        System.out.print("Сколько вам лет? ");
        // Считываем целое число
        int age = scanner.nextInt();
        // Форматированный вывод, %s - форматирование аргумента, как строку, %d - форматироваание аргумента, как целое число
        System.out.printf("Привет, %s! Через 5 лет тебе будет %d лет.", name, age + 5);
    }
}
