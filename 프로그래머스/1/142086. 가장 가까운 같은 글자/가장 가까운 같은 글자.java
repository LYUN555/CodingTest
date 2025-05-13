class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] arr = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            arr[i] = s.charAt(i);
            boolean a = false;
            for(int j = i-1; j>=0;j--){
                if(arr[i] == arr[j]){
                    a = true;
                    answer[i] =i-j;
                    break;
                }
            }
            if(!a){
                answer[i] = -1;
            }
        }
        return answer;
    }
}