package ui.main;

import ui.exceptions.StackHighException;
import ui.exceptions.StackLowException;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PokerPlayer extends Player implements Cards {
    private String name;
    private int potSize;
    private PokerHand pokerHand;
    private PokerSetter pokerSetter;

    //REQUIRES: String value name, integer value potSize, String value card (Ace-King),
    //          String value card (Ace-King)
    //MODIFIES: this
    //EFFECTS:  Constructs the PokerPlayer initialising its name potSize and card
    public PokerPlayer(String name, int potSize, PokerHand pokerHand) {
        this.name = name;
        this.potSize = potSize;
        this.pokerHand = pokerHand;
        pokerSetter = new PokerSetter();


        //this.cardTwo = cardTwo;
    }

    //REQUIRES: nothing
    //MODIFIES: nothing
    //EFFECTS:  returns the integer for potSize
    public int getPotSize() {
        return this.potSize;
    }

    //REQUIRES: int value winnings
    //MODIFIES: this
    //EFFECTS:  adds your winnings to the initial pot size
    public void addToPot(int n) {
        this.potSize = this.potSize + n;
    }

    //REQUIRES: nothing
    //MODIFIES: nothing
    //EFFECTS:  returns the integer for potSize
    public String getName() {
        return this.name;
    }
    //REQUIRES: nothing
    //MODIFIES: nothing
    //EFFECTS:  returns the strength of the hand
    @Override
    public int getStrength() {
        return (pokerHand.getStrength());
    }

    //REQUIRES: String cardOne
    //MODIFIES: this
    //EFFECTS:  returns the integer value of card one
    public PokerPlayer buildPlayer(int x) throws IOException, StackLowException, StackHighException {
        return pokerSetter.buildPlayer(x);
//        String operation;
//        int p1;
//        int r1;
//        int r2;
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> inputs = new ArrayList<>();
//        List<String> lines = Files.readAllLines(Paths.get("outputfile.txt"));
//        PrintWriter writer = new PrintWriter("outputfile.txt","UTF-8");
//        if (lines.isEmpty()) {
//            System.out.println("Please select a player name");
//            operation = scanner.nextLine();
//            inputs.add(operation);
//            p1 = readStackSize();
//            inputs.add(Integer.toString(p1));
//            System.out.println("What is the rank of your first card as an integer? " +
//                    "(ie. 1 = Two 13= Ace)");
//            r1 = Integer.parseInt(scanner.nextLine());
//            inputs.add(Integer.toString(r1));
//            System.out.println("What is the rank of your second card as an integer? " +
//                    "(ie. 1 = Two 13=Ace)");
//            r2 = Integer.parseInt(scanner.nextLine());
//            inputs.add(Integer.toString(r2));
//            for(String input: inputs) {
//                writer.println(input);
//            }
//        }
//        else {
//            System.out.println("Is your name " + lines.get(0));
//            if (scanner.nextLine().equals("yes")) {
//                operation = lines.get(0);
//                p1 = Integer.parseInt(lines.get(1));
//                r1 = Integer.parseInt(lines.get(2));
//                r2 = Integer.parseInt(lines.get(3));
//            }
//            else {
//
//                System.out.println("Please select a player name");
//                operation = scanner.nextLine();
//                inputs.add(operation);
//                p1 = readStackSize();
//                inputs.add(Integer.toString(p1));
//                System.out.println("What is the rank of your first card as an integer? " +
//                        "(ie. 1 = Two 13= Ace)");
//                r1 = Integer.parseInt(scanner.nextLine());
//                inputs.add(Integer.toString(r1));
//                System.out.println("What is the rank of your second card as an integer? " +
//                        "(ie. 1 = Two 13= Ace)");
//                r2 = Integer.parseInt(scanner.nextLine());
//                inputs.add(Integer.toString(r2));
//                for(String input: inputs) {
//                    writer.println(input);
//                }
//
//            }
//        }
//        writer.close();
//        Card c1 = new Card(4, r1);
//        Card c2 = new Card(4, r2);
//        PokerHand pp = new PokerHand(c1 , c2);
//        PokerPlayer pokerPlayer = new PokerPlayer(operation, p1, pp);
//        AdvancedPlayer advancedPlayer = new AdvancedPlayer(operation, p1, pp);
//        if (x == 0)
//        return pokerPlayer;
//        return advancedPlayer;

    }
//    public int setStackSize(int ss) throws StackLowException, StackHighException {
//
//                if (ss < 1 ){
//        System.out.println("You have no money!!");
//        throw new StackLowException();}
//                if (ss > 20){
//        System.out.println("You have too much money");
//        throw new StackHighException();}
//    return ss;}
//
//    public int readStackSize() throws StackHighException, StackLowException {
//        Scanner scanner = new Scanner(System.in);
//        int ss;
//        System.out.println("What is your current stack size (1-20) ?");
//        ss = Integer.parseInt(scanner.nextLine());
//        return setStackSize(ss);
//    }




}
