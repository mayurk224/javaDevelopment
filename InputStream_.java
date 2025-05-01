import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStream_ {
    // Use the character stream classes when working with characters or strings
    // Byte stream class working with bytes or other binary objects
    // InputStream is an abstract class that defines java model of streaming byte input
    // All methods in this class with zero will throw an IOException on error condition
    // InputSteam is a super class of all input streams in the java api so each subclass of inputstream typically has a very specific use but can be used as an inputstream
    // the inputstream subclass are the final fileInputStream, byteArrayInputStream, filterInputStream, pipedInputStream, objectInputStream
    // filterInputStream has subclass classes such as bufferedInputStream, dataInputStream, pushBackInputStream

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("C:\\Users\\yashk\\Desktop\\javaDevelopment\\test_file_for_InputStream_.txt");
        int data = inputStream.read();
        while(data!=-1){
            System.out.print((char)data); // if we don't use char casting, it will return every character as ascii value in int
            data = inputStream.read();
        }
        inputStream.close();
    }
}
