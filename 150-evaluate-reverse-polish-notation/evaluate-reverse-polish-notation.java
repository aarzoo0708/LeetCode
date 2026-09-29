class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<tokens.length; i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                String operator = tokens[i];
                int b = stack.pop();
                int a = stack.pop();
                int res;
                if(operator.equals("+")){
                    res = a+b;
                }
                else if(operator.equals("-")){
                    res = a-b;
                }
                else if(operator.equals("*")){
                    res = a*b;
                }
                else{
                    res = a/b;
                }
                stack.push(res);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }

        }
        return stack.pop();
    }
}