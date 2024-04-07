public class Seminar_2_1 {
    public static void main(String[] args) {
        String[][] arr = {{"12", "34"}, {"abc", "12adq"}};
        System.out.println(sum2d(arr));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                } catch (NumberFormatException e) {
                    // System.out.println("Не могу перевести строку в число!");
                    sum += 0;
                }
            }
        }
        return sum;
    }
}