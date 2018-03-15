/*
Write a Java program to get specific files by extensions from a specified folder
*/

package exercises.InputOutputFileSystem;
import java.io.File;

public class Ex002 {

    public static void main(String[] args) {
        String myDir;
        String myExtension;
        File dirHandle;

        myDir = "/Users/jadams/Documents/atom-projects/gecco-utils/gecco";
        myExtension = ".py";

        dirHandle = new File(myDir);

        String[] fileList = dirHandle.list();
        for (int i = 0; i < fileList.length; i++) {

            if (fileList[i].endsWith(myExtension)) {
                System.out.println(fileList[i]);
            }

        }

    }
}
