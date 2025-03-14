import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        for (String s : croatian) {
            str = str.replace(s, " ");
        }
        
        System.out.println(str.length());
    }
}