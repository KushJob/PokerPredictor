package Observer;

import java.util.Observable;
import java.util.Observer;

public class CardSaver implements Observer{
    int cardStrength;
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Card added: " + arg);
        cardStrength = cardStrength + Integer.parseInt(arg.toString());
        System.out.println("your cards add up too:" + cardStrength);

    }
}
