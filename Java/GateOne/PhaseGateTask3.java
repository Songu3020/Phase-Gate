import java.util.Scanner;

    public class PhaseGateTask3 {

    public static void main(String[]args){
        

    Scanner input = new Scanner(System.in);
    int sum = 0;
    int number = 0;
    int secondNumber = 0;
    System.out.print("Enter a number: ");
    number = input.nextInt();

    System.out.print("Enter secondNumber: ");
    secondNumber = input.nextInt();

    sum = number + secondNumber;
    System.out.print(sum);
    }
}

