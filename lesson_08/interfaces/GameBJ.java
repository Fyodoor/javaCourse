package lesson_08.interfaces;

public interface GameBJ {
    void addPlayerInGame (Player player); // добавить игрока в игру

    void giveTwoCardsOnHand(); // раздача 2 карт на старте

    void giveOneCardIfNeedToPlayer(); // давать доп карту, если требуется

    void printWinner(); // объявлять победителя
}
