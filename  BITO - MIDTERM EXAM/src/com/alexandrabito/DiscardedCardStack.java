package com.alexandrabito;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class DiscardedCardStack {
    private LinkedList<Card> discardedStack;

    public DiscardedCardStack() { discardedStack = new LinkedList<Card>(); }

    public void push(Card card)
    {
        discardedStack.push(card);
    }

    public Card pop()
    {
        return discardedStack.pop();
    }

    public Card peek()
    {
        return discardedStack.peek();
    }

    public boolean isEmpty()
    {
        return discardedStack.isEmpty();
    }

    //Prints discarded pile
    public void printDiscardedCardStack()
    {
        ListIterator<Card> iterator = discardedStack.listIterator();

        System.out.println("Cards in Discarded Pile: " + "\n");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

    //Print Discarded Pile Size
    public void printDiscardedStackSize()
    {
        System.out.println("Number of cards in discarded pile: " + discardedStack.size());
    }

    public int getDiscardedStackSize()
    {
        return discardedStack.size();
    }

}
