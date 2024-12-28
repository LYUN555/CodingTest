import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] b = a.split(" ");
        Long c = 0l;
        for(int i = 0; i < b.length; i++) {
            c += Long.parseLong(b[i]);
        }
        System.out.println(c);
        
    }
}