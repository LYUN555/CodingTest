class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int repeat = food[i] / 2;  
            for (int j = 0; j < repeat; j++) {
                left.append(i);  
            }
        }
        StringBuilder right = new StringBuilder(left).reverse();
        return left.toString() + "0" + right.toString();
    }
}