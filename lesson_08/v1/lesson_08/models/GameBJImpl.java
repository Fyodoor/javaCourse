package lesson_08.models;

import lesson_08.interfaces.GameBJ;
import lesson_08.interfaces.Player;

public class GameBJImpl implements GameBJ {
    // fields
    PlayerImpl [] playersInGames = new PlayerImpl[3];
    DeckOfCardsImpl deckOfCards;


    // constructor




    //methods
    @Override
    public void addPlayerInGame(PlayerImpl player) {
        for (int i = 0; i < playersInGames.length; i++) {
            if (playersInGames[i] == null) {
                playersInGames[i] = player;
                break;
            }
        }
    }

    @Override
    public void giveTwoCardsOnHand() {
        for (int i = 0; i < playersInGames.length; i++) {
            if (playersInGames[i] != null) {
                playersInGames[i].takeCard(deckOfCards.randomCards());
                playersInGames[i].takeCard(deckOfCards.randomCards());
            }
        }
    }

    @Override
    public void giveOneCardIfNeedToPlayer() {
        for (int i = 0; i < playersInGames.length; i++) {
            if (playersInGames[i] != null) {
                while (playersInGames[i].needCard()) {
                    playersInGames[i].takeCard(deckOfCards.randomCards());
                }
            }
        }
    }

    @Override
    public void printWinner() {
        //1 проход по всему массиву игроков в иге и выключение всех игроков у кого больше 21
        for (PlayerImpl player  :  playersInGames) {
            if (player != null) {
                if (player.countValuesOfAllCardsOnHand() > 21) {
                    player.setInGame(false);
                }
            }
        }

        // 2 победил один игрок, оставшийся в игре
        if (countPlayersInGame() == 1) {
            System.out.println("Победил игрок: ");
            for (PlayerImpl player: playersInGames) {
                if (player != null && player.isInGame()) {
                    player.showCardsOnHand();
                }
            }
        }
        // 3
        int bestValue = 0;
        for (PlayerImpl player: playersInGames) {
            if (player != null && player.isInGame()) {
                if (bestValue < player.countValuesOfAllCardsOnHand()) {
                    bestValue = player.countValuesOfAllCardsOnHand();
                }
            }
        }
        for (PlayerImpl player: playersInGames) {

        }
    }

    public int countPlayersInGame() {
        int countPlayer = 0;
        for (PlayerImpl player:  playersInGames) {
            if (player != null && player.isInGame()) {
                countPlayer++;
            }
        }
        return countPlayer;
    }
}
