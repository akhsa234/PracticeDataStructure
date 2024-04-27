package stack;

import java.util.Stack;

public class StringReverse {
    public String reverse(String input){

        Stack<Character> stack =new Stack<>();
        for(int i=0; i<input.length(); i++) { //version1 faster than foreach 2-3 second
            stack.push(input.charAt(i));
        }

//        for (char ch : input.toCharArray()) {
//            stack.push(ch);
//        }
     //   String reversed= ""; // version 1
        StringBuffer reversed = new StringBuffer();
        while(!stack.empty()){
           // reversed += stack.pop(); //it is costly.
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
