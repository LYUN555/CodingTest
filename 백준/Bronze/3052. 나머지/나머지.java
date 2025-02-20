import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Set<Integer> list = new HashSet<>();
        for(int i =0; i<10; i++){
            int a = sc.nextInt();
            int b = a % 42;
            list.add(b);
        }
        System.out.print(list.size());
        
    }
}