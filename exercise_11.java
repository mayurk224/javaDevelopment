public class exercise_11 {
    public static void main(String[] args) {
        // write a code to reverse an array
        // Logic: divide an array in half, use a variable to replace & store the value, then switch element by arr[arr.length-i-1]

        int[] arr = {1,2,3,4,5,6,7,8,9};
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        for (int j : arr) {
            System.out.print(j);
        }
    }
}
