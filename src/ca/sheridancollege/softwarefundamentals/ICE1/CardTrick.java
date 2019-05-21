/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.softwarefundamentals.ice1;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * modified by khushpreet kaur and student number 991551270
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
       
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13 + 1));
            //c.setValue(insert call to random number generator here)
            c.setSuit(Card.SUITS[(int)(Math.random() * 3 + 0)]);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter the card value and suit");
        int ca = input.nextInt();
        String s = input.nextLine();
        // and search magicHand here
         for (int i=0; i<magicHand.length; i++)
        {
           if(magicHand[i].getValue() == ca && magicHand[i].getSuit() == s){
              System.out.println("You are lucky this time");
           }
           else
            System.out.println("Sorry, try again");
           }
           }
        }
       
      
        Cars luckyCard = new Card();
        luckyCard.setValue = 7;

           System.out.println("Enter the lucky card value");
           int l = input.nextInt();
        // and search magicHand here
          for (int i=0; i<magicHand.length; i++)
        {
           if(luckyCard[i].getValue() == l){

              System.out.println("You are lucky this time");
           }
           else
            System.out.println("Sorry, try again");
           }
           }
        }      
    }
    
}
