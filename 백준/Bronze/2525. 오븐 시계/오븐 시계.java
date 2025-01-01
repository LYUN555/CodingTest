import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int m2 = h*60 + m + a;
        int h2 = m2/60 % 24;
        int m3 = m2%60;
        System.out.println(h2 + " " +m3);
    }
}