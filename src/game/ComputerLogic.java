package game;

import java.util.ArrayList;
import java.util.Collections;

public class ComputerLogic {

    static public int computerRunning(int matches) {
        ArrayList<Integer> winNumberMatchesOnTable = new ArrayList<>();
        for (int i = 1; (4 * i - 3) < matches; i++) {
            winNumberMatchesOnTable.add(4 * i - 3);
        }
        return matches - Collections.max(winNumberMatchesOnTable);
    }

}
