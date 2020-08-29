package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.Graph;

/**
 * @author Geonguk Han
 * @since 2020-08-25
 */
public class A03_MaxOfIsland {

    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 0, 1, 1},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 0, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1}
        };

        System.out.println(solve(grid));
    }

    private static int solve(int[][] grid) {

        if (grid == null || grid.length == 0) return 0;

        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    // 계속 탐색 1인경우에
                    int result = dfs(grid, i, j, 0);
                    max = Math.max(result, max);
                }
            }
        }

        return max;
    }

    private static int dfs(int[][] grid, int i, int j, int result) {
        int m = grid.length;
        int n = grid[0].length;

        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0) return result;

        grid[i][j] = 0;
        result++;

        int tempMax = 0;
        tempMax = Math.max(tempMax, dfs(grid, i - 1, j, result));
        tempMax = Math.max(tempMax, dfs(grid, i + 1, j, result));
        tempMax = Math.max(tempMax, dfs(grid, i, j - 1, result));
        tempMax = Math.max(tempMax, dfs(grid, i, j + 1, result));

        return Math.max(tempMax, result);
    }
}
