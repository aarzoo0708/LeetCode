class Solution {
    public long minHours(int[] piles,int n){
        long totalHours = 0;
        for(int j: piles){
            totalHours += (int)Math.ceil((double)j/n);
        }
        return totalHours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(int i: piles){
            if(i>max){
                max = i;
            }
        }

        int left = 1;
        int right = max;
        long total = 0;

        while(left<=right){
            int mid = (right+left)/2;
            total = minHours(piles, mid);
            if(total <= h){
                right = mid-1;
            }
            else{
                left = mid + 1;
            }
        }

        return left;
    }
}