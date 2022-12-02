package lesson_08.models;

import lesson_08.interfaces.GameBJ;
import lesson_08.interfaces.Player;

public class GameBJImpl implements GameBJ {
    // fields
    PlayerImpl [] playersInGame = new PlayerImpl[3];
    DeckOfCardsImpl deckOfCards = new DeckOfCardsImpl();


    // constructor




    //methods
    @Override
    public void addPlayerInGame(PlayerImpl player) {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] == null) {
                playersInGame[i] = player;
                break;
            }
        }
    }

    @Override
    public void giveTwoCardsONHand() {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] != null) {
                playersInGame[i].takeCard(deckOfCards.randomCards());
                playersInGame[i].takeCard(deckOfCards.randomCards());

            }
        }
    }



    public void giveOneCardIfNeedToPlayer() {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] != null) {
                while (playersInGame[i].needCard()) {
                    playersInGame[i].takeCard(deckOfCards.randomCards());
                }
            }
        }
    }

    @Override
    public void printWinner() {
        //1 проход по всему массиву игроков в иге и выключение всех игроков у кого больше 21
        for (PlayerImpl player : playersInGame) {
            if (player != null) {
                if (player.countValuesOfAllCardsOnHand() > 21) {
                    player.setInGame(false);
                }
            }
        }

        // 2 победил один игрок, оставшийся в игре
        if (countPlayersInGame() == 1) {
            System.out.println("Победил игрок: ");
            for (PlayerImpl player: playersInGame) {
                if (player != null && player.isInGame()) {
                    player.showCardsOnHand();
                }
            }
        }
        // 3 Победило несколько игроков
        int bestValue = 0;
        for (PlayerImpl player: playersInGame) {
            if (player != null && player.isInGame()) {
                if (bestValue < player.countValuesOfAllCardsOnHand()) {
                    bestValue = player.countValuesOfAllCardsOnHand();
                }
            }
        }
        for (PlayerImpl player: playersInGame) {
            if (player != null && player.isInGame() && !player.isCroupier) {
                System.out.println("Победил игрок :");
                player.showCardsOnHand();
            }
        }
    }

    public int countPlayersInGame() {
        int countPlayer = 0;
        for (PlayerImpl player:  playersInGame) {
            if (player != null && player.isInGame()) {
                countPlayer++;
            }
        }
        return countPlayer;
    }
}