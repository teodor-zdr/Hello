import java.util.Random;

public class RandomGenerator {

    public static void main(String args[]) {

        final String alphabet = "abcdefghijklmnopqrstuvwxyz123456789!@#$%^&*()_+";
        final int N = alphabet.length();

        Random r = new Random();

        for (int i = 0; i < 16; i++) {
            System.out.print(alphabet.charAt(r.nextInt(N)));
        }
    }
}
