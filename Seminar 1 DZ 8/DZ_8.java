//    Реализуйте метод, принимающий в качестве аргументов двумерный массив.
//    Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
//    детализировать какие строки со столбцами не требуется. Как бы вы реализовали подобный метод?

import java.util.Arrays;

public class DZ_8 {
    public static int[][] TestSquareArr(int[][] Arr) {
        int NewArr[][] = new int[0][];
        for (int i = 0; i < Arr[i].length; i++) {
            for (int j = 0; j < Arr[j].length; j++) {
                if (Arr[i].length == Arr[j].length) {
                    System.out.println(Arrays.toString(NewArr[j]));
                }
                if (Arr[i].length != Arr[j].length) {
                    System.out.println(NewArr[i][j] = 9); // ?
                }
            }
        }
        return  NewArr;
    }
    public static void printMatrix(int[][] Arr) {
        for (int[] array : Arr) {
            for (int anInt : array) {
                System.out.print(String.format("%3d", anInt));
            }
            System.out.println();
        }
    }
    public static int[][] PrintArr(int[][] Arr) {
        int NewArr[][] = new int[0][1];
        for (int i = 0; i < Arr[0].length; i++) {
            for (int j = 0; j < Arr[1].length; j++) {
                System.out.println(Arrays.toString(Arr[j]));
            }
        }
        return NewArr;
    }
    public static void main(String[] args) {
        int[][] Arr = {{0, 1, 0, 1, 1, 1, 1, 1, 1},
                       {0, 0, 1, 1, 0, 0, 0},
                       {1, 1, 0, 0, 1, 1, 0, 0},
                       {1, 1, 1, 1, 0}};
        System.out.println(Arrays.deepToString(Arr));
        System.out.println();
//        printMatrix(Arr);
//        System.out.println();
//        PrintArr(Arr);
//        System.out.println();
        TestSquareArr(Arr);

    }
}
