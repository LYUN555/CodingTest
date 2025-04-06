class Solution {
    public int solution(int n) {
        int answer = 0;
        int nCount = Integer.bitCount(n);
        
        while(true){
            n++;
            int oneCount = Integer.bitCount(n);
            if(oneCount == nCount){
                answer = n;
                break;
            }
        }
        
        
        return answer;
    }
}