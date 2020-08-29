package com.example.demo.Algorithm.algorithmn;

/**
 * @author Andrew
 * @since 2020-08-25
 */
public class TestApp2 {

    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 3, 4, 5},
                {5, 4, 2, 3, 1},
                {1, 2, 3}
        };

        print(grid);
    }

    private static void print(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);

            }
            System.out.println("");
        }
    }
}
