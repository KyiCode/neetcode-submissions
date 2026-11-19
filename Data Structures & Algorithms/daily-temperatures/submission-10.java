class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int count = 0;
        Stack<int[]> stack = new Stack<>();
        int[] result = new int[temperatures.length];


        for (int i = temperatures.length - 1; i >= 0; i--) {

            int curr = temperatures[i];

            while (true) {
                if (stack.isEmpty() || stack.peek()[0] > curr) {
                    break;
                }
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = 0;
                
            } else {
                int[] node = stack.peek();
                result[i] = count - node[1];
            }
            stack.push(new int[]{curr, count++});
        }

        return result;
    }
}
