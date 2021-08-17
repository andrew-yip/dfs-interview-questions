/*
 * 
 * We are designing a 2D game and we have a game map that we represent by an
 * integer matrix. For now, each cell can be a wall (denoted by -1) or a blank
 * space (0).
 * 
 * board = [ [0, 0, 0, -1, -1], [0, 0, -1, 0, 0], [0, -1, 0, -1, 0], [0, 0, -1,
 * 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], ]
 * 
 * The player can move 1 space at a time up, down, left, or right. The player
 * can't go through walls or land on a wall, or go through the edges of the
 * board.
 * 
 * Write a function that, given a board and a player starting position
 * (represented as a row-column pair), returns all of the possible next
 * positions for the player.
 * 
 * Sample inputs (board, starting_position) and outputs (in any order):
 * 
 * findLegalMoves(board, (1, 1)) => (0, 1), (1, 0)
 * 
 * findLegalMoves(board, (5, 3)) => (5, 2), (5, 4), (4, 3), (6, 3)
 * 
 * findLegalMoves(board, (5, 1)) => (6, 1), (4, 1), (5, 0), (5, 2)
 * 
 * findLegalMoves(board, (6, 0)) => (5, 0), (6, 1)
 * 
 * findLegalMoves(board, (6, 4)) => (5, 4), (6, 3)
 * 
 * findLegalMoves(board, (0, 0)) => (0, 1), (1, 0)
 * 
 * findLegalMoves(board, (2, 2)) => [empty]
 * 
 * n: width of the input board m: height of the input board
 * 
 * 
 */

public class dfs {
    public static void main(String[] args) {

        int[][] board = new int[][] { { 0, 0, 0, -1, -1 }, { 0, 0, -1, 0, 0 }, { 0, -1, 0, -1, 0 }, { 0, 0, -1, 0, 0 },
                { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, };

        // starting board positions
        int[] start1 = new int[] { 1, 1 };
        /*
         * int[] start2 = new int[] { 5, 3 }; int[] start3 = new int[] { 5, 1 }; int[]
         * start4 = new int[] { 6, 0 }; int[] start5 = new int[] { 6, 4 }; int[] start6
         * = new int[] { 0, 0 }; int[] start7 = new int[] { 2, 2 };
         */

        findLegalMoves(board, start1[0], start1[1], start1[0], start1[1]);

    }

    public static void findLegalMoves(int[][] board, int i, int j, int originalI, int originalJ) {

    }
}