//WAP to add percentage of a cbse student his marks from 5 subject

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st subject marks : ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd subject marks : ");
        int b = sc.nextInt();
        System.out.print("Enter the 3rd subject marks : ");
        int c = sc.nextInt();
        System.out.print("Enter the 4th subject marks : ");
        int d = sc.nextInt();
        System.out.print("Enter the 5th subject marks : ");
        int e = sc.nextInt();
        int sum = a + b + c + d + e;
        float per = sum/5f;
        System.out.print("The Percentage is : ");
        System.out.print(per);
        System.out.println(" %");

    }
}