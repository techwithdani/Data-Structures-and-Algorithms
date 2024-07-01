import java.util.Stack;
public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(4);
        stack.push(7);
        stack.push(9);
        stack.push(10);

        int size = stack.size();

        for(int i = 1; i <= size; i++) {
            System.out.println(stack.pop());
        }
        
    }
}