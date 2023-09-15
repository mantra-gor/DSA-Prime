package week4.backtracking;

import java.util.ArrayList;

public class RatInAMazeProblem {
    public static void main(String[] args) {
        int[][] mat = {
//              Critical Test Case
                {0, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        int n = mat.length;

        System.out.println(findPath(mat, n));
    }

    public static ArrayList<String> findPath(int[][] arr, int n) {
        int i = 0, j = 0;

        boolean[][] visitedCheck = new boolean[n][n];
        visitedCheck[0][0] = true;

        ArrayList<String> answer = new ArrayList<>();

        if (arr[i][j] == 0){
            return answer;
        }

        ratInAMaze(i, j, n, arr, visitedCheck, "", answer);

        return answer;
    }

    static boolean isValid(int i, int j, int n, int[][] arr, boolean[][] visitedCheck) {
        if (i < n && i >= 0 && j < n && j >= 0 && arr[i][j] == 1 && !visitedCheck[i][j]) {
            return true;
        }
        return false;
    }

    static void ratInAMaze(int i, int j, int n, int[][] arr, boolean[][] visitedCheck, String path, ArrayList<String> answer) {
        if (i == n - 1 && j == n - 1) {
            answer.add(path);
            return;
        }

        // D
        if (isValid(i + 1, j, n, arr, visitedCheck)) {
            visitedCheck[i + 1][j] = true;
            ratInAMaze(i + 1, j, n, arr, visitedCheck, path + 'D', answer);
            visitedCheck[i + 1][j] = false;
        }

        // L
        if (isValid(i, j - 1, n, arr, visitedCheck)) {
            visitedCheck[i][j - 1] = true;
            ratInAMaze(i, j - 1, n, arr, visitedCheck, path + 'L', answer);
            visitedCheck[i][j - 1] = false;
        }

        // R
        if (isValid(i, j + 1, n, arr, visitedCheck)) {
            visitedCheck[i][j + 1] = true;
            ratInAMaze(i, j + 1, n, arr, visitedCheck, path + 'R', answer);
            visitedCheck[i][j + 1] = false;
        }

        // U
        if (isValid(i - 1, j, n, arr, visitedCheck)) {
            visitedCheck[i - 1][j] = true;
            ratInAMaze(i - 1, j, n, arr, visitedCheck, path + 'U', answer);
            visitedCheck[i - 1][j] = false;
        }
    }
}