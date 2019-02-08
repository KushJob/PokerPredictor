package test;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ui.exceptions.StackException;
import ui.exceptions.StackHighException;
import ui.exceptions.StackLowException;
import ui.main.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class testPlayer {
    // Test that a PokerPlayer works like you expect, when you add too its pot size from winning
    private PokerPlayer p;
    private PokerSetter ps;
    @BeforeEach
    public void setUp () {

        Card c1 = new Card(3, 3);
        Card c2 = new Card(3, 3);
        PokerHand pp = new PokerHand(c1, c2);
        p = new PokerPlayer("tim", 5, pp);
        ps = new PokerSetter();
    }
    @Test
    public void testAddToPot() {

        assertTrue(p.getPotSize() == 5);
        p.addToPot(10);
        assertTrue(p.getPotSize() == 15);
    }
    @Test
    public void testValidSetStackSize() {
        //no exceptions
        try{ ps.setStackSize(5);}
        catch (StackException c) {
            fail("I don't think you're an advanced player.");
        }
    }
    @Test
    public void testHighSetStackSize() {
        //StackHighException should occur
        try{ ps.setStackSize(25);}
        catch (StackHighException c) {
            //nothing needs to be done
        }
        catch (StackLowException l){
            fail("it is not too low");
        }
    }
    @Test
    public void testLowSetStackSize() {
        //StackHighException should occur
        try{ ps.setStackSize(0);}
        catch (StackHighException c) {
            fail("it is not too high");
        }catch (StackLowException l){
            //nothing needs to be done
        }
    }
//    @Test
//    public void testGetStrength() {
//        AdvancedPlayer advancedPlayer = new AdvancedPlayer();
//        if (advancedPlayer.getStrength() == 1)
//            assertTrue(true);
//        else
//            testGetStrength();
//        }
    }


