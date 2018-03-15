/*
Write a Java program to check if a file or directory specified by pathname exists or not
*/

package exercises.InputOutputFileSystem;
import java.io.File;

public class Ex003 {

    public static void main(String[] args) {
        String fPath;
        File f;

        fPath = "/Users/jadams";
        f = new File(fPath);
        System.out.println(f.exists());

        fPath = "/Users/araja";
        f = new File(fPath);
        System.out.println(f.exists());

    }
}
