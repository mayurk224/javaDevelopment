public class exercise_8 {
    public static void main(String[] args) {
        // write a code to remove an element from any position from an array

        int[] arr = {25, 14,35,36,99,80};
        int removeElem = 2; // removing an element by their index position
        for(int i = removeElem; i < arr.length - 1; i++){
            arr[i] = arr[i+1];
        }
        for(int i = 0; i < arr.length -1; i++){
            System.out.println(arr[i]);
        }
    }
}
