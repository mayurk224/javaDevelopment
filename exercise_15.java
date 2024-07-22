import java.util.Scanner;

public class exercise_15 {
    public static void main(String[] args) {
        // write a code that reverses the string
        // Logic: take input and store in string,
        // use another string var to store the reverse string,
        // convert string to CharArray(),
        // then loop thought the char[] starting from last index till equal 0 goes on decrement
        // & store reverse index in reverse string var,
        // then print it

        System.out.print("Enter word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String reverseWord = "";
        char[] wordArr = word.toCharArray();
        for(int i = wordArr.length-1; i >= 0; i--){
            reverseWord += wordArr[i];
        }
        System.out.println(reverseWord);
    }
}
