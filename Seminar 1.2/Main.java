//  Задание №4
//  Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
//  целочисленный одномерный массив.
//  Метод должен пройтись по каждому элементу и проверить что он не равен null.
//  А теперь реализуйте следующую логику:
//  1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
//      пользователя
//  2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их
//      “подсветить”

public class Main {
    public static void main(String[] args) {
        Integer[] array = {null, -34, 1, 2, null, 45, 57};
        checkArray(array);
    }

    public static void checkArray(Integer[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == null)
                System.out.println("Встретилось значение null на индексе " + i);
        }
    }
}
