//  Cимвол `a`
//
//  Напишите программу, которая принимает символ a в качестве аргумента и выполняет следующую проверку:
//  если символ a равен пробелу '', программа должна выбрасывать исключение с сообщением
//  "Пустая строка введена.".
//  В противном случае программа должна возвращать сообщение
//  "Ваш ввод - [символ]", где [символ] заменяется на введенный символ a.
//
//  На входе:
//
//
//          '0'
//  На выходе:
//
//
//  Result: Your input was - 0

public class Auto_4 {
    public static String expr(char a) throws Exception {
// Введите свое решение ниже
        if (a == ' ') {
            throw new Exception("Empty string has been input.");
        } else {
            return "Your input was - " + a;
        }
    }
}

