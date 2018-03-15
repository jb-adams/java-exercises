/*
Write a Java program to check if a file or directory has read and write permission.
*/

package exercises.InputOutputFileSystem;
import java.io.File;

public class Ex004 {

    public static void main(String[] args) {
        String fPath;
        File f;

        fPath = "/Users/jadams/Documents/atom-projects/gecco-utils/gecco/methods.py";
        f = new File(fPath);

        System.out.println(f.canRead());
        System.out.println(f.canWrite());

    }
}
