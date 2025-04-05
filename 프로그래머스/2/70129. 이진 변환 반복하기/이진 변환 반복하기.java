class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zeroCount = 0;
        int oneLength = 0;
        
        while(s.length()>1){
            int oneCount = 0;
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == '0') {
                    zeroCount++;
                } else {
                    oneCount++;
                }
            }
            s = Integer.toBinaryString(oneCount);
            oneLength++;
        }
        answer[0] = oneLength;
        answer[1] = zeroCount;
        
        return answer;
    }
}