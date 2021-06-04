/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.exercise1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author steevesm
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Random r =  new Random();
            
            int randSuit = r.nextInt(4);
            int randValue =  r.nextInt(13)+1;
            Card c = new Card();
            c.setValue(randValue);
            c.setSuit(Card.SUITS[randSuit]);
            magicHand[i] = c;
           
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter in Card Value: ");
        String inputValue = in.nextLine();
        int userValue = Integer.parseInt(inputValue);
        System.out.println("Enter in Card Suit: ");
        String inputSuit = in.nextLine();
        
        System.out.println("You chose the " + userValue + " of " + inputSuit);
    
    }
}
