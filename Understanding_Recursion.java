public class Understanding_Recursion {

    public static void main(String[] args) {

        // Iteration: A programming technique in which you describe actions
        // to be repeated using a loop
//        for( int i = 1; i < 10; i++){
//            System.out.println("hello");
//        }

        SayHello(5);
    }

    // Recursion: A programming technique in which you describe actions
    // to be repeated using a method that calls itself.
    public static void SayHello(int n){
        if( n == 0){
            System.out.println();
        }else {
            System.out.println("hello");
            SayHello(n-1);
        }
    }
}
