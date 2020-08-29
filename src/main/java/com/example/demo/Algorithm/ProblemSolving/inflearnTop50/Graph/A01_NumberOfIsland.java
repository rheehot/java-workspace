package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.Graph;

/**
 * @author Andrew
 * @since 2020-08-25
 */
public class A01_NumberOfIsland {

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        System.out.println(slove(grid));
    }

    private static int slove(char[][] grid) {

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        print(grid);
        return count;
    }

    private static void print(char[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);
            }

            System.out.println("");

        }

    }

    private static void dfs(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;


        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] != '1') {
            // 종료 조건
            return;
        } else {
            // 다시 탐색
            grid[i][j] = 'X';
            dfs(grid, i - 1, j);
            dfs(grid, i + 1, j);
            dfs(grid, i, j - 1);
            dfs(grid, i, j + 1);
        }
    }
}
