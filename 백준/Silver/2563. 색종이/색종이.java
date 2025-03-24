import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] canvas = new boolean[100][100];
        int area = 0;
        for(int i =0; i < n; i ++) {
            String[] pos = br.readLine().split(" ");
            int x = Integer.parseInt(pos[0]);
            int y = Integer.parseInt(pos[1]);
            
            for(int j =x; j < x+10; j++) {
                for(int k = y; k < y+10; k++) {
                    if(!canvas[j][k]) {
                        canvas[j][k] = true;
                        area++;
                    }
                }
            }
        }
        System.out.println(area);
    }
}