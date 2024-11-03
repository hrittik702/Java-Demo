//WAP to detect whetehr a number entered by the user is integer or not
import java.util.Scanner;
public class Ques_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        boolean b = sc.hasNextInt();
        System.out.print("The Entered Number is Integer if True, otherwise non integer :  ");
        System.out.println(b);
    }
    
}
