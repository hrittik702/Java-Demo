//wap to calculate percentage of three subjects out of 100
import java.util.Scanner;
public class Ques_2 {
    public static void main(String[] args) {
        System.out.println("Enter the numbers of 3 subjects : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        float per = sum/3f;
        System.out.print("The percetage is : ");
        System.out.println(per);
    }
    
}
