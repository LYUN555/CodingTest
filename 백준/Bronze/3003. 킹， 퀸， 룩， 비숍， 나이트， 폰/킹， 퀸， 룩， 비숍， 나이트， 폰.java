import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] peace = {1,1,2,2,2,8};
        int[] arr = new int[peace.length];
        int result = 0;
        for(int i =0; i< peace.length; i++) {
            arr[i] = sc.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0; i< peace.length; i++) {
            sb.append(peace[i]-arr[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}