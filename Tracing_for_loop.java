public class Tracing_for_loop {
    public static void main(String[] args) {
        for( int i = 1; i <= 5; i++){
            System.out.println(i+" square "+(i*i));
        }
        // here int i = 1. means initialise and assign i = 1
        // then i <= 5. means assign value of i and check it is less or equal to or not.
        // then execute body.
        // as completed execution of body portion, increment the value of i and update it as i++

        // now in test case 2: int i = 2;
        // check i is less than or equal to 5 or not, if its true then go for body
        // execute body part
        // then increment value of i by 1 & update it means i++

        // now test case 3: int i = 3;
        // check i is less than or equal to 5 or not, if its true then for body
        // execute body code
        // then increment value of i by 1 & update it, i++

        // like this the above steps will keep continuing until the i<=5 will not get false

        // when i get increment and updated to i = 6;
        // then i <= 5 is get false, here the loop will exit
    }
}
