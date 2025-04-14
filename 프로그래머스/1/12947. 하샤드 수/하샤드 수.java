class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int origin = x;
        int a = 0;
        while(x>0){
            a += x%10;
            x = x/10;
        }
        if(origin%a != 0) {
            answer = false;
        }
        return answer;
    }
}