package ui.main;
import ui.exceptions.StackHighException;
import ui.exceptions.StackLowException;

import java.io.IOException;
import java.util.Random;
public class AdvancedPlayer extends PokerPlayer {
    private String name;
    private int potSize;
    private PokerHand pokerHand;

    public AdvancedPlayer(String name, int potSize, PokerHand pokerHand) {
        super(null, 0, null);
        this.name = name;
        this.potSize = potSize;
        this.pokerHand = pokerHand;


   }

    @Override
    public int getStrength() {
        Random ran = new Random();

        if (ran.nextInt(3) == 1) {
            return 1;
        }
        else {
            return pokerHand.getStrength();
        }
    }

//    @Override
//    public PokerPlayer buildPlayer(int x) throws IOException, StackHighException, StackLowException {
//        PokerSetter p = new PokerSetter();
//        return super.buildPlayer(1, p);
//
//    }
}
