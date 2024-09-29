package backTracking;

public class deadMaze {
    public static void main(String[] args) {
        int rows = 3;
        int col = 4;
      int [][] maze ={{1,0,1,1},
                      {1,1,1,1},
                      {1,1,0,1},
                     };
      maze(0,0,rows-1,col-1,"",maze);
    }

    private static void maze(int sr, int sc, int er, int ec, String s, int[][] maze) {
        if(sr<0 || sc<0) return;
        if(sr>er|| sc>ec) return;

        if(sc==ec && sr==er){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return;
        if(maze[sr][sc]==2) return;


         maze[sr][sc]=2;
        maze(sr,sc+1,er,ec,s+"R",maze);
        maze(sr+1,sc,er,ec,s+"D",maze);
       maze(sr,sc-1,er,ec,s+"L",maze);
        maze(sr-1,sc,er,ec,s+"U",maze);

        maze[sr][sc]=1;
    }
}
