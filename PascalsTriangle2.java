class Solution {
    // Time LIMIT EXCEEDED FOR THIS SOLUTION
    private int getNum(int row, int col){
        // If element in row 0, If element in first column, if element in last column
        if( row ==0 || col ==0 || row == col) return 1;

        // Pascal's standard formula in code :
        // func(row -1, col -1) + func(row - 1, col);
        // For sum that is present at index(row, col)
        return getNum(row - 1, col -1) + getNum(row - 1, col);
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> toRet = new ArrayList<>();

        for (int i =0; i <= rowIndex; i++){
            toRet.add(getNum(rowIndex, i));
        }

        return toRet;
        
    }
}