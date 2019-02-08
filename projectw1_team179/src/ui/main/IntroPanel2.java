package ui.main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IntroPanel2 {
    private JPanel mainPanel = new JPanel();
    private IntroPanel introPanel = new IntroPanel();
    private JButton next;
    private JButton exit;
    private JTextField field;

    private int c2;
    private Card Ca2;
    private PokerHand ph;
    public IntroPanel2() {
        mainPanel.setLayout(new FlowLayout());
        next = new JButton("Next");
        exit = new JButton("exit");
        field = new JTextField(5);

            mainPanel.add(new JLabel("What is the rank of your first card as an integer?" +
                    " (ie. 1 = Two 13= Ace)"));

           // mainPanel.add(new JLabel("card one = "
             //       + getCAsString()));
        mainPanel.add(next);
        mainPanel.add(exit);
        mainPanel.add(field);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Window win = SwingUtilities.getWindowAncestor(mainPanel);
                win.dispose();
            }
        });
    }

    public void addNextBtnActionListener(ActionListener listener) {
        next.addActionListener(listener);
    }

    public JComponent getMainComponent() {
        return mainPanel;
    }
//public String getCAsString()
//{return introPanel.cardAsString();}

    public int getC2() {
        return c2;
    }

    public void setC2(int x) {
        c2 = x;
    }
    public int getField(){
        return Integer.parseInt(field.getText());
    }
    public Card makeCard2() {
        Ca2 = new Card(3, c2);
        return Ca2;
    }
    public PokerHand phMaker(){
    ph = new PokerHand(introPanel.makeCard(), makeCard2());
    return ph;}
}

