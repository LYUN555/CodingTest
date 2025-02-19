import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for(int i=1; i <= 30; i++) {
            list.add(i);
        }
        for(int i=1; i <= 28; i++) {
            int b = sc.nextInt();
            list.remove(Integer.valueOf(b));
        }
        
        for(int result : list) {
            System.out.println(result);
        }
        
    }
}