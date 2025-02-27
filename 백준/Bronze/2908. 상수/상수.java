import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] word = str.split(" ");
        int num1 = Integer.parseInt(new StringBuilder(word[0]).reverse().toString());
        int num2 = Integer.parseInt(new StringBuilder(word[1]).reverse().toString());
        
        System.out.println(Math.max(num1,num2));
    }
}