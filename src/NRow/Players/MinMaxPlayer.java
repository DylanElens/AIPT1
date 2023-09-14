package NRow.Players;

import NRow.Board;
import NRow.Heuristics.Heuristic;

public class MinMaxPlayer extends PlayerController {
    private int depth;

    public MinMaxPlayer(int playerId, int gameN, int depth, Heuristic heuristic) {
        super(playerId, gameN, heuristic);
        this.depth = depth;
        //You can add functionality which runs when the player is first created (before the game starts)
        
    }


// function minimax(node, depth, maximizingPlayer) is
//     if depth = 0 or node is a terminal node then
//         return the heuristic value of node
//     if maximizingPlayer then
//         value := −∞
//         for each child of node do
//             value := max(value, minimax(child, depth − 1, FALSE))
//         return value
//     else (* minimizing player *)
//         value := +∞
//         for each child of node do
//             value := min(value, minimax(child, depth − 1, TRUE))
//         return value


    /**
   * Implement this method yourself!
   * @param board the current board
   * @return column integer the player chose
   */
    @Override
    public int makeMove(Board board) {

        //make some nodes
        return minimax(board, depth, true);
    }

    private int minimax(Node node, int depth, boolean maximizingPlayer) {
        if (depth == 0 || node.isTerminal()) {
            return node.getScore();
        }

        if (maximizingPlayer) {
            int value = Integer.MIN_VALUE;
            for (Node child : node.getChildren()) {
                value = Math.max(value, minimax(child, depth - 1, false));
            }
            return value;
        } else {
            int value = Integer.MAX_VALUE;
            for (Node child : node.getChildren()) {
                value = Math.min(value, minimax(child, depth - 1, true));
            }
            return value;
        }
    }
    
}
