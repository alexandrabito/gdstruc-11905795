package com.alexandrabito;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class CardStack {
    private LinkedList<Card> stack;

    public CardStack() {
        stack = new LinkedList<Card>();
    }

    public void push(Card card) {
        stack.push(card);
    }

    public Card pop() {
        return stack.pop();
    }

    public Card peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    //Print Card Pile
    public void printCardStack() {
        ListIterator<Card> iterator = stack.listIterator();

        System.out.println("Cards in Card Pile: " + "\n");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //Print Card Pile Size
    public void printStackSize()
    {
        System.out.println("Number of cards in pile: " + stack.size());
    }

    public int getCardStackSize()
    {
        return stack.size();
    }

    //Shuffle Deck
    public void shuffleDeck() //Function to Shuffle Cards inside the list
    {
        Collections.shuffle(stack);
    }

}

