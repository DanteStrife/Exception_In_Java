// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        int a;
        int b;

        if (args.length == 0) {
            a = 5;
            b = 0; // Default values if no arguments are provided
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }

        Auto_3.printSum(a, b);
        double result = Auto_3.expr(a, b);
        System.out.println(result);
    }
}
