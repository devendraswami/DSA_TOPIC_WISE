// time complexity: O(n) 

 
/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true */

import java.util.*;

public class validParenthesis {
    public static boolean isValid(String str){
        char[] chars = str.toCharArray();

        Stack<Character> stack1 = new Stack<>();

        for(char ele:chars){
            // 1. if the element contains open bracket, push it to the stack
            if(ele == '(' || ele == '[' || ele == '{'){
                stack1.push(ele);
                continue;
            }

            else if(stack1.empty()){
                return false;
            }

            char top = stack1.pop();
            if(top == '(' && ele != ')'){
                return false;
            }
            else if(top == '[' && ele != ']'){
                return false;
            }
            else if(top == '{' && ele != '}'){
                return false;
            }
        }
        // is the stack is empty or not
        return(stack1.empty() == true);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        System.out.println("Is the given string is valid? "+isValid(str));
        
    }
    
}