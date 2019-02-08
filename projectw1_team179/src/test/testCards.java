package test;

import org.junit.jupiter.api.Test;
import ui.main.Card;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class testCards {
    @Test
    void stringCardTest() {
        Card card = new Card(1, 1);
        assertTrue(card.rankAsString(card.getStrength()).equals("2"));
        assertTrue(card.suitAsString(card.getSuit()).equals("Spades"));
    }
}
