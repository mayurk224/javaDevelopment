import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStream_ {
    // the output stream is a class in an abstract class
    // it's a super class that represent an output stream of bytes, since
    // output stream is an abstract class. it is not useful by itself,
    // however, its subclasses can be used to write data

    // output stream has subclass like fileOutputStream, byteArrayOutputStream, objectOutputStream which extends the output stream

    public static void main(String[] args) throws IOException {
        String data = "Hello World";

        // writing data to file
        OutputStream outputStream = new FileOutputStream("C:\\Users\\yashk\\Desktop\\javaDevelopment\\test_file_for_InputStream_.txt");

        // converting string to a byte array
        byte[] dataBytes = data.getBytes();

        // writing data to the file
        outputStream.write(dataBytes);

        System.out.println("Data written to file successfully");

        outputStream.close(); // close the stream to release system resources
    }
}
