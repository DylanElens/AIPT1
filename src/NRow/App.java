package NRow;

import NRow.Heuristics.SimpleHeuristic;
import NRow.Players.HumanPlayer;
import NRow.Players.MinMaxPlayer;
import NRow.Players.PlayerController;

public class App {
    public static void main(String[] args) {
        int gameN = 4;
        int boardWidth = 7;
        int boardHeight = 6;

        PlayerController[] players = getPlayers(gameN);

        Game game = new Game(gameN, boardWidth, boardHeight, players);
        game.startGame();
    }

    /**
     * Determine the players for the game
     * @param n
     * @return an array of size 2 with two Playercontrollers
     */
    private static PlayerController[] getPlayers(int n) {
        SimpleHeuristic heuristic1 = new SimpleHeuristic(n);

        PlayerController human = new MinMaxPlayer(1, n, 3, heuristic1);
        PlayerController human2 = new HumanPlayer(2, n, heuristic1);

        //TODO: Implement other PlayerControllers (MinMax, AlphaBeta)

        PlayerController[] players = { human, human2 };

        return players;
    }
}
