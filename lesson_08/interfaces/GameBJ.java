package lesson_08.interfaces;

import lesson_08.models.PlayerImpl;

public interface GameBJ {
    void addPlayerInGame (PlayerImpl player); // добавить игрока в игру

    void giveTwoCardsONHand(); // раздача 2 карт на старте

    void giveOneCardIfNeedToPlayer(); // давать доп карту, если требуется

    void printWinner(); // объявлять победителя
}
