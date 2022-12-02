package lesson_08.models;

import lesson_08.interfaces.Card;
import lesson_08.interfaces.Player;

import java.util.Scanner;

public class PlayerImpl implements Player {
    //fields
    Card [] cardsOnHand = new Card[100];
    boolean inGame;
    boolean isCroupier = false;


    // constructor



    // methods

    @Override
    public void takeCard(Card card) {
        for (int i = 0; i < cardsOnHand.length; i++) {
            if (cardsOnHand[i] == null) {
                cardsOnHand[i] = card;
                break;
            }
        }
    }

    @Override
    public int countValuesOfAllCardsOnHand() {
        int count = 0;
        for (Card c : cardsOnHand) {
            if (c != null) {
                count += c.getValue();
            }

        }
        return count;
    }

    @Override
    public boolean needCard() {
        System.out.println("---------Ваши карты-----------");
        showCardsOnHand();
        System.out.println("Нужна ли вам ещё карты?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals("да")){
            return true;
        }
        return false;
    }

    @Override
    public void showCardsOnHand() {
        for (Card card  :  cardsOnHand) {
            if (card != null) {
                card.printCard();
            }
        }
    }

    public Card[] getCardsOnHand() {
        return cardsOnHand;
    }

    public void setCardsOnHand(Card[] cardsOnHand) {
        this.cardsOnHand = cardsOnHand;
    }

    public boolean isInGame() {
        return inGame;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    public boolean isCroupier() {
        return false;
    }

    public void setCroupier(boolean croupier) {
        isCroupier = croupier;
    }
}
