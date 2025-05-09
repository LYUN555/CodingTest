class Solution {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        char a;
        for(int i = 0; i<s.length(); i++){
            a = s.charAt(i);
            if(a == ' '){
                index = 0;
                answer += a;
            } else{
                if(index %2 ==0){
                    answer += Character.toUpperCase(a);
                } else {
                    answer += Character.toLowerCase(a);
                }
            index++;
            }
        }
        return answer;
    }
}