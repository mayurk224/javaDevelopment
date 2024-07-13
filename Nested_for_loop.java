public class Nested_for_loop {
    public static void main(String[] args) {
         for( int i = 1; i <= 5; i++){
             for( int k = 1; k <= i-1; k++){
                 System.out.print(" ");
             }
             for( int j = 5; j >= i ; j--){
                 System.out.print("*");
             }
             System.out.println();
         }

         for(int i = 1; i<=5; i++){
             for(int k=5; k>=i; k--){
                 System.out.print(" ");
             }
             for(int j = 1; j<=i-1; j++){
                 System.out.print("*");
             }
             System.out.println();
         }

         for(int i = 1; i <= 5; i++){
             for(int j = i; j <= 5; j++){
                 System.out.print("*");
             }
             System.out.println();
         }

         for(int i = 1; i<=5; i++){
             for(int j = 1; j <= i; j++){
                 System.out.print("*");
             }
             System.out.println();
         }
    }
}
