class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() != 6&&s.length() != 4) {
            return false;
        }
        for(int i =0; i<s.length(); i++) {
            char a = s.charAt(i);
            if(a<'0' || a>'9'){
                return false;
            }
        }
        return answer;
    }
}