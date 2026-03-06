import java.util.Scanner;

public class Task8 {
    // Записывает число в обратном порядке (числа больше 999 обрезаются, меньше 100 умножаются на 10)
    public static void ReverseNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int num = scanner.nextInt();
        var fst = num % 10;
        var snd = num / 10 % 10;
        var trd = num / 100 % 10;
        var res = fst * 100 + snd * 10 + trd;
        System.out.print("Перевёрнутое число: " + res + "\n");
    }

    // Записывает число в обратном порядке с проверкой длины числа
    public static void ReverseNumWithIf(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int num = scanner.nextInt();
        // Проверка на удовлетворение диапазону
        if (num < 100 || num > 999) {
            System.out.print("Число за пределами доступного диапазона");
            return;
        }
        var fst = num % 10 * 100;
        var snd = num / 10 % 10 * 10;
        var trd = num / 100;
        var res = fst + snd + trd;
        System.out.print("Перевёрнутое число: " + res);
    }
}
