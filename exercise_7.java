import java.util.Scanner;

public class exercise_7 {
    public static void main(String[] args) {
        // write a code that allows user to enter 10 numbers and return their average.

        System.out.println("Enter 10 numbers :");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        float avg = 0;
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        avg = (float) sum / arr.length;
        System.out.println(arr.length);
        System.out.println(sum);
        System.out.println(avg);
    }
}
