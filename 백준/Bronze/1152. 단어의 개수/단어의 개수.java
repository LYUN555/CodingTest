import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine().trim();
        if (a.isEmpty()) {
            System.out.println(0);
        } else {
            String[] str = a.split(" ");
            System.out.println(str.length);
        }
    }
}