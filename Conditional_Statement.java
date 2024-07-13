public class Conditional_Statement {
    public static void main(String[] args) {
        int i = 5;
        // when there are more than two condition use else-if statement
        if(i>5){
            System.out.println("code 1");
        } else if (i<5) {
            System.out.println("code2");
        } else if (i==5) {
            System.out.println("code 3");
        }

        int j = 6;
        // else statement wont require condition, its just negation of if statement
        if(j>5){
            System.out.println("code 4");
        }
        else {
            System.out.println("code 5");
        }
    }
}
