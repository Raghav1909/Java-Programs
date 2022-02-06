// Write a java program to show ArithmeticException exception

public class JavaException1 {
    public static void main(String args[]) {
        try {
            int data = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
