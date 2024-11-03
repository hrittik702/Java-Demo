import java.util.Scanner;
public class Ques_t {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int x = sc.nextInt();
        //operations
        int a = 7*49/x+35/x;
        System.out.print("The value of 7*49/x+35/x is : ");
        System.out.println(a);
    }
}
