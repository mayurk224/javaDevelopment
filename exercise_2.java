import java.util.Scanner;

// write code to compare two numbers given by user

public class exercise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("enter first number : ");
        num1 = sc.nextInt();
        System.out.print("enter second number : ");
        num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("number 1 is greater than number 2");
        }else if(num1 < num2) {
            System.out.println("number 2 is greater than number 1");
        }
        else {
            System.out.println("Given two numbers are same");
        }
    }
}
