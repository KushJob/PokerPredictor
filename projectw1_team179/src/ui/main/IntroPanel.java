package ui.main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IntroPanel {
    private JPanel mainPanel = new JPanel();
    private JButton next = new JButton("Baz");
    private JButton exit = new JButton("Exit");
    private JTextField field;
    private int c1;
    private int c2;
    private Card Ca1;

    public IntroPanel() {
        mainPanel.setLayout(new FlowLayout());
        next = new JButton("Next");
        exit = new JButton("exit");
        field = new JTextField(5);
//        if (c1 == 0)

            mainPanel.add(new JLabel("What is the rank of your first card as an integer?" +
                    " (ie. 1 = Two 13= Ace)"));


//        else
//        { Ca1 = new Card(4, c1);
//            mainPanel.add(new JLabel("What is the rank of your second card as an integer?" +
//                " (ie. 1 = Two 13= Ace)"));
//            mainPanel.add(new JLabel("card one = " + Ca1.rankAsString(c1)));}



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

    public int getC1() {
        return c1;
    }

    public int getC2() {
        return c2;
    }
    public void setC1(int x) {
        c1 = x;
    }
    public void setC2(int x) {
        c2 = x;
    }
    public int getField(){
        return Integer.parseInt(field.getText());
    }
    public Card makeCard(){
        Ca1 = new Card(2, c1);
        return Ca1;
    }
    public String cardAsString() {
       return Ca1.rankAsString(Ca1.getStrength());
    }
}
