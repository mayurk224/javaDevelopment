import java.util.Scanner;

public class exercise_14 {
    public static void main(String[] args) {
        // write a code that counts the letter, spaces, digit and char in
        // string inserted by user?

        // Logic: take input from user store it in string,
        // use char[] variable to store the string converted into
        // CharArray, then initialise the letter, space, digit & other
        // as int variable, then loop through string till string length,
        // then using else-if statement & Character.isDigit(chars[i]),
        // isAlphabet(chars[i]),isSpace(chars[i])

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        char[] chars = line.toCharArray();
        int letter = 0, space = 0, digit = 0, other = 0;
        for(int i = 0; i < line.length(); i++){
            if(Character.isDigit(chars[i])){
                digit++;
            } else if (Character.isAlphabetic(chars[i])) {
                letter++;
            } else if (Character.isSpace(chars[i])) {
                space++;
            } else {
                other++;
            }
        }
        System.out.println("Letters :"+letter);
        System.out.println("Spaces : "+space);
        System.out.println("Digits : "+digit);
        System.out.println("Others : "+other);
    }
}
