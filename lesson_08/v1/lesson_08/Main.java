package lesson_08;

import lesson_08.models.CroupierBJ;
import lesson_08.models.GameBJImpl;
import lesson_08.models.PlayerImpl;

public class Main {
    public static void main(String[] args) {
        // 1. Создать класс игру, в которой у нас происходит игра
        // 2. Создать игроков
        // 3. Создать крупье
        // 4. Добавить игроков и крупье в игру
        // 5. Добавить колоду карт
        // 6. Добавим карты в колоду
        // 7. Раздать каждому игроку по 2 карты на старте
        // 8 . Раздавать

        GameBJImpl gameBJ = new GameBJImpl();

        PlayerImpl player1 = new PlayerImpl();
        PlayerImpl player2 = new PlayerImpl();

        CroupierBJ croupierBJ = new CroupierBJ();

        gameBJ.addPlayerInGame(player1);
        gameBJ.addPlayerInGame(player2);
        gameBJ.addPlayerInGame(croupierBJ);

        gameBJ.giveOneCardIfNeedToPlayer();


    }
}
