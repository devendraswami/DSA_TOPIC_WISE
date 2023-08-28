import java.util.*; 

public class StackImplementation {
    public static void main(String[] args) {
        
        Stack<Integer> stack1 = new Stack<>();
      // push() is used to add items to the stack 

        stack1.push(1); 
        stack1.push(2);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);

        System.out.println(stack1); 
        
        // pop method is used to delete the topMost element in the stack 

        stack1.pop(); 

        System.out.println(stack1); 

        // peek() is used  to fetch the top most value

        System.out.println("The Top Most value in the Stack is : " + stack1.peek()); 

        // Search() method will return the position of the of the element(It will count the position from the upside ) if the element is not present in the stack then it will return -1

        System.out.println("the position of 1 in the stack is "  + stack1.search(1));

        // empty() results in boolean value if the stack is empty then it will retun false otherwise false 
        System.out.println(stack1.empty());

    }
}