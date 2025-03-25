import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String N = input[0];
        int B = Integer.parseInt(input[1]);

        long decimalNumber = 0;
        int power = 0;

        for (int i = N.length() - 1; i >= 0; i--) {
            char digit = N.charAt(i);
            int value = 0;

            if (Character.isDigit(digit)) {
                value = digit - '0';
            } else {
                value = Character.toUpperCase(digit) - 'A' + 10;
            }

            decimalNumber += value * Math.pow(B, power);
            power++;
        }

        System.out.println(decimalNumber);
    }
}