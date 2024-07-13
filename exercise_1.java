// write a java program that calculates the factorial of 10
// factorial means n! = n*(n-1)*(n-2)*(n-3)----*2*1;
// loop starts from n and gets on decreasing
// need variable to store total value
// assign old value and multiply with loop value
public class exercise_1 {
    public static void main(String[] args) {
        int result = 1;
        for( int i = 10; i >= 1; i--){
            result = result * i;
            // result = 1 * 10 = 10;
            // result = 10 * 9 = 90;
            // result = 90 * 8 = ....
            //
            // result =
        }
        System.out.println(result);
    }
}
