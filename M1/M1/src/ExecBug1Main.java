public class ExecBug1Main {
    public static void main(String[] args) {
        int x = 2;
        int y = 1;
        int z = x/y;

        System.out.println(x + "/" + y + " = " + z);
    }
}
