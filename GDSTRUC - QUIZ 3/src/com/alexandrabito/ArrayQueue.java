package com.alexandrabito;

import java.util.Collections;
import java.util.NoSuchElementException;

public class ArrayQueue {
    private Player[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity)
    {
        queue = new Player[capacity];
    }

    public void add(Player player) //enqueue
    {
        if (back == queue.length)
        {
            // resizes the array when full
            Player[] newArray = new Player[queue.length * 2];
            System.arraycopy(queue, 0, newArray, 0 , queue.length);
            queue = newArray;
        }

        queue[back] = player;
        back++;
    }

    public Player remove()
    {
        if(size() == 0)
        {
            throw new NoSuchElementException();
        }

        Player removedPlayer = queue[front];
        queue[front] = null;
        front++;

        if (size() == 0) //resets trackers when queue is empty
        {
            front = 0;
            back = 0;
        }

        return removedPlayer;
    }

    public Player peek() //access first element infront of queue
    {
        if (size() == 0)
        {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    //check if queue is currently empty
    public int size()
    {
        return back - front; //returns size of queue
    }


    public void printQueue()
    {
        for (int i = front; i < back; i++)
        {
            System.out.println(queue[i]);
        }
    }
}
