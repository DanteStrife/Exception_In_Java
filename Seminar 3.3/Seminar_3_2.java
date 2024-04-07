//  Задание №3
//          1. Создайте класс исключения, который будет выбрасываться при делении на
//  0. Исключение должно отображать понятное для пользователя сообщение
//  об ошибке.
//          2. Создайте класс исключений, которое будет возникать при обращении к
//  пустому элементу в массиве ссылочного типа. Исключение должно
//  отображать понятное для пользователя сообщение об ошибке
//          3. Создайте класс исключения, которое будет возникать при попытке открыть
//  несуществующий файл. Исключение должно отображать понятное для
//  пользователя сообщение об ошибке.

import java.io.FileNotFoundException;

public class Seminar_3_2 {

}

class DivideByZero extends ArithmeticException {
    public DivideByZero() {
        super("Делить на ноль нельзя.");
    }

}

class LinkNullArray extends NullPointerException {
    public LinkNullArray() {
        super("Обращение к пустому элементу массива.");
    }
}

class NotFoundFile extends FileNotFoundException {
    public NotFoundFile() {
        super("Файл не существует.");
    }
}
