import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> list = new HashSet<>();
        for(int i=0; i < numbers.length; i++) {
            for(int j=i+1; j< numbers.length; j++) {
                list.add(numbers[i]+numbers[j]);
            }
        }
        answer = list.stream().sorted().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}