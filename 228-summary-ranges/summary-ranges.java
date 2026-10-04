class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int start = 0;
        for(int i=0; i<nums.length;){
            while(i<nums.length-1 && nums[i+1] == nums[i] + 1){
                i++;
            }
            if(start==i){
                res.add(String.valueOf(nums[start]));
            }
            else{
                res.add(String.valueOf(nums[start]) + "->" + String.valueOf(nums[i]));
            }
            i++;
            start = i;
        }
        return res;
    }
}