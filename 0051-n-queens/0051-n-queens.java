class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> results = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        boolean[] blockedCols = new boolean[n];
        boolean[] blockedDiag1 = new boolean[2 * n];
        boolean[] blockedDiag2 = new boolean[2 * n];
        search(0, n, board, results, blockedCols, blockedDiag1, blockedDiag2);
        
        return results;
    }
    
    private void search(int row, int n, char[][] board, List<List<String>> results, boolean[] blockedCols, boolean[] blockedDiag1, boolean[] blockedDiag2) {
        if (row == n) {
            results.add(buildBoard(board));
            return;
        }
        for (int col = 0; col < n; col++) {
            int diag1Key = row - col + n;
            int diag2Key = row + col;
            if (blockedCols[col] || blockedDiag1[diag1Key] || blockedDiag2[diag2Key]) {
                continue;
            }
            board[row][col] = 'Q';
            blockedCols[col] = true;
            blockedDiag1[diag1Key] = true;
            blockedDiag2[diag2Key] = true;
            search(row + 1, n, board, results, blockedCols, blockedDiag1, blockedDiag2);
            board[row][col] = '.';
            blockedCols[col] = false;
            blockedDiag1[diag1Key] = false;
            blockedDiag2[diag2Key] = false;
        }
    }
    private List<String> buildBoard(char[][] board) {
        List<String> layout = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            layout.add(new String(board[i]));
        }
        return layout;
    }
}
