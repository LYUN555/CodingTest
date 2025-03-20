import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        
        int[][] a = new int[n][m];
        for(int i = 0; i< n; i++){
            String[] row = br.readLine().split(" ");
            for(int j = 0; j<m; j++) {
                a[i][j] = Integer.parseInt(row[j]);
            }
        }
        int[][] b = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                b[i][j] = Integer.parseInt(row[j]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((a[i][j] + b[i][j]) + " ");
            }
            System.out.println();
        }
    }
}