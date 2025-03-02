import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        char[] abc = new char[str.length()];
        for(int i = 0; i < str.length(); i++) {
            abc[i] = str.charAt(i);
        }
        
        int sum = 0;
        for(char result : abc) {
            sum += getNum(result);
        }
        System.out.println(sum);
    }
    static int getNum(char a) {
            if(a < 'A'){
                return 2;
            } else if(a <= 'C') {
                return 3;
            } else if(a <= 'F') {
                return 4;
            } else if(a <= 'I') {
                return 5;
            } else if(a <= 'L') {
                return 6;
            } else if(a <= 'O') {
                return 7;
            } else if(a <= 'S') {
                return 8;
            } else if(a <= 'V') {
                return 9;
            } else if(a <= 'Z') {
                return 10;
            } else {
                return 0;
            }
        }
}