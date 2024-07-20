public class exercise_13 {
    public static void main(String[] args) {
        // write a code that rotates the value in clockwise direction one time
        // Logic: store last value in a variable, then loop from last
        // index & goes on decrement till 0, then replace value i th
        // value from previous one & loop finish, then assign temp
        // variable to 0th index & here rotate complete

        int[] arr = {10,20,30,40,50};
        int temp = arr[arr.length-1]; // temp = 50;
        for(int i = arr.length-1; i > 0; i--){
            arr[i] = arr[i-1]; // {10,20,30,40,40}
        }
        arr[0] = temp; // {50,10,20,30,40}
        for(int j : arr){
            System.out.print(j+" ");
        }
    }
}
