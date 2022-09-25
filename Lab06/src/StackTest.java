import javax.swing.*;


public class StackTest {
    public static void main(String[] args) throws Exception {
        String x = JOptionPane.showInputDialog(null, "Enter your expression ");
        int ch = 0;
        Student e;
        StackTest test = new StackTest();
        Object object;
        char temp = ' ';
        String expr = "([{}])";
            // Function call
            if (areBracketsBalanced(expr))
                System.out.println("Balanced ");
            else
                System.out.println("Not Balanced ");
        //ArrayStack stack = new ArrayStack();
        //LinkedStack stack = new LinkedStack();
    }
    // function to check if brackets are balanced
    static boolean areBracketsBalanced(String expr) throws Exception {
        ArrayStack stack = new ArrayStack();
        // Using ArrayDeque is faster than using Stack class
        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                // Push the element in the stack
                stack.push(x);
                continue;
            }

            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.empty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = (char) stack.pop();
                    if (check == '{' || check == '[')

                    break;

                case '}':
                    check = (char) stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = (char) stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        // Check Empty Stack
        return (stack.empty());
    }
}
