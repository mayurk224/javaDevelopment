import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;

public class StringReader_ {
    public static void main(String[] args) {
        // StringReader class of the java io package can be used to read data from strings
        // StringReader the specified string acts as a source from where characters are read individually

        String toReadString = "Hello World!";

        try (Reader reader = new StringReader(toReadString)) {
            char[] buffer = new char[100];
            int charsRead = reader.read(buffer);

            if (charsRead > 0) {
                String result = new String(buffer, 0, charsRead);
                System.out.println("Contents of the string: " + result);
            } else {
                System.out.println("Nothing was read from the string.");
            }

        } catch (IOException e) {
            throw new RuntimeException("Error reading from string: " + e.getMessage(), e);
        }
    }
}
