package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.Graph;

/**
 * @author Geonguk Han
 * @since 2020-08-25
 */
public class A05_WordSearch {
    public static void main(String[] args) {
        char[][] grid = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCEED";

        System.out.println(solve(grid, word));
    }


    int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    private static boolean solve(char[][] grid, String word) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return false;
        }
        int m = 0;
        int n = 0;
        m = grid.length;
        n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                boolean result = dfs(grid, visited, i, j, 0);
                if (result) {
                    return true;
                }
            }

        }

        return false;
    }

    private static boolean dfs(char[][] grid, boolean[][] visited, int i, int j, int result) {
        return false;
    }
}
