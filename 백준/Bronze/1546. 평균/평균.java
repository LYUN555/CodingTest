import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<n; i++){
            int score = sc.nextInt();
            list.add(score);
        }
        int max = Collections.max(list);
        double sum = 0;
        for(int score : list) {
            sum += (double) score/max*100;
        }
        
        double avg = sum / n;
        System.out.print(avg);
    }
}