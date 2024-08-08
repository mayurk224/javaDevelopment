public class Recursion_Example {

    // Calculate integer exponential
    public static int calculatePower(int x , int y){
        if(y == 0){
            return 1;
        }else {
            return x * calculatePower(x, y-1);
        }
    }

    public static void main(String[] args) {
        int res = calculatePower(2,3);
        System.out.println(res);
    }
}
