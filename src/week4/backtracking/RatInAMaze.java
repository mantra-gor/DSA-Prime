package week4.backtracking;

public class RatInAMaze {
    public static void main(String[] args) {
        int[][] mat = {
                {1,1,1,0},
                {1,0,0,1},
                {1,1,0,0},
                {1,1,1,1}
        };
        int n = mat.length,
                m = mat[0].length,
                i=0,
                j = 0;

        boolean[][] visitedCheck = new boolean[n][m];
        visitedCheck[0][0] = true;
        String path = "";

        ratInAMaze(i,j,n,m,mat,visitedCheck,path);

    }

    static boolean isValid(int i, int j, int n, int m, int[][] mat, boolean[][] visitedCheck){
        if (i<n && i>=0 && j<m && j>=0 && mat[i][j] == 1 && !visitedCheck[i][j]){
            return true;
        }
        return false;
    }

    static void ratInAMaze(int i, int j, int n, int m, int[][] mat, boolean[][] visitedCheck, String path){
//        System.out.println("visited rat in a maze method");
        if (i == n-1 && j == m-1){
            System.out.println(path);
            return;
        }

        // D
        if (isValid(i+1,j,n,m,mat,visitedCheck)){
            visitedCheck[i+1][j] = true;
            ratInAMaze(i+1,j,n,m,mat,visitedCheck,path+'D');
            visitedCheck[i+1][j] = false;
        }

        // L
        if (isValid(i,j-1,n,m,mat,visitedCheck)){
            visitedCheck[i][j-1] = true;
            ratInAMaze(i,j-1,n,m,mat,visitedCheck,path+'L');
            visitedCheck[i][j-1] = false;
        }

        // R
        if (isValid(i,j+1,n,m,mat,visitedCheck)){
            visitedCheck[i][j+1] = true;
            ratInAMaze(i,j+1,n,m,mat,visitedCheck,path+'R');
            visitedCheck[i][j+1] = false;
        }

        // U
        if (isValid(i-1,j,n,m,mat,visitedCheck)){
            visitedCheck[i-1][j] = true;
            ratInAMaze(i-1,j,n,m,mat,visitedCheck,path+'U');
            visitedCheck[i-1][j] = false;
        }
    }
}
