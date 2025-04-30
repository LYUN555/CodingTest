import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        
        for(int i =0; i< arr.length; i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
            } else if(arr[i] == stack.peek()){
                continue;
            } else {
                stack.push(arr[i]);
            }
        }
        answer = new int[stack.size()];
        for(int i =0; i<answer.length; i++){
            answer[i] = stack.get(i);
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}