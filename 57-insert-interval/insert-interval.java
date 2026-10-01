class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]>result = new ArrayList<>();
        boolean inserted = false;
        for(int i=0; i<intervals.length; i++){

            if(intervals[i][1] < newInterval[0]){
                result.add(intervals[i]);
            }
            else if(intervals[i][0] <= newInterval[1]){
                newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
                newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            }
            else{
                result.add(newInterval);
                inserted = true;
                for(int j=i; j<intervals.length; j++){
                    result.add(intervals[j]);
                }
                break;
            }

        }
        if(!inserted){
            result.add(newInterval);
        }
        return result.toArray(new int[result.size()][]);
    }
}