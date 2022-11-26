package mobility.model;

public class MobileExceptionTest {
    public static void main(String[] args) {
        Mobile test = new Brownian(1, 2, 0.5);
        test = new Brownian(1, 2, -0.5);
    }
}
