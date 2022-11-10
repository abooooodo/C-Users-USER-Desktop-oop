import java.util.Scanner;

public class as8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input three numbers");
        int x= in.nextInt();
        int q= in.nextInt();
        int c= in.nextInt();

        if (x<q && q<c)
        {
            System.out.println(" in order ");
        }
        else if (x>q && q>c) {
            System.out.println(" in order");

        }
        else {
            System.out.println("not in order");
        }
    }
}
