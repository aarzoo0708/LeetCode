class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            int index = num - 1;

            if (nums[index] < 0) {
                result.add(num);
            } else {
                nums[index] = -nums[index];
            }
        }

        return result;
    }
}

// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         List<Integer> result = new ArrayList<>();
//         HashMap<Integer,Integer> freq = new HashMap<>();

//         for(int n: nums){
//             freq.put(n, freq.getOrDefault(n, 0) + 1);
//         }

//         for(int i: freq.keySet()){
//             if(freq.get(i) >1){
//                 result.add(i);
//             }
//         }
//         return result;
//     }
// }