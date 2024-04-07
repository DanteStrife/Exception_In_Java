//  Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//  и возвращающий новый массив, каждый элемент которого равен сумме элементов двух
//  входящих массивов в той же ячейке.
//  Если длины массивов не равны, необходимо как-то оповестить пользователя.

import java.util.Arrays;

public class DZ_7 {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{4, 5, 6};
            b = new int[]{1, 2, 3, 5};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        DZ_7 ans = new DZ_7();
        String itresume_res = Arrays.toString(ans.subArrays(a, b));
        System.out.println(itresume_res);
        try(RuntimeException e){

        }
    }

    public int[] subArrays(int[] a, int[] b) {
        // Введите свое решение ниже
        int[] c = new int[a.length];
        if (a.length != b.length) {
//            throw new RuntimeException("Разная длина массивов");
            System.out.println("Разная длина массивов");
            return new int[]{0};
        }
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }

        return c;
    }
}
