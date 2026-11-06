class Solution {

    Stack<Integer> stack = new Stack<>();
    int a; int b;

    public int evalRPN(String[] tokens) {
        for (String str : tokens) {
            
            switch(str) {

                case "+":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a + b);
                    break;

                case "-":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b - a);
                    break;
                case "*":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a * b);
                    break;

                case "/":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b / a);
                    break;
                default :
                    int x = Integer.parseInt(str);
                    stack.push(x);
                    break;
            }
        }
        return stack.pop();
    }
}
