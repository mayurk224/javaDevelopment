import java.io.File;
import java.io.IOException;

public class File_ {
        // Java Input and Output
        // Java I/O (Input and output) is used to process the input and proceed the output.
        // Java used the concept of stream to make IO operation fast. The Java.io package contained all the classes required for input and output operations.
        // Java perform input output via streams. Streams are the sequence of data that are ready for source or written on a destination.

        // File Class
        // The file system consists of two logical storage units, file and directory.
        // For the file system, the two units are unified under the concept of files.
        // File can be a file or a directory.
        // The File class is the entry point of the file system. It allows you to create an object that is associated to a file or a directory on a disk.
        // The existence of this object does not mean that the file or directory exists on disk. It's just an object in a memory.
        // The file class is not used to make input output because it does not specify how the information is extracted or stored in a file. It described the property of file itself.
        // a file type object is used to manipulate the information associated with the disk file such as permissions, time, date, directories as well as navigating through a hierarchy?
        // A directory in Java is treated as a simple file.

        // Streams
        // In general, a stream means a continuous stream of data. Streams are a clean way to process input output without every part of your code understanding the physical layer.

        // The `File` class in the `java.io` package represents a file or directory path in the filesystem. It provides various methods to create, delete, and check properties of files and directories, such as their existence, readability, and writability.
        //
        //### Why Use the `File` Class?
        //
        //- **File Manipulation**: It provides a way to handle files and directories in Java. You can create, delete, rename, or check the status of files.
        //- **Path Handling**: It allows you to work with file paths, enabling the creation of new paths, navigating directories, and more.
        //- **Cross-Platform**: The `File` class handles different file path separators, making your code cross-platform.
        //
        //### Key Methods of the `File` Class
        //
        //1. **File Creation and Deletion**:
        //   - `createNewFile()`: Creates a new file.
        //   - `mkdir()`: Creates a new directory.
        //   - `delete()`: Deletes a file or directory.
        //
        //2. **File Information**:
        //   - `exists()`: Checks if the file or directory exists.
        //   - `canRead()`, `canWrite()`, `canExecute()`: Checks the permissions.
        //   - `length()`: Returns the size of the file in bytes.
        //   - `isDirectory()`, `isFile()`: Checks if the path is a directory or file.
        //
        //3. **Path Handling**:
        //   - `getAbsolutePath()`: Returns the absolute path of the file.
        //   - `getName()`: Returns the name of the file or directory.
        //   - `listFiles()`: Returns an array of `File` objects representing the files in a directory.
        //
        //### Example Code
        //
        //Here’s a simple example that demonstrates how to use the `File` class:

            public static void main(String[] args) {

                // example 1
                File f = new File("/java/copyright");
                System.out.println(f.getName());
                System.out.println(f.getPath());
                System.out.println(f.getParent());
                System.out.println(f.exists());
                System.out.println(f.isDirectory());
                System.out.println(f.isFile());
                System.out.println(f.length() );

                // example 2
                File f1 = new File("hello.txt");
                try {
                    if(f1.createNewFile()){
                        System.out.println("File Created: "+f1.getAbsoluteFile());
                    }else {
                        System.out.println("file already exist");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        //
        //### Advantages of Using the `File` Class
        //
        //1. **Simplicity**: It provides a straightforward way to interact with the filesystem.
        //2. **Cross-Platform Compatibility**: Handles different file path separators, making code portable across platforms.
        //3. **Wide Range of Methods**: Offers a comprehensive set of methods for file and directory management.
        //4. **Efficient File Handling**: Enables efficient file and directory management without needing to delve into lower-level system-specific APIs.
        //
        //### When to Use the `File` Class
        //
        //- **File Creation/Deletion**: When you need to create or delete files or directories.
        //- **File Information Retrieval**: When you need to check the properties of files, such as their size, path, or permissions.
        //- **Path Navigation**: When you need to navigate through directories and handle file paths.
        //
        //Overall, the `File` class is an essential part of Java’s I/O system, providing a robust and easy way to work with files and directories.

}
