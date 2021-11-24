import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Classroom {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static double div(int a, int b) {
        return (double) a / b;
    }

    public static int sq(int n) {
        return n * n;
    }

    public static int cube(int n) {
        return n * n * n;
    }

    public double sqr(double a) {
        if (a >= 0)
            return Math.sqrt(a);
        return 0;
    }

    public double loga(double a) {
        return Math.log(a);
    }

    public static int mod(int a, int b) {
        return a % b;
    }

    public static int fp(int n) {
        return n * n * n * n;
    }

    public byte[] hashFunction (String data) throws NoSuchAlgorithmException {
        MessageDigest msgDigest = MessageDigest.getInstance("SHA-1");
        return msgDigest.digest(data.getBytes());
    }
}