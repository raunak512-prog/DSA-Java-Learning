package DsPrac;
import java.util.Stack;
public class ReverseStringStack {
    public static void main(String[] args) {
     String input = "HELLO";
     Stack<Character> stack = new Stack<>();
     for (int i = 0; i < input.length();i++){
         stack.push(input.charAt(i));
     }
        StringBuilder reverse = new StringBuilder();
     while (!stack.isEmpty()){
         reverse.append(stack.pop());
     }
        System.out.println("Reversed String: " + reverse);
    }
}
