import java.util.Scanner;

// write code to a sum of digits in number given by user
// ex: 27 = 2+7 = 9
// ex: 654 = 6+5+4 = 15
public class exercise_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;
        System.out.print("enter number : ");
        num = sc.nextInt();

        while(num != 0){
            sum = sum + num % 10; // it will give a remainder
            num = num/10; // it gives quotient
        }
        System.out.println(sum);
    }
}
