//  Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
//
//  Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
//
//  Метод divisionByZero - Деление на 0
//
//  Метод numberFormatException - Ошибка преобразования строки в число
//
//  Важно: они не должны принимать никаких аргументов
class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] arr = new int[20];
        System.out.println(arr[21]);
    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int a = 1;
        int b = 0;
        int c = a / b; // Деление на ноль
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String str = "JKLJH";
        int s = Integer.parseInt(str);
    }
}

