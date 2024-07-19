public class exercise_10 {
    public static void main(String[] args) {
        // write a code that finds the max and min value in an array

        int[] arr = {15,90,3,43,5,32,80,2,0};

        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);

        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
