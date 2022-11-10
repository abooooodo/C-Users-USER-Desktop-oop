import java.util.Scanner;

public class as6 {
    public static void main(String[] args) {
        int a,y,z;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        a= in.nextInt();
        z= in.nextInt();
        y= in.nextInt();

        if(a==z){
            if (z==y) {
                if (a==z){
                    System.out.println("All the same");
                }
            }
        }
        else {
            System.out.println("All diffrenet");
        }
    }
}
