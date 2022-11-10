import java.util.Scanner;

public class as7 {
    public static void main(String[] args) {
        double num1,num2,num3;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter first number:");
        number1= in.nextDouble();
        System.out.println("Enter second number:");
        number2= in.nextDouble();
        System.out.println("Enter third number");
        number3= in.nextDouble();
if ((number1>number2)&&(number2>number3))
        {
            System.out.println("Decreasing");
        } else if ((number1<number2)&&(number2<number3)) {
    System.out.println("Increasing");

}
    }
}
