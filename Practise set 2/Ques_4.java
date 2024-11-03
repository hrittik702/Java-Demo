import java.util.Scanner;

public class Ques_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Initial Velocity : ");
        int u = sc.nextInt();
        System.out.print("Enter Accelaration of the Body : ");
        int a = sc.nextInt();
        System.out.print("Enter Time taken  : ");
        int t = sc.nextInt();
        System.out.print("Displacement travlled by body is : ");
        int s = (u*t) + ((a*t*t)/2);
        System.out.println(s);
        System.out.print("The Final Velocity is : ");
        int v = u + (a*t);
        System.out.println(v);
        //doing operations and storing it in a variable
        System.out.println("Answer is always 1 😊 : ");
        int x = ((v+u)*(v-u))/(2*a*s);
        System.out.println(x);
    }
}
