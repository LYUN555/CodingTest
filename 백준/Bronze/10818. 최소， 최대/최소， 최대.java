import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        for(int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        int c = Arrays.stream(b).min().getAsInt();
        int d = Arrays.stream(b).max().getAsInt();
        System.out.print(c + " " + d);
    }
}