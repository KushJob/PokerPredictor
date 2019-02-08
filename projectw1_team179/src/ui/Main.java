package ui;

import ui.exceptions.StackException;
import ui.main.*;


import java.util.Scanner;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;



public class Main {
        public static void main(String[] args) throws MalformedURLException, IOException {
            BufferedReader br = null;

            try {
                String theURL = "https://www.ugrad.cs.ubc.ca/~cs210/2018w1/welcomemsg.html"; //this can point to any URL
                URL url = new URL(theURL);
                br = new BufferedReader(new InputStreamReader(url.openStream()));

                String line;

                StringBuilder sb = new StringBuilder();

                while ((line = br.readLine()) != null) {

                    sb.append(line);
                    sb.append(System.lineSeparator());
                }

                System.out.println(sb);
            } finally {

                if (br != null) {
                    br.close();
                }
            }
            Scanner scanner = new Scanner(System.in);
            PokerPlayer pokerPlayer = new PokerPlayer(null, 0, null);
            PokerPlayer advancedPlayer = new AdvancedPlayer(null, 0, null);
            System.out.println("Are you an advanced poker player?");
            if (scanner.nextLine().equals("yes")) {
                try {
                    System.out.println(advancedPlayer.buildPlayer(1).getStrength());
                } catch (StackException e) {
                    System.out.println("I don't think you're an advanced player.");
                    try {
                        System.out.println(pokerPlayer.buildPlayer(0).getStrength());
                    } catch (StackException b) {
                        System.out.println("I cannot give you any advice.");

                    }
                }
            }
                //else
            //    { System.out.println(advancedPlayer.getStrength());}}
             else {
                    try {
                        System.out.println(pokerPlayer.buildPlayer(0).getStrength());
                    } catch (StackException e) {
                        System.out.println("I cannot give you any advice.");

                        }
                    }

            }
        }

