public class exercise_9 {
    public static void main(String[] args) {
        // write code to insert an element in an array
        // size of an array cant be modified during runtime, so we have to overlap new value over the old one

        int[] arr = {24,36,90,68,10};
        int insertElem = 2;
        for(int i = arr.length-1; i >=insertElem; i--){
            arr[i] = arr[i-1];
        }

        arr[insertElem] = 50;
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
