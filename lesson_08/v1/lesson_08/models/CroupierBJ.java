package lesson_08.models;

public class CroupierBJ extends PlayerImpl {
    @Override
    public boolean needCard() {
        if (countValuesOfAllCardsOnHand() > 17) {     //
            return false;
        }
        return true;
    }

    @Override
    public boolean isCroupier() {
        return super.isCroupier();
    }
}
