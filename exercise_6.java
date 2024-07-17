import java.util.Scanner;

public class exercise_6 {
    public static void main(String[] args) {
        // write code that allows the user to ender 10 numbers and gives their sum

        System.out.println("Please enter 10 values :");
        Scanner sc = new Scanner(System.in);
        // creating an array of size 10 of int values only
        int[] myarr = new int[10];
        // taking input from user and inserting in an array using indices using for loop
        for(int i = 0 ; i < myarr.length ; i++){
            myarr[i] = sc.nextInt();
        }
        // creating a sum variable and initialize it with 0
        int sum = 0;
        // getting each element from myarray using forEach loop and adding them each
        for (int i : myarr){
            sum += i;
        }
        // printing the final value of a sum
        System.out.println(sum);
    }
}
