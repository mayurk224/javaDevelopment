import java.util.Scanner;

public class characters {
    public static void main(String[] args) {
        char ch = 'j';
        char u = 65; // ASCII value of 65 is A
        // 65-90 is capital letter A-Z
        //
        System.out.println(u);
        System.out.println(Character.isLetter(ch));

        Scanner sc = new Scanner(System.in);
        int m = sc.next().charAt(0);
        System.out.println(m);
    }
}
