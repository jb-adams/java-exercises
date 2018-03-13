package exercises.Basic;

public class Ex004 {

    public static int function1() {
        return -5 + (8 * 6);
    }

    public static int function2() {
        return (55 + 9) % 9;
    }

    public static int function3() {
        return 20 + (-3 * 5) / 8;
    }

    public static int function4() {
        return 5 + 15 / 3 * 2 -8 % 3;
    }


    public static void main(String[] args) {
        int result1 = function1();
        int result2 = function2();
        int result3 = function3();
        int result4 = function4();

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
