import java.util.*;

public class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalCredit = 0;
        double weightedSum = 0;
        for(int i =0; i<20; i++) {
            String[] str = sc.nextLine().split(" ");
            if(str[2].equals("P")){
                continue;
            }
            String subject = str[0];
            double credit = Double.parseDouble(str[1]);
            String grade = str[2];
            double gradeValue = 0.0;
            switch(grade){
                    case"A+":
                        gradeValue += 4.5;
                    break;
                    case"A0":
                        gradeValue += 4.0;
                    break;
                    case"B+":
                        gradeValue += 3.5;
                    break;
                    case"B0":
                        gradeValue += 3.0;
                    break;
                    case"C+":
                        gradeValue += 2.5;
                    break;
                    case"C0":
                        gradeValue += 2.0;
                    break;
                    case"D+":
                        gradeValue += 1.5;
                    break;
                    case"D0":
                        gradeValue += 1.0;
                    break;
                    case"F":
                        gradeValue += 0.0;
                    break;
            }
            totalCredit += credit;
            weightedSum += (credit * gradeValue);
        }
        
        System.out.println(weightedSum/totalCredit);
    }
}