import java.io.*;
import java.util.*;

public class Main { // 클래스 선언 추가
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long N = Long.parseLong(input[0]);
        int B = Integer.parseInt(input[1]); 
        
        StringBuilder result = new StringBuilder();
        
        if (N == 0) {
            System.out.println(0);
        }
        
        while (N > 0) {
            long remainder = N % B;
            if (remainder < 10) {
                result.append(remainder);
            } else {
                result.append((char)('A' + remainder - 10));
            }
            N /= B;
        }
        
        System.out.println(result.reverse().toString());
    }
}