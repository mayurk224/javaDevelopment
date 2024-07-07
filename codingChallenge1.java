import java.util.Scanner;

public class codingChallenge1 {
    public static void main(String[] args) {
        // calculate body mass index by getting weight and height as input from keyboard
        // bmi = weight / (height * height)
        Scanner sc = new Scanner(System.in);
        float w = sc.nextFloat();
        float h = sc.nextFloat();

        float bmi =  w /(h*h);
        System.out.println(bmi);
    }
}
