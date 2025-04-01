class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ");
        int[] arr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        int max =0;
        int min =0;
        for(int i=0; i< arr.length; i++) {
            if(i ==0) {
                max = arr[i];
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        answer = min+" "+max;
        return answer;
    }
}