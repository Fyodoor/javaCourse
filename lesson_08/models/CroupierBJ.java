package lesson_08.models;

public class CroupierBJ extends PlayerImpl {

    @Override
    public boolean isCroupier() {
        return true;
    }

    @Override
    public boolean needCard() {
        return countValuesOfAllCardsOnHand() <= 17;
    }

}
