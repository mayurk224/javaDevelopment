import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReader_ {
    public static void main(String[] args) {
        // Reader class of the java.io package is an abstract superclass that represents a stream of characters
        // Reader is superclass; there are three subclass which extends Reader class
        // 1. BufferedReader
        // 2. StringReader
        // 3. InputStreamReader

        // InputStreamReader has a subclass which is FileReader
        //  is used to read the contents of a file as a stream of characters

        // in this we are going to use the character stream to read and write the contents of a file


        try (Reader reader = new FileReader("C:\\Users\\yashk\\Desktop\\javaDevelopment\\test_file_for_FileReader_.txt")) {
            char[] array = new char[100];
            int charsRead = reader.read(array);
            // check reader is ready
//            System.out.println("Reader is ready: " + reader.ready());

            // read the contents of the file
            reader.read(array);
            System.out.println("Contents of the file: ");
            System.out.println(new String(array, 0, charsRead));

            // No need to explicitly close the stream in try-with-resources
            System.out.println("\nReading complete. Stream is now closed.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
