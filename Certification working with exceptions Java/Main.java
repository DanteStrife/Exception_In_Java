import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            String[] data;
            Scanner scanner = new Scanner(System.in);
            boolean work = true;
            while (work) {
                System.out.println("Введите команду(1 - Записать данные, 2 - выход.) :  ");
                String line = scanner.nextLine();
                switch (line) {
                    case "1":
                        MakeRecord();
                        break;
                    case "2":
                        System.out.println("До встречи!");
                        work = false;
                        break;
                    default:
                }
            }
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }

    }

    public static void MakeRecord() throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите все данные через /:\n" +
                    "Фамилия Имя Отчество\n" +
                    "Дата рождения - строка формата dd.mm.yyyy\n" +
                    "Номер телефона - целое беззнаковое число без форматирования\n" +
                    "Пол - символ латиницей W или M.\n");
            String input = scanner.nextLine();
            String[] data = input.split("/");
            if (data.length != 4) {
                throw new IllegalArgumentException("Параметры введены неверно(Не соответствуют количеству.)!");
            }

            String secondNamefirstNamethirdName = data[0];
            Date birthdate = parseDate(data[1]);
            int phoneNumber = Integer.parseInt(data[2]);
            String sex = data[3];


            System.out.println("Фамилия Имя Отчество: " + secondNamefirstNamethirdName);
            System.out.println("Дата рождения: " + birthdate);
            System.out.println("Номер телефона: " + phoneNumber);
            System.out.println("Пол: " + sex);

            SaveFile(data);

            if (!sex.toLowerCase().equals("m") && !sex.toLowerCase().equals("w")) {
                throw new RuntimeException("Неверно введен пол");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Неверный формат номера телефона.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (ParseException e) {
            System.out.println("Ошибка: Неверный формат даты.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Недостаточно данных.");
        }

    }

    private static Date parseDate(String datestr) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy");
        return format.parse(datestr);
    }

    private static String formatDate(Date date) {               // Преобразование 'Date' в строку
        SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy");
        return format.format(date);
    }

    public static void SaveFile(String[] data) throws IOException {
        String filename = data[0] + ".txt"; // Имя файла - фамилия
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(String.join(" ", data));
        }
    }
}
