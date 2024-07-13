import java.util.Scanner;

public class exercise_5 {
    public static void main(String[] args) {
        // Write a code to display prime numbers from 1 to n by user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        int n = sc.nextInt();
        String prime = "";

        for (int i = 2; i <= n; i++) { // Start from 2, as 1 is not a prime number
            int counter = 0;
            for (int num = 1; num <= i; num++) {
                if (i % num == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                prime = prime + i + " ";
            }
        }

        System.out.println("Prime numbers from 1 to " + n + ": " + prime);
    }
}
