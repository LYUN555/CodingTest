import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int count = 0;

        do {
            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
            count++;
        } while (n != original);

        System.out.println(count);
    }
}