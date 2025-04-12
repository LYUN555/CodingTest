import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        long arr[] = new long[str.length()];
        for(int i=0; i<str.length(); i++) {
            arr[i] = n%10;
            n = n/10;
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            sb.append(arr[i]);
        }
        answer = Long.parseLong(sb.reverse().toString());
        return answer;
    }
}