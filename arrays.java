public class arrays {
    public static void main(String[] args) {
        // arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value
        // int[] myarr = {10,2,4,65,46,24};
        // if an array is initialized with some size it won't get modify(increase or decrease) during runtime

        // an array is an object containing a fixed number of values of the same type
        // the elements of an array are indexed, which means we can access them with number called indices.
        // there are primitive type arrays and object type arrays. this means we can use arrays of int, float, boolean, ... but also the arrays of String, Object and custom type as well

        // Declaration:
        // int[] an_array;
        // int an_array[];

        // Initialization:
        // int[] an_array = new int[10]; int[]: declare an array of integer type
        //                               an_array: name of the array.
        //                               new int[10]: create a new array of integer with a size of 10 element
        // int[] an_array = new int[] {1,2,3,4,5}
        //                               new int[] {1,2,3,4,5}: create an array that contains the integer with specific values int 1,2,3,4,5

        // Accessing Elements:
        // anArray[0] = 10; means on 0th index in an array we store value 10
        // sout(anArray[0]); means print value at 0th index of variable name anArray.

        //Iterating Over an Array:
        // accessing elements one by one can be useful, but we might want to iterate through an array
        // int[] anArray = new int[] {1,2,3,4,5};
        // iterating and printing all element in an array
        // for (int i=0; i<anArray.length; i++){
        // sout(anArray[i])
        // }

        // For Each Loop
        // its possible to use other loop mechanisms such as while or do while. but, as for java collections, its possible to loop over arrays using the foreach loop
        // int[] anArray = new int[] {1,2,3,4,5};
        // for(int element : anArray){
        // sout(element);
        // }

        // the foreach loop is an option when:
        // we don't need to modify an array (putting another value in an element won't modify the element in the array)
        // we don't need the indices to do something else
    }
}
