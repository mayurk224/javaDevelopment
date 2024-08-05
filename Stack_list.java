import java.util.Stack;

public class Stack_list {

    // In stack, elements are stored and accessed in Last In First Out LIFO manner.
    // That is, elements are added to the top of the stack and removed from
    // the top of the stack.

    // for adding an element in stack use .push();
    // to remove element from the top of the stack use .pop();
    // to see the top value in stack use .peek();
    // to find the size of stack use .size();

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        String[] data = {"To","be","or","not","to","be"};
        for(String str : data){
            s.push(str);
        }

        // Stack Behaviour
        System.out.println("Stack : "+s);
        System.out.println("Peek : "+s.peek());
        System.out.println("Size : "+s.size());

        // removing elements from stack
        // before removing first check the stack is empty or not
        while(!s.isEmpty()){
            System.out.print(" "+s.pop());
        }
    }
}
