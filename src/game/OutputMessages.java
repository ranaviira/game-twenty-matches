package game;

public class OutputMessages {

    public static void ruleOfGame() {
        System.out.println("Игра 20 спичек. В начале игры на столе лежит 20 спичек. " +
                "Игроки ходят по очереди, убирая на выбор 1, 2 или 3 спички. " +
                "Проигравшим считается тот, кто возьмет со стола последнюю спичку.");
    }

    public static void incorrectInput() {
        System.out.println("Некорректное количество спичек! Введите от 1 до 3.");
    }

    public static void restMatchesOnTable(int matches) {
        System.out.println("На столе осталось " + matches + " спичек.");
    }

    public static void numberSelectByComputer(int matches) {
        System.out.println(" - Количество выбранных компьютером спичек = " + matches);
    }

    public static void numberSelectByPlayer() {
        System.out.print(" - Ход игрока. Введите количество спичек: ");
    }

    public static void endGameInfo() {
        System.out.println("Для игрока осталась последняя спичка. Игрок проиграл!");
    }
}
