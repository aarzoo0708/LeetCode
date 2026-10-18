class Solution {
    public int longestConsecutive(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int n: arr){
            set.add(n);
        }
        
        int longest = 0;
        for(int n: set){
            if(!set.contains(n-1)){
                int current = n;
                int length = 1;
                
                while(set.contains(current+1)){
                    current++;
                    length++;
                }
                
                longest = Math.max(longest, length);
            }
        }
        
        return longest;
    }
}