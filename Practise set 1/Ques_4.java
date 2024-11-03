//writing a java program to convert kilometeres into miters

import java.util.Scanner;

public class Ques_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Kilometere unit : ");
        int km = sc.nextInt();
        float miles = km * 0.621371f;
        System.out.print("In miles is : ");
        System.out.print(miles);
        System.out.println(" miles");
    }
    
}
