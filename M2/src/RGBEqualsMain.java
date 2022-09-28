public class RGBEqualsMain {
    public static void main(String[] args) {
        RGB red = new RGB(1, 0, 0);
        RGB green = new RGB(0, 1, 0);
        RGB maybeRed = new RGB(1,0,0);

        System.out.println("red == green            : " + red.equals(green));
        System.out.println("maybeRed == green       : " + maybeRed.equals(green));
        System.out.println("maybeRed == red         : " + maybeRed.equals(red));
        System.out.println("maybeRed == maybeRed    : " + maybeRed.equals(maybeRed));
    }
}
