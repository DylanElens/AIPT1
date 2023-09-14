package NRow.Players;

import NRow.Board;

public class Node {
    private int score;
    private Node parent;
    private Node[] children;
    private Board board;


    public Node(Board board) {
        this.board = board;
    }

    public int getScore() {
        return score;
    }

    public Node getParent() {
        return parent;
    }

    public Node[] getChildren() {
        //this should look at the board and generate all possible moves
        int[][] board = this.board.getBoardState();
        int[] possibleMoves = new int[board.length];
        return children;
    }

    public boolean isTerminal() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
