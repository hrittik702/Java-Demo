import java.util.Scanner;

public class Ques_2 {
    public static void main(String[] args) {
        System.out.print("Enter your grade : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("The Encrypted grade is is ");
        int y = a + 8;
        System.out.println(y);
        int x = y - 8;
        System.out.print("With Decrypt your grade is ");
        System.out.println(x);

    }
}
