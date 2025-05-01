public class Streams_ {
    // in general, a stream means a continuous stream of data.
    // streams are a clean way to process input/output without
    // every part of your code understanding the physical layer

    // to read data from source, we have to use input stream,
    // where, as to write data to destination, we have to use output stream

    // a stream is linked to a physical layer by the java I/O system to make input/output
    // java encapsulates stream under the java.io package

    // java defines two types of streams
    // 1. byte stream
    // 2. character stream

    // Java stream based I/O is build upon four abstract classes:
    // 1. InputStream
    // 2. OutputStream
    // 3. Reader
    // 4. Writer

    // InputStream and OutputStream are designed for byte streams.
    // reader and writer are designed for character streams

    // InputStream is the abstract class for all classes representing an input stream of bytes.
    // OutputStream is the abstract class for all classes representing an output stream of bytes.
    // Reader is the abstract class for all classes representing an input stream of characters.
    // Writer is the abstract class for all classes representing an output stream of characters.

    // The classes that extend these abstract classes are used to read and write data from and to files, network connections, etc.
    // The classes that extend InputStream and OutputStream are used to read and write binary data, such as images, audio files, etc.
    // The classes that extend Reader and Writer are used to read and write text data, such as text files, XML files, etc.
    // The classes that extend InputStream and OutputStream are used to read and write binary data, such as images, audio files, etc.

    public static void main(String[] args) {

    }
}
