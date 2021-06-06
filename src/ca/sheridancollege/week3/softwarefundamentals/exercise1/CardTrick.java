/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.exercise1;

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
        
        // Create a hard-coded luckyCard
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit(Card.SUITS[0]);
        
        // Check if the card is in the magicHand
        boolean matchFound = false;
        for (Card c : magicHand) {
            if (c.equals(luckyCard)) {
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
        System.out.printf("Your card was: %s.%n", luckyCard.toString());
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
