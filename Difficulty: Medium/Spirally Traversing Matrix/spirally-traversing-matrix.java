class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        int sRow = 0;
        int eRow = mat.length-1;
        int sCol = 0;
        int eCol = mat[0].length - 1;
        
        while(sRow<=eRow && sCol <= eCol){
            for(int i=sCol; i<=eCol; i++){
                list.add(mat[sRow][i]);
            }
            sRow++;
            
            for(int i=sRow; i<=eRow; i++){
                list.add(mat[i][eCol]);
            }
            eCol--;
            
            if(sRow<=eRow){
                for(int i=eCol; i>=sCol; i--){
                    list.add(mat[eRow][i]);
                }
                eRow--;
            }
            
            if(sCol<=eCol){
                for(int i=eRow; i>=sRow; i--){
                    list.add(mat[i][sCol]);
                }
                sCol++;
            }
        }
        return list;
    }
}
