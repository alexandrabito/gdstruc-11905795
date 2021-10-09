package com.alexandrabito;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // INSTRUCTIONS: Every turn, x players will queue for matchmaking (x= rand() 1 to 7).
        //Pressing enter ends the turn
        // A game can be started when at least 5 players are in the queue.
        // When a game starts, pop the first 5 players from the queue
        // Program terminates when 10 games have been successfully made.

        ArrayQueue playerList = new ArrayQueue(65);
        ArrayQueue playerQueue = new ArrayQueue(7);
        int games = 1;
        Random rand = new Random();

        //For loop to create 65 players
        for (int i = 1; i < 100; i++) {
            playerList.add(new Player(i, "Player " + i));
        }

        while (games <= 10) //while there are less than 10 games created
        {
            if(games == 10)
            {
                System.out.println("There are no more games available");
            }

            //Queueing players
            int matchmaking = rand.nextInt(7) + 1;

            System.out.println("Players in Queue: ");
            for (int i = 0; i <= matchmaking; i++)
            {
                playerQueue.add(playerList.remove());
            }

            playerQueue.printQueue();
            promptEnterKey();

            //If queue size has reached at least five players
            if (playerQueue.size() >= 5)
            {
                System.out.println("Game " + games + " has started\n");
                for(int i = 1; i <= 5; i++)
                {
                    playerQueue.remove();
                }
                games++;
                promptEnterKey();
            }
        }

    }

    public static void promptEnterKey(){
        System.out.println("Press \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
