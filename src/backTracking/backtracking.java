package backTracking;

public class backtracking {
    public static void main(String[] args) {
        int rows = 4;
        int columns =6;
        int ans = maze(1,1,rows,columns);
        System.out.println(ans);
    }

    private static int maze(int sRow, int sCol, int eRow, int endCol) {
        if(sRow>eRow || sCol>endCol) return 0;
        if(sRow==eRow && sCol==endCol) return 1;
        int down = maze(sRow+1,sCol,eRow,endCol);
        int right = maze(sRow,sCol+1,eRow,endCol);
        int totalWays = down + right;
        return totalWays;
    }
}
