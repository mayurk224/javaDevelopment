import java.io.File;

public class Directory_ {

    // A directory is a File which can contain a list of other files and
    // directories. You use File object to create directories, to list
    // down files available in a directory. For complete detail, check a
    // list of all the methods which you can call on File object and
    // what are related to directories.

    // Creating Directory
    // There are two useful File utility methods, which can be used to
    // create directories −
    //
    // The mkdir() method creates a directory, returning true on success and
    // false on failure. Failure indicates that the path specified in the
    // File object already exists, or that the directory cannot be created
    // because the entire path does not exist yet.
    //
    // The mkdirs() method creates both a directory and all the parents of
    // the directory.

//    public static void main(String args[]) {
//        String dirname = "Folder_By_Directory/SubFolder";
//        File directory = new File(dirname);
//
//        // Create directory now.
//        directory.mkdirs();
//
//        // create new file object
//        File file = new File("Folder_By_Directory/SubFolder");
//
//        System.out.println(file.exists());
//    }


    // Listing (Reading) Directories
    // You can use list() method provided by File object to list down all
    // the files and directories available in a directory as follows −

//    public static void main(String[] args) {
//        File file = null;
//        String[] paths;
//
//        try {
//            // create new file object
//            file = new File("Folder_By_Directory/SubFolder");
//
//            // array of files and directory
//            paths = file.list();
//
//            // for each name in the path array
//            for(String path:paths) {
//                // prints filename and directory name
//                System.out.println(path);
//            }
//        } catch (Exception e) {
//            // if any error occurs
//            e.printStackTrace();
//        }
//    }


    // Deleting Directories
    // You can use delete() method provided by File object to delete
    // a directory as follows −

    public static boolean deleteDirectoryRecursively(File dir) {
        File[] allContents = dir.listFiles();
        if (allContents != null) {
            for (File file : allContents) {
                deleteDirectoryRecursively(file); // recursive call
            }
        }
        return dir.delete(); // now directory is empty
    }

    public static void main(String[] args) {
        File directory = new File("Folder_By_Directory/SubFolder");
        if (directory.exists()) {
            boolean success = deleteDirectoryRecursively(directory);
            if (success) {
                System.out.println("The directory has been successfully deleted.");
            } else {
                System.out.println("The directory deletion failed.");
            }
        } else {
            System.out.println("The directory is not present.");
        }
    }
    // Note: The delete() method will only delete a directory if it is empty.

    // from lecture

//    public static void main(String[] args) {
//        // create a directory
//        File directory1 = new File("Folder_By_Directory");
//        directory1.mkdir(); // this will create a directory/folder
//
//        System.out.println("Directory created: " + directory1.getAbsolutePath());
//
//        // get all files in the directory
//        if( directory1.isDirectory() ) {
//            System.out.println("Directory of : " + directory1.getName());
//            String[] files = directory1.list();
//
//            for (int i = 0; i < files.length; i++) {
//                File f = new File(directory1+ "/" + files[i]);
//
//                // Check is there any nested directories
//                if(f.isDirectory()){
//                    System.out.println("Directory: " + files[i]);
//                } else {
//                    System.out.println("File: " + files[i]);
//                }
//            }
//
//        }
//        else{
//            System.out.println("Not a directory");
//        }
//
//    }
}