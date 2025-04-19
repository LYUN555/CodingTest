class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int sum = brown+yellow;
        for(int y =1; y<= sum; y++){
            if(sum%y == 0){
                int x = sum/y;
                if(x>=y){
                    int innerX = x - 2;
                    int innerY = y - 2;

                    if (innerX * innerY == yellow) {
                        return new int[] {x, y};
                    }
                }
            }
        }
        return answer;
    }
}