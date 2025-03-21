import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] a = new int[9][9];
        int max = -1;
        int maxRow = 1;
        int maxColumn = 1;
        for(int i =0; i<9; i++){
            String[] row = br.readLine().split(" ");
            for(int j =0; j<9; j++) {
                a[i][j] = Integer.parseInt(row[j]);
                if(a[i][j] > max){
                    max = a[i][j];
                    maxRow = i+1;
                    maxColumn = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(maxRow+" "+maxColumn);
    }
}