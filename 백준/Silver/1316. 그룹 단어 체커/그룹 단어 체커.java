import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int count = 0;
        for(int i = 0; i < n; i++) {
            String word = sc.nextLine();
            if(groupWord(word)){
                count ++;
            }
        }
        System.out.println(count);
    }
    public static boolean groupWord(String word) {
        boolean[] check = new boolean[26];
        int prev = -1;
        for(int i =0; i<word.length(); i++){
            int current = word.charAt(i) - 'a';
            if(prev != current) {
                if(check[current] == true){
                    return false;
                } else {
                    check[current] = true;
                    prev = current;
                }
            }
        }
        return true;
    }
}