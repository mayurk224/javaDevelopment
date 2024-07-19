public class exercise_12 {
    public static void main(String[] args) {
        // write a code to find the duplicate value in an array
        // Logic: loop through our array and iterate it with array length,
        // use another loop as nested & iterate it from i+1 till array
        // length, then compare the value if match then print

        int[] arr = {1,2,3,4,5,6,7,7,8,9,4};
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
