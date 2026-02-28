import java.util.Scanner;
public class Task3 {
    public static void Calculate(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Введите первое число: ");
       int num1 = scanner.nextInt();
       System.out.println("Введите второе число: ");
       int num2 = scanner.nextInt();
       System.out.println("Введите операцию(+, -, *, /): ");
       String operation = scanner.next();
       switch (operation){
           case "+" :
               System.out.print("Сумма чисел: " + (num1 + num2));
               break;
           case "-":
               System.out.print("Разность: " + (num1 - num2));
               break;
           case "*":
               System.out.print("Проиведение: " + (num1 * num2));
               break;
           case "/":
               if (num2 == 0) {
                   System.out.print("На ноль делить нельзя!");
                   return;
               }
               var res = num1 / (double)num2;
               System.out.printf("Частное: %.2f", res);
               break;
           default:
               System.out.print("Введён неожиданный символ");
               break;
       }
    }
}
