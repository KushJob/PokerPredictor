package com.codebind;

import ui.main.PokerPlayer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton button1;
    private JPanel panelMain;
    private JButton button9;
    private int buttonPressed  = 0;


    public App() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonPressed = 1;
            }
        });
    }

    public void createAndShow(){
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panelMain);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        System.out.println(1);
    }

}

//set visible to false to hide panel

//ok so what you are gonna do is make it so when your poker hand is not null then create a new screen.