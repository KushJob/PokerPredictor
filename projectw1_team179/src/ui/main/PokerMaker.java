//package ui.main;
//
//import javax.swing.*;
//import javax.swing.border.EmptyBorder;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class PokerMaker implements ActionListener
//{
//    private JLabel label;
//    private JTextField field;
//    private int c1;
//    private int c2;
//
//    private JPanel stackSetter;
//
//    public PokerMaker()
//    {
//        JFrame GUI = new JFrame();
//
//
//
//
////        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        GUI.setPreferredSize(new Dimension(500, 300));
////        ((JPanel) GUI.getContentPane()).setBorder(new EmptyBorder(100, 100, 100, 100) );
////        GUI.setLayout(new FlowLayout());
////        //sets "this" class as an action listener for btn.
////        //that means that when the btn is clicked,
////        //this.actionPerformed(ActionEvent e) will be called.
////        //You could also set a different class, if you wanted
////        //to capture the response behaviour elsewhere
////        label = new JLabel("What is the rank of your first card as an integer? (ie. 1 = Two 13= Ace)");
////        field = new JTextField(5);
////        pack();
////        setLocationRelativeTo(null);
////        setVisible(true);
////        setResizable(false);
////        add(stackSetup());
//
//
//    }
////public JPanel stackSetup(){
////        stackSetter = new JPanel();
////    stackSetter.setUI(this);
////    stackSetter.add(label);
////    stackSetter.add(field);
////    JButton btn = new JButton("Next");
////    btn.setActionCommand("myButton");
////    btn.addActionListener(this);
////    stackSetter.add(btn);
////    stackSetter.setVisible(true);
////    return stackSetter;
//
////}
//
//    //this is the method that runs when Swing registers an action on an element
//    //for which this class is an ActionListener
//    public void actionPerformed(ActionEvent e)
//    {
//        if(e.getActionCommand().equals("myButton"))
//        {
//            if (c1 == 0)
//            {c1 = Integer.parseInt(field.getText());
//            label.setText("What is the rank of your second card as an integer? (ie. 1 = Two 13= Ace)");
//            field.setText("");}
//            else
//            {c2 = Integer.parseInt(field.getText());
//            setVisible(false);
//            stackSetup();}
//
//
//        }
//    }
//    public static void main(String[] args)
//    {
//        new PokerMaker();
//    }
//}

