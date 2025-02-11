import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int[] b = new int[a];
        for(int i=0; i<b.length; i++){
            int c = sc.nextInt();
            b[i] = c;
        }
        int d = sc.nextInt();
        int count = 0;
        for(int i = 0; i<b.length; i++){
            if(b[i] == d){
                count++;
            }
        }
        System.out.print(count);
        
    }
}