package lesson_08;

import lesson_08.models.CroupierBJ;
import lesson_08.models.GameBJImpl;
import lesson_08.models.PlayerImpl;

public class Main {
    public static void main(String[] args) {
        // 1. Создать класс игру, в которой у нас происходить игра
        // 2. СОздаем игроков
        // 3. Создаем крупье
        // 4. Добавить игроков и крупье в игру
        // 5. Добавить колоду карт
        // 6. Добавим карты в колоду
        // 7. Раздать каждому игроку по 2 карты на старте
        // 8. Раздавать каждому игрроку по одной карте, пока это требуется
        // 9. Определить победителя


        // 1. Создать класс игру, в которой у нас происходить игра
        GameBJImpl gameBJ = new GameBJImpl();

        // 2. СОздаем игроков
        PlayerImpl player1 = new PlayerImpl();
        PlayerImpl player2 = new PlayerImpl();

        // 3. Создаем крупье
        CroupierBJ croupierBJ = new CroupierBJ();


        // 4. Добавить игроков и крупье в игру
        gameBJ.addPlayerInGame(player1);
        gameBJ.addPlayerInGame(player2);
        gameBJ.addPlayerInGame(croupierBJ);

        // 5. Добавить колоду карт
        // 6. Добавим карты в колоду
        // 7. Раздать каждому игроку по 2 карты на старте
        gameBJ.giveTwoCardsONHand();

        // 8. Раздавать каждому игрроку по одной карте, пока это требуется
        gameBJ.giveOneCardIfNeedToPlayer();


        // 9. Определить победителя
        gameBJ.printWinner();
    }
}
