class Solution {
    public int getMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<26; i++){
            if(arr[i]!=0){
            min = Math.min(min, arr[i]);
            }
        }
        return min;
    }

    public int getMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<26; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public int beautySum(String s) {
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            int[] arr = new int[26];
            for(int j=i; j<s.length(); j++){
                arr[s.charAt(j) - 'a']++;
                int beauty = getMax(arr) - getMin(arr);
                sum += beauty;
            }
        }
        return sum;
    }
}