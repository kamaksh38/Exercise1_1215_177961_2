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
 * @author dancye
 * @modifiedBy Matthew Steeves
 * Student Number: 991351367
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        for (int i=0; i<magicHand.length; i++)
        {
            Random r =  new Random();
            
            int randSuit = r.nextInt(4);
            int randValue =  r.nextInt(13)+1; //Need to use +1 to stop 0 from being an outcome
            Card c = new Card();
            c.setValue(randValue);
            c.setSuit(Card.SUITS[randSuit]);
            magicHand[i] = c;
           
        }
        
        //Creating a lucky card and assigning it values
        Card luckyCard = new Card();
        luckyCard.setValue(10);
        luckyCard.setSuit("Hearts");
        
        /*For loop to check if the value and suit of the luckycard
        matches any of the cards in the hand array*/
        int result = 0;
        for(int i=0;i<magicHand.length;i++){
            if((luckyCard.getValue() == magicHand[i].getValue()) && (luckyCard.getSuit() == magicHand[i].getSuit())){
                result = 1;
            }
        }
        
        //Prints result based on outcome
        if(result == 1){
            System.out.println("You Won!");
        } else {
            System.out.println("You Lost!");
        }
        
    }
}
