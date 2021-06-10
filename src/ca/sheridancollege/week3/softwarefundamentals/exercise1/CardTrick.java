/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.exercise1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Kamaksh Dave 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
              magicHand[i].setValue((int)(Math.random() * 13) + 1); 
              magicHand[i].setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
      //  Scanner sc = new Scanner(System.in);
        //System.out.print("Pick a card (value & suit): ");
        //String pickedCard = sc.nextLine();
        //System.out.println(pickedCard);
        //Then report the result here
        Card lcard = new Card();
        lcard.setValue(10);
        lcard.setSuit("Hearts");
        int finalresult = 0;
        for(int i=0;i<magicHand.length;i++){
            if((lcard.getValue() == magicHand[i].getValue()) && (lcard.getSuit() == magicHand[i].getSuit())){
                finalresult = 1;
            }
        }
        
        //Prints result based on outcome
        if(finalresult == 1){
            System.out.println("You Won!");
        } else {
            System.out.println("You Lost!");
        }
    }
    
}
