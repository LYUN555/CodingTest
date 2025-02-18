import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] result = new int[n+1];
        for(int i = 1; i <=n; i++){
            result[i] = i;
        }
        for(int k = 0; k <m; k++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            
            int temp = result[i];
            result[i] = result[j];
            result[j] = temp;
        }
        for(int i = 1; i <=n; i++){
            System.out.print(result[i]+" ");
        }
    }
}