/*
Write a Java program to display the pattern.
*/

package exercises.Basic;

public class Ex008 {
    public static void main(String[] args) {
        String row2;
        String row1;
        String row3;
        String row4;

        row1 = "   J    a   V     V  a   \n";
        row2 = "   J   a a   V   V  a a  \n";
        row3 = "J  J  aaaaa   V V  aaaaa \n";
        row4 = " JJ  a     a   V  a     a\n";

        System.out.println(row1 + row2 + row3 + row4);
    }
}
