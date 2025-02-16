import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] answer = new int[n];
        for(int i =0; i<m; i++){
            int j = sc.nextInt();
            int k = sc.nextInt();
            int l = sc.nextInt();
            for(int a=j; a<=k; a++){
                answer[a - 1] = l;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(answer[i]+" ");
        }
    }
}