class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] memo = new int[n+1];
        memo[0] = 0;
        memo[1] = 1;
        return fib(n, memo);
    }
    int fib(int n, int[] memo) {
        if (memo[n] != 0 || n == 0) {
            return memo[n];
        }
        memo[n] = (fib(n-1,memo) + fib(n-2,memo))%1234567;
        return memo[n];
    }
}