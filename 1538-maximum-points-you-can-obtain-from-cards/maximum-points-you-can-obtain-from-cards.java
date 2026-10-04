class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max = 0;
        int total = 0;
        for(int i: cardPoints){
            total += i;
        }

        int windowSize = cardPoints.length - k;
        int sum = 0;
        for(int i=0; i<windowSize; i++){
            sum += cardPoints[i];
        }

        int minWindow = sum;

        for(int i=windowSize; i<cardPoints.length; i++){
            sum += cardPoints[i];
            sum -= cardPoints[i-windowSize];
            minWindow = Math.min(sum, minWindow);
        }

        return total - minWindow;
    }
}