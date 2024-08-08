public class exercise_16 {

    // Find the factorial of the number recursively

    public static double getFactorial(int x){
        if(x == 0){
            return 1;
        }else{
            return x * getFactorial(x-1);
        }
    }

    public static void main(String[] args) {
        double res = getFactorial(5);
        System.out.println(res);
    }
}
