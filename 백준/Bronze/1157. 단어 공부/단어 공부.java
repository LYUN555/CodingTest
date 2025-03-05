import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine().toUpperCase();
        int[] count = new int[26];
        
        for(int i = 0; i< str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch<= 'Z') {
                count[ch -'A']++;
            }
        }
        int maxCount = 0;
        char result = '?';
        
        for(int i = 0; i< 26; i++) {
            if(count[i] > maxCount) {
                maxCount = count[i];
                result = (char)(i+'A');
            } else if(count[i] == maxCount) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}