//wap to print sum of three number

import java.util.Scanner;

public class Ques_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the numbers you want sum : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.print("The sum of above numbers is : ");
        System.out.println(sum);
    }
}
