public class return_type_of_method {
    // return type of method:
    // void : not returning any thing
    // String: return only string
    // int: return int value only

    public static int GetSum(int x, int y){
        // public is access modifier
        // static is class method
        // int is the return type of the method
        return x + y;
    }
    public static void main(String[] args) {
        System.out.println(GetSum(5,6));
    }
}
