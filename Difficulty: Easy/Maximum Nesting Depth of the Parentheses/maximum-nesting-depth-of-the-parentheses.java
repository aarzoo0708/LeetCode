class Solution {
    public static int maxDepth(String s) {
        // code here
        Stack<Character> stack = new Stack<>();
        int result = 0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            }
            else if(s.charAt(i) == ')'){
                stack.pop();
            }
            
            result = Math.max(result, (int)stack.size());
        }
        return result;
    }
}
