class Solution {
    boolean isPalindrome(String s) {
        // code here
        int left = 0;
        int right = s.length()-1;
        
        while(left<=right){
            char ch1 = s.charAt(left);
            char ch2 = s.charAt(right);
            
            if(ch1 != ch2){
                return false;
            }
            
            left++;
            right--;
        }
        return true;
    }
}