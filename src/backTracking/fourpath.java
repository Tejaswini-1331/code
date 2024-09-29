package backTracking;


public class fourpath {
    public static void main(String[] args) {
        int rows = 3;
        int col= 3;
        boolean [][] isVisisted = new boolean [rows][col];
        maze(0,0,rows-1,col-1,"",isVisisted);
    }

    private static void maze(int sr, int sc, int er, int ec, String s, boolean [][] isVisited) {
        if(sr<0 || sc<0) return;
        if(sc>ec || sr>er) return;
        if(isVisited[sr][sc]==true) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc]=true;
        //up

        //down
        maze(sr,sc+1,er,ec,s+"R",isVisited);
        maze(sr+1,sc,er,ec,s+"D",isVisited);
        //right

        //left
        maze(sr,sc-1,er,ec,s+"L",isVisited);
        maze(sr-1,sc,er,ec,s+"U",isVisited);

        isVisited[sr][sc]= false;
    }
}
