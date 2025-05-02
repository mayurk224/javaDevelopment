import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Writer_ {
    public static void main(String[] args) {
        // writer class of java io package is an abstract superclass that represents a stream of character
        // writer is superclass; there are three subclasses that extends writer class
        // 1. BufferedWriter
        // 2. StringWriter
        // 3. InputStreamWriter

        // InputStreamWriter has a subclass which is FileWriter

        String toInsertString = "Hello World!";
        try {
            Writer writer = new FileWriter("C:\\Users\\yashk\\Desktop\\javaDevelopment\\test_file_for_Writer_.txt");

            // write the contents of the file
            writer.write(toInsertString);

            // close the writer
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
