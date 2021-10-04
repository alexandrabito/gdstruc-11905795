package com.alexandrabito;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Initializing Card Stack
        CardStack stack = new CardStack();

        //Total of 30 cards; 5 suits with 5 different values
        stack.push(new Card(1, "Ace", 1));
        stack.push(new Card(1, "Ace", 2));
        stack.push(new Card(1, "Ace", 3));
        stack.push(new Card(1, "Ace", 4));
        stack.push(new Card(1, "Ace", 5));
        stack.push(new Card(1, "Ace", 6));

        stack.push(new Card(2, "Spade", 1));
        stack.push(new Card(2, "Spade", 2));
        stack.push(new Card(2, "Spade", 3));
        stack.push(new Card(2, "Spade", 4));
        stack.push(new Card(2, "Spade", 5));
        stack.push(new Card(2, "Spade", 6));

        stack.push(new Card(3, "Clubs", 1));
        stack.push(new Card(3, "Clubs", 2));
        stack.push(new Card(3, "Clubs", 3));
        stack.push(new Card(3, "Clubs", 4));
        stack.push(new Card(3, "Clubs", 5));
        stack.push(new Card(3, "Clubs", 6));

        stack.push(new Card(4, "Diamonds", 1));
        stack.push(new Card(4, "Diamonds", 2));
        stack.push(new Card(4, "Diamonds", 3));
        stack.push(new Card(4, "Diamonds", 4));
        stack.push(new Card(4, "Diamonds", 5));
        stack.push(new Card(4, "Diamonds", 6));

        stack.push(new Card(5, "Joker", 1));
        stack.push(new Card(5, "Joker", 2));
        stack.push(new Card(5, "Joker", 3));
        stack.push(new Card(5, "Joker", 4));
        stack.push(new Card(5, "Joker", 5));
        stack.push(new Card(5, "Joker", 6));

        //Shuffles cards to randomize pile
        stack.shuffleDeck();

        //Initializing player hand and discarded pile as new stack
        PlayerHand playerHand = new PlayerHand();
        DiscardedCardStack discardedStack = new DiscardedCardStack();

        //Randomizer for random commands
        Random random = new Random(0);

        while (!stack.isEmpty()) //When card pile is not empty
        {
            int randomNumber = random.nextInt(3) + 1; //randomizer for commands
            //1:Draw card/s, 2: Discard card/s, 3: Get from discarded

            if (randomNumber == 1) //Draw 'x' amount of cards
            {
                System.out.println("Player drew a card/s from the deck \n");
                if (!stack.isEmpty())
                {
                    int drawCardsAmount = random.nextInt(5 - 1) + 1; //random number generator
                    for (int i = 0; i <= drawCardsAmount; i++)
                    {
                        playerHand.push(stack.pop()); //Puts cards in player's hand
                        if (stack.getCardStackSize() == 0)
                        {
                            System.out.println("Card Pile is now empty. Player is unable to continue drawing a card.");
                        }
                    }
                }
            }
            else if (randomNumber == 2) //Discard 'x' amount of cards
            {
                System.out.println("Player discarded card/s from hand \n");
                if (!playerHand.isEmpty())
                {
                    int maxDiscarded = playerHand.getPlayerHandSize(); //maximum number of player hand
                    int discardCardsAmount = random.nextInt(maxDiscarded);

                    for (int i = 0; i <= discardCardsAmount; i++)
                    {
                        discardedStack.push(playerHand.pop());
                    }
                }
            }
            else if (randomNumber == 3) //Get 'x' amount of cards from discarded pile
            {
                System.out.println("Player drew card/s from discarded pile \n");
                if (!discardedStack.isEmpty())
                {
                    if (discardedStack.getDiscardedStackSize() > 0)
                    {
                        int maxDrawFromDiscard = discardedStack.getDiscardedStackSize(); // maximum number of discarded pile
                        int drawDiscardPile = random.nextInt(maxDrawFromDiscard);

                        for (int i = 0; i <= drawDiscardPile; i++)
                        {
                            playerHand.push(discardedStack.pop());
                        }
                    }
                }
            }
            //Prints size of piles(card pile, player hand, discarded pile)
            stack.printStackSize();
            playerHand.printPlayerHandSize();
            discardedStack.printDiscardedStackSize();
            System.out.println("\n");
        }
    }
}
