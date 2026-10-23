import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Maths Operations\n\n");

        System.out.println("1.Arithmetic Operation\n2.Percentage Calculation\n3.Floor Function & Celling Function\n4.Max & Min Number\n");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                Arithmetic arithmetic = new Arithmetic();
                System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n");
                choice = scan.nextInt();
                switch(choice){
                    case 1:
                        arithmetic.addition();
                        break;
                    case 2:
                        arithmetic.substraction();
                        break;
                    case 3:
                        arithmetic.multiplication();
                        break;
                    case 4:
                        arithmetic.division();
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
                break;
            case 2:
                 new Pr().percent();
                 break;
            case 3:
                Function function = new Function();
                    function.floor();
                    function.celling();
                 break;
            case 4:
                MaxMin maxMin = new MaxMin();
                maxMin.findMax();
                maxMin.findMin();
            default:
                System.out.println("Invalid choice");
                break;
        }

        scan.close();
    }
}