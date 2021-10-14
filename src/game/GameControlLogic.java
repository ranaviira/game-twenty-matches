package game;

import java.util.Scanner;

import static game.ComputerLogic.*;
import static game.OutputMessages.*;

public class GameControlLogic {

    private static int matchesOnTable = 20;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ruleOfGame();

        while (true) {

            numberSelectByComputer(computerRunning(matchesOnTable));
            matchesOnTable = matchesOnTable - computerRunning(matchesOnTable);
            restMatchesOnTable(matchesOnTable);

            if (matchesOnTable == 1) {
                endGameInfo();
                return;
            }

            while (true) {
                numberSelectByPlayer();
                int enterNumberPlayer = scanner.nextInt();

                if (enterNumberPlayer == 1 || enterNumberPlayer == 2 || enterNumberPlayer == 3) {
                    matchesOnTable = matchesOnTable - enterNumberPlayer;
                    restMatchesOnTable(matchesOnTable);
                    break;

                } else {
                    incorrectInput();
                    restMatchesOnTable(matchesOnTable);
                }
            }
        }
    }
}

