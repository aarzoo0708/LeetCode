class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        // for(int i=0; i<trips.length-1; i++){
        //     int noOfPas = trips[i][0] + trips[i+1][0];
        //     if(trips[i][2] > trips[i+1][1] && noOfPas > capacity){
        //         return false;
        //     }
        // }
        // return true;

        int[] diff = new int[1001];

        for(int[] trip : trips){
            int pass = trip[0];
            int from = trip[1];
            int to = trip[2];

            diff[from] += pass;
            diff[to] -= pass;
        }

        int currPass = 0;

        for(int c: diff){
            currPass += c;
            if(currPass > capacity){
                return false;
            }
        }

        return true;
    }
}