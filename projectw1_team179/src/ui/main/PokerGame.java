package ui.main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class PokerGame {
    AudioClip click;
    private static final String INTRO = "intro";
    private static final String INTRO2 = "intro";
    private static final String GAME = "game";
    private CardLayout cardlayout = new CardLayout();
    private JPanel mainPanel = new JPanel(cardlayout);
    private IntroPanel introPanel = new IntroPanel();
    private GamePanel gamePanel = new GamePanel();
    private IntroPanel2 introPanel2 = new IntroPanel2();
    private Card ca1 = new Card(0, 0);
//    private Card ca2 = new Card(0,0);
    private Card ca2;




    public Card getCa1() {
        return ca1;
    }

    public Card getCa2() {
        return ca2;
    }

    public PokerGame() {
        int c1 = 0;
        int c2;

        mainPanel.add(introPanel.getMainComponent(), INTRO);
        mainPanel.add(introPanel2.getMainComponent(), INTRO2);
        mainPanel.add(gamePanel.getMainComponent(), GAME);
        introPanel.addNextBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final int c1 = (introPanel.getField());
//                final Card ca1 = new Card(1, c1);
                ca1.setRank(c1);
                ca1.setSuit(1);
                System.out.println(ca1.getStrength());
                    cardlayout.show(mainPanel, INTRO2);
                URL urlClick = PokerGame.class.getResource("Alesis-Fusion-Fretless-Bass-C3 (1).wav");
                click = Applet.newAudioClip(urlClick);
                click.loop();
            }
        });
        introPanel2.addNextBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final int c2 = (introPanel2.getField());

                ca2 =  new Card(1, c2);
                System.out.println(ca1.getStrength());
                System.out.println(ca2.getStrength());
                gamePanel.setPH(ca1, ca2);
                System.out.println(gamePanel.getPh().getStrength());
                gamePanel.setResults();
                cardlayout.show(mainPanel, GAME);
                click.stop();

                //System.out.println(ph.getStrength());
            }
        });
        gamePanel.addBackBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardlayout.show(mainPanel, INTRO);
            }
        });
    }



    private JComponent getMainComponent() {
        return mainPanel;
    }
//    public PokerHand phMaker(){
//
//        ph = new PokerHand(new Card(1,c1), new Card (1, c2));
//        return ph;}

    private static void createAndShowUI() {
        JFrame frame = new JFrame("Foo Bar Baz");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new PokerGame().getMainComponent());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public JLabel setResults(PokerHand pokerHand) {
        JLabel result = new JLabel(Integer.toString(pokerHand.getStrength()));
        return result;
    }
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                createAndShowUI();
            }
        });
    }
}
