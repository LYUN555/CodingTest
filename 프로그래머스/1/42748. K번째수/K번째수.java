import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int j = commands[i][0];
            int k = commands[i][1];
            int l = commands[i][2];
            int arr[] = new int[k+1 - j];
            for(int ar =0; ar<arr.length; ar++){
                arr[ar] = array[j-1+ar];
            }
            Arrays.sort(arr);
            answer[i] = arr[l-1];
        }
        return answer;
    }
}