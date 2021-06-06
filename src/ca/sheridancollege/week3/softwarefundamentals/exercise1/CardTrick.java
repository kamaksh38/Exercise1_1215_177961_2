/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.exercise1;

import java.util.Scanner;
import java.util.Arrays;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Jiali Wang
 * Student number: 991632365
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        // create a hand of 7 random cards
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++) {
            magicHand[i] = new Card();
            magicHand[i].setValue(getRandomCardValue());
            magicHand[i].setSuit(getRandomCardSuit());
        }
        
        // Ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        System.out.println("Pick your own card:");
        Card myCard = new Card();
        System.out.print("card value [1 - 13]: ");
        int value = Integer.parseInt(input.nextLine());
        myCard.setValue(value);
        System.out.printf("card suit %s: ", Arrays.toString(Card.SUITS));
        String suit = input.nextLine();
        myCard.setSuit(suit);
        
        // Check if the card is in the magicHand
        boolean matchFound = false;
        for (Card c : magicHand) {
            if (c.equals(myCard)) {
                matchFound = true;
                break;
            }
        }
        
        // Report the result
        if (matchFound) {
            System.out.println("You won!");
        } else {
            System.out.println("Your lost.");
        }
    }
    
    /**
     * @return a random suit defined in Card.SUITS
     */
    private static String getRandomCardSuit() {
        int i = (int)(Math.random() * 4);
        return Card.SUITS[i];
    }
    
    /**
     * @return a random value from 1 to 13
     */
    private static int getRandomCardValue() {
        return (int)(Math.random() * 13 + 1);
    }
    
}