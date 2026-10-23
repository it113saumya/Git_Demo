import java.util.Scanner;

public class Arithmetic{
    public void addition(){
        System.out.println("Enter two numbers");
        int num1 = new Scanner(System.in).nextInt();
        int num2 = new Scanner(System.in).nextInt();

        num1 = num1 + num2;

        System.out.println("Addition: " + num1);
    }

    public void substraction(){
        System.out.println("Enter two numbers");
        int num1 = new Scanner(System.in).nextInt();
        int num2 = new Scanner(System.in).nextInt();

        num1 = num1 - num2;

        System.out.println("Substraction: " + num1);
    }

    public void multiplication(){
        System.out.println("Enter two numbers");
        int num1 = new Scanner(System.in).nextInt();
        int num2 = new Scanner(System.in).nextInt();

        num1 = num1 * num2;

        System.out.println("Multiplication: " + num1);
    }

    public void division (){
        System.out.println("Enter two numbers");
        int num1 = new Scanner(System.in).nextInt();
        int num2 = new Scanner(System.in).nextInt();
        try{
            if(num2==0) throw new RuntimeException();
            num1 = num1 / num2;
        } catch (Exception e) {
            System.out.println("Divide Error...!");
        }

        System.out.println("Division: " + num1);
    }

}