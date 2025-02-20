import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            list.add(i);
        }
        for(int k = 0; k < m; k++) {
            int i = sc.nextInt()-1;
            int j = sc.nextInt();
            List<Integer> sub = list.subList(i,j);
            Collections.reverse(sub);
        }
        for(int result : list) {
            System.out.print(result+" ");
        }
    }
}