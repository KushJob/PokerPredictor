package ui.main;

import java.lang.*;
import java.util.HashMap;
import java.util.Map;

public class PokerHand implements Cards{

        private Card cardOne;
        private Card cardTwo;
        private Map<Card, Card> Cardss = new HashMap<>();


       public PokerHand(Card cardOne, Card cardTwo) {
           this.cardOne = cardOne;
           this.cardTwo = cardTwo;
           Cardss.put(cardOne, cardTwo);
           Card ace = new Card(4, 13);
           Cardss.put(ace, ace);
          // this.Cards = new HashMap<cardOne, cardTwo >()
       }



    @Override
    public int getStrength() {
        int strength = cardOne.getStrength() + cardTwo.getStrength();
        Card ace = new Card(4, 13);
        if (Cardss.get(cardOne) == (Cardss.get(ace))) {
            strength = 1000;
        } else {
            if
                    (Math.abs((cardOne.getStrength() - cardTwo.getStrength())) < 5) {
                strength = strength + (5 - Math.abs((cardOne.getStrength() - cardTwo.getStrength())));
            }

        }
        return strength;
    }
    public void setCardOne(Card c1) {
        this.cardOne = c1;
    }

    public void setCardTwo(Card c2) {
        this.cardTwo = c2;
    }
    public Card getCardOne() {
        return cardOne;
    }
    public Card getCardTwo() {
        return cardTwo;
    }
        }

