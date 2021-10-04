package com.alexandrabito;

import java.util.LinkedList;
import java.util.ListIterator;

public class PlayerHand {
    private LinkedList<Card> playerHand;

    public PlayerHand() {
        playerHand = new LinkedList<Card>();
    }

    public void push(Card card) {
        playerHand.push(card);
    }

    public Card pop() {
        return playerHand.pop();
    }

    public Card peek() {
        return playerHand.peek();
    }


    public boolean isEmpty() {
        return playerHand.isEmpty();
    }

    //Print Player's Hand
    public void printPlayerHand() {
        ListIterator<Card> iterator = playerHand.listIterator();

        System.out.println("Cards in Player's hand: " + "\n");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //Print Player Hand Size
    public void printPlayerHandSize()
    {
        System.out.println("Number of cards on player's hand: " + playerHand.size());
    }

    public int getPlayerHandSize()
    {
        return playerHand.size();
    }
}
