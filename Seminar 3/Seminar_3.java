import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Seminar_3 {
    public void rwLine(Path pathHead, Path pathWrite) throws IOException {
        try (BufferedReader in = Files.newBufferedReader(pathHead); BufferedWriter out = Files.newBufferedWriter(pathWrite)) {
            out.write(in.readLine());
        }
    }
}
