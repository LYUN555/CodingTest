import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        for(int i =0; i<a; i++){
            int b = sc.nextInt();
            String str = sc.next();
            StringBuffer sb = new StringBuffer();
            for(int j =0; j<str.length(); j++) {
                sb.append(String.valueOf(str.charAt(j)).repeat(b));
            }
            System.out.println(sb.toString());    
        }
       
    }
}