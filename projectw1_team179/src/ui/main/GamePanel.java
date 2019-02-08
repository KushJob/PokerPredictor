package ui.main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePanel {private static final Dimension MAIN_SIZE = new Dimension(400, 200);
    private JPanel mainPanel = new JPanel();
    private IntroPanel2 introPanel2 =  new IntroPanel2();
 //   private JButton foo;
  //  private JButton bar;
    private JButton back;
    private Card ca1 = new Card(0, 0);
    private Card ca2 = new Card(0,0);
    private PokerHand ph = new PokerHand(ca1, ca2);


    private JLabel results;

    public GamePanel() {
   //     foo = new JButton("Foo");
   //     bar = new JButton("Bar");
        back = new JButton("return to main menu");

     //   mainPanel.add(foo);
    //    mainPanel.add(bar);
        mainPanel.add(back);
        mainPanel.setPreferredSize(MAIN_SIZE);

//if (results != null)

    }

    public JComponent getMainComponent() {
        return mainPanel;
    }
//    public void setCa1(Card ca1) {
//       ph = new PokerHand(ca1, ca2);
//    }
//    public void setCa2(Card ca2) {
//        ph = new PokerHand(ca1, ca2);
//    }
public void setPH(Card card1, Card card2) {
        ph.setCardOne(card1);
        ph.setCardTwo(card2);
}

    public PokerHand getPh() {
        return ph;
    }

    public void setResults (){
        results = new JLabel(Integer.toString(ph.getStrength()));
        mainPanel.add(results);
    }

    public void addBackBtnActionListener(ActionListener listener) {
        back.addActionListener(listener);
    }

}


