package Stack;

import java.util.ArrayDeque;
import java.util.Stack;

public class ValidParan {
    public static void main(String[] args) {
        System.out.println(isValid("({))"));
    }

    public static boolean isValid(String s) {
        char [] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        if(arr[0]==']'||arr[0]==')'||arr[0]=='}')
            return false;

        for(char element : arr){
            if(element=='('||element=='['||element=='{')
                stack.push(element);
            else{
                if(element == ')' && !stack.isEmpty() && stack.peek() == '(')
                    stack.pop();
                else if(element == ']' && !stack.isEmpty() && stack.peek() == '[')
                    stack.pop();
                else if(element == '}' && !stack.isEmpty() && stack.peek() == '{')
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
