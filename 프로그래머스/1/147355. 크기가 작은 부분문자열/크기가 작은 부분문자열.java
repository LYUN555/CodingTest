class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        long num = Long.parseLong(p);
        for(int i = 0; i<= t.length() - length; i++){
            String str = t.substring(i,i+ length);
            long strNum = Long.parseLong(str);
            
            if(strNum <= num){
                answer++;
            }
        }
        return answer;
    }
}