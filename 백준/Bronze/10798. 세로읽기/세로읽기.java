import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int row = 5;
        int column = 15;
        char[][] ch = new char[row][column];
        for(int i=0; i<row; i++){
            String str = br.readLine();
            for(int j =0; j<str.length(); j++){
                ch[i][j] = str.charAt(j);
            }
        }
        for(int i=0; i<column; i++){
            for(int j =0; j<row; j++) {
                if(ch[j][i] != '\0') {
                   System.out.print(ch[j][i]);
                   }
            }
        }
    }
}