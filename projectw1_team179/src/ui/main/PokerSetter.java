package ui.main;

import Observer.CardSaver;
import ui.exceptions.StackHighException;
import ui.exceptions.StackLowException;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Scanner;

public class PokerSetter extends Observable {
    public PokerSetter(){
        addObserver(new CardSaver());
    }
    //REQUIRES: String cardOne
    //MODIFIES: this
    //EFFECTS:  returns the integer value of card one
    public PokerPlayer buildPlayer(int x) throws IOException, StackLowException, StackHighException {
        String pname;
        int p1;
        int r1;
        int r2;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        List<String> lines = Files.readAllLines(Paths.get("outputfile.txt"));
        PrintWriter writer = new PrintWriter("outputfile.txt","UTF-8");
        if (lines.isEmpty()) {
            pname = setName();
            inputs.add(pname);
            p1 = readStackSize();
            inputs.add(Integer.toString(p1));
            r1 = setCardOne(scanner, inputs);
            r2 = setCardTwo(scanner, inputs, "What is the rank of your second card as an integer? " +
                    "(ie. 1 = Two 13=Ace)");
            for(String input: inputs) {
                writer.println(input);
            }
        }
        else {
            System.out.println("Is your name " + lines.get(0));
            if (scanner.nextLine().equals("yes")) {
                pname = lines.get(0);
                p1 = Integer.parseInt(lines.get(1));
                r1 = Integer.parseInt(lines.get(2));
                r2 = Integer.parseInt(lines.get(3));
            }
            else {

                System.out.println("Please select a player name");
                pname = scanner.nextLine();
                inputs.add(pname);
                p1 = readStackSize();
                inputs.add(Integer.toString(p1));
                r1 = setCardOne(scanner, inputs);
                r2 = setCardTwo(scanner, inputs, "What is the rank of your second card as an integer? " +
                        "(ie. 1 = Two 13= Ace)");
                for(String input: inputs) {
                    writer.println(input);
                }

            }
        }
        writer.close();
        Card c1 = new Card(4, r1);
        Card c2 = new Card(4, r2);
        PokerHand pp = new PokerHand(c1 , c2);
        PokerPlayer pokerPlayer = new PokerPlayer(pname, p1, pp);
        AdvancedPlayer advancedPlayer = new AdvancedPlayer(pname, p1, pp);
        if (x == 0) {
            return pokerPlayer;
        }
        else
        return advancedPlayer;

    }

    private int setCardTwo(Scanner scanner, ArrayList<String> inputs, String s) {
        int r2;
        System.out.println(s);
        r2 = Integer.parseInt(scanner.nextLine());
        setChanged();
        notifyObservers(r2);
        inputs.add(Integer.toString(r2));
        return r2;
    }

    private int setCardOne(Scanner scanner, ArrayList<String> inputs) {
        int r1;
        System.out.println("What is the rank of your first card as an integer? " +
                "(ie. 1 = Two 13= Ace)");
        r1 = Integer.parseInt(scanner.nextLine());
        setChanged();
        notifyObservers(r1);
        inputs.add(Integer.toString(r1));
        return r1;
    }

    public String setName () {
        String pname;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select a player name");
        pname = scanner.nextLine();
       return pname;
    }
    public int setStackSize(int ss) throws StackLowException, StackHighException {

        if (ss < 1 ){
            System.out.println("You have no money!!");
            throw new StackLowException();}
        if (ss > 20){
            System.out.println("You have too much money");
            throw new StackHighException();}
        return ss;}

    public int readStackSize() throws StackHighException, StackLowException {
        Scanner scanner = new Scanner(System.in);
        int ss;
        System.out.println("What is your current stack size (1-20) ?");
        ss = Integer.parseInt(scanner.nextLine());
        return setStackSize(ss);
    }

}
