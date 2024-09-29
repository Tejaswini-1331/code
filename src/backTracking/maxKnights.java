package backTracking;

public class maxKnights {
    static int number=0;
    public static boolean isSafe(char [][]board, int row, int col){
        int n = board.length;
        int i,j;
        // up right
        i = row-2; j = col+1;
        if(i>=0 && j<n && board[i][j]=='K') return false;

        // up left (if + then check for 'n' else check for =0
        i = row-2; j = col-1;
        if(i>=0 && j>=0 && board[i][j]=='K') return false;

         // left up and down
        i = row-1; j= col-2;
        if(i>=0 && j>=0 && board[i][j]=='K') return false;

        i=row+1; j= col-2;
        if(i<n && j>=0 && board[i][j]=='K') return false;

        // down right and left
        i=row+2; j =col+1;
        if(i<n && j<n && board[i][j]=='K') return false;

        i=row+2; j =col-1;
        if(i<n && j>=0 && board[i][j]=='K') return false;

        //right up n down
        i=row-1; j= col+2;
        if(i>=0 && j<n && board[i][j]=='K') return false;

        i=row+1; j=col+2;
        if(i<n && j<n && board[i][j]=='K') return false;

        return true;
    }
    public static void place(char [][]board, int row, int col,int num){
        int n = board.length;
        if(row==n){
          // number =1;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(board[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();
                return;

        }
        else if(isSafe(board,row,col)){
            board[row][col] ='K';
            if(col<n-1) place(board,row,col+1,num+1);
            else place(board,row+1,0,num+1);
            if(number==1) return;
            board[row][col] ='x';
        }
        if(col<n-1) place(board,row,col+1,num);
        else place(board,row+1,0,num);

    }
    public static void main(String[] args) {
       int n =3;
       char [][] board = new char [n][n];
       for(int i=0; i<n; i++){
           for(int j =0; j<n; j++){
              board[i][j]= 'x';
           }
       }

       place(board,0,0,0);

//        for(int i=0; i<n; i++){
//            for(int j =0; j<n; j++){
//                System.out.print(board[i][j]);
//            }
//            System.out.println();
//        }
    }
}
