/*
Write a Java program to get a list of all file/directory names from the given.
*/

package exercises.InputOutputFileSystem;
import java.io.File;
import java.util.List;

public class Ex001 extends Object {

    public static void main(String[] args) {
        File input = new File("/Users/jadams");
        String[] fileList = input.list();

        for (int i=0; i<fileList.length; i++) {
            System.out.println(fileList[i]);
        }

    }

}
