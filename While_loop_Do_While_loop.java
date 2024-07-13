public class While_loop_Do_While_loop {
    public static void main(String[] args) {
        int i = 0; // initialization
        while(i<5){ // continuation / condition
            System.out.println("*"); // body
            i++; // increment & update
        }

        System.out.println();

        int j = 15; // initialization
        do {
            System.out.println("*"); // body
            j--; // increment / decrement & update
        }while (j > 10); // continuation / condition

        // if anyhow the while condition is getting false value then it only execute do_body one time
    }
}
