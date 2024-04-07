import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Seminar_2_3 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("1.txt"));
            List<String> ls = new ArrayList();
            String content = br.readLine();
            while (content != null) {
                ls.add(content);
                content = br.readLine();
            }
            br.close();
            HashMap<String, Integer> map = new HashMap<>();
            for (String i : ls) {
                String[] parts = i.split("=");
                // ["Анна", "?"]
                if (parts.length != 2)
                    throw new IllegalArgumentException("Неверное кол-во аргументов!");
                map.put(parts[0], parts[0].length());
            }
            StringBuilder out = new StringBuilder();
            FileWriter file = new FileWriter("1.txt");
            for (String name : map.keySet()) {
                out.append(name).append("=").append(map.get(name)).append("\n");
            }
            file.write(String.valueOf(out));
            file.flush();
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }
}
