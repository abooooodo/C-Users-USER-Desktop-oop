import java.util.Scanner;

public class as4 {
    public static void main(String[] args) {
        int a;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter an intger");
        a= in.nextInt();

        if (a>0)
        {
            System.out.println("positive");
        }
        if (a==0)
        {
            System.out.println("Zero");
        }
        if (a<0)
        {
            System.out.println("Negative");
        }
    }
}
