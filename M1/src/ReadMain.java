import java.util.Scanner;

public class ReadMain {
    public static void main(String[] args) {
        boolean test;
        System.out.println("Hello");

        Scanner sc = new Scanner(System.in);
        test = sc.nextBoolean();

        System.out.println("Bool : "  + test);
    }
}
