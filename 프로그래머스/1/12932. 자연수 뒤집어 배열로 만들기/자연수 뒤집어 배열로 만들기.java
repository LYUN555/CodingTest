class Solution {
    public int[] solution(long n) {
        String a = n+"";
        int[] answer = new int[a.length()];
        int i = 0;
        while(n > 0) {
            answer[i] = (int)(n%10);
            n = n /10;
            i++;
            
        }
        return answer;
    }
}