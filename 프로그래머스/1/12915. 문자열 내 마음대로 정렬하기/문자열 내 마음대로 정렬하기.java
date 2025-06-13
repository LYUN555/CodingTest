class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = strings.clone();

        for (int i = 0; i < answer.length - 1; i++) {
            for (int j = 0; j < answer.length - 1 - i; j++) {
                char ch1 = answer[j].charAt(n);
                char ch2 = answer[j + 1].charAt(n);

                if (ch1 > ch2) {
                    String temp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = temp;
                } else if (ch1 == ch2) {
                    if (answer[j].compareTo(answer[j + 1]) > 0) {
                        String temp = answer[j];
                        answer[j] = answer[j + 1];
                        answer[j + 1] = temp;
                    }
                }
            }
        }
        return answer;
    }
}