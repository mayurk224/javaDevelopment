public class exercise_17 {

    // Fibonacci Series using Recursion

    public static double fibSeries(int x){
        if(x <= 1 ){
            return x;
        }
        else {
            return fibSeries(x-1) + fibSeries(x-2);
        }
    }

    public static void main(String[] args) {
        double res = fibSeries(5);
        System.out.println(res);
    }
}
