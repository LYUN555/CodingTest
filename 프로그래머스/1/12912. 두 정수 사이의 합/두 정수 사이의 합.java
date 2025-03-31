class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int first = 0;
        int second = 0;
        if(a>b) {
            first = b;
            second = a;
        } else{
            first = a;
            second = b;
        }
        for(int i = first; i <=second; i++) {
            answer += i;
        }
        return answer;
    }
}