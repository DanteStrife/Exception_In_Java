import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Seminar_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("hello: ");
        try {
            int index = scanner.nextInt();
            arr[index] = 1;
        }catch (InputMismatchException e){
            System.out.println("Было введено значение отличное от числа");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Неверно указан индекс");
        }
    }
}

