import java.util.Scanner;

public class Task4 {
    // Сумма цифр числа без цикла (числа больше 999 обрезаются)
    public static void SumNumsBase(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int num = scanner.nextInt();
        var fst = num % 10;
        var snd = num / 10 % 10;
        var trd = num / 100 % 10;
        var sum = fst + snd + trd;
        System.out.print("Сумма цифр в указанном числе (без цикла): " + sum + "\n");
    }

    // Сумма цифр числа c циклом и проверкой длины числа
    public static void SumNumsCicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int num = scanner.nextInt();
        // Проверка числа на удовлетворение диапазону (в условии задания этого нет)
        if (num < 100 || num > 999){
            System.out.print("Число за пределами доступного диапазона");
            return;
        }
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.print("Сумма цифр в указанном числе (цикл): " + sum);
    }

}
