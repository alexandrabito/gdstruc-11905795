package com.alexandrabito;

public class PlayerLinkedList {
    private PlayerNode head;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    //Create a FUNCTION that removes the first element
    public void deleteElement()
    {
        PlayerNode temp = head;
        head = head.getNextPlayer();
        temp = null;
    }

    //Create a size variable that determines how many elements are present in your Linked List
    public int getSize()
    {
        int size = 0;
        PlayerNode count = head;

       while (count != null)
       {
           size++;
           count = count.getNextPlayer();
       }
        return size;
    }

    //Create a CONTAINS() and INDEXOF() similar to ArrayList
    public boolean listContains(Player player)
    {
        //Look if the list contains player with the name HPDeskjet
        boolean target = false;
        PlayerNode count = head;

        while (count != null)
        {
            if(count.getPlayer().getName() == player.getName())
            {
                target = true;
                break;
            }
            else
            {
                count = count.getNextPlayer();
            }
        }
        return target;
    }

    public int indexOf(Player player)
    {
        //Occurrence of a player with level 205
        int index = 0;
        PlayerNode count = head;

        while (count != null)
        {
            if (count.getPlayer().getName() == player.getName())
            {
                index++;
                break;
            }

            index++;
            count = count.getNextPlayer();
        }
        return index;
    }

    public void printList() {
        PlayerNode current = head;
        System.out.print("\nHead ->");
        while (current != null) {
            System.out.print(" ID: " + current.getPlayer().getId() + ", Name: " + current.getPlayer().getName() +
                    ", Level: " + current.getPlayer().getLevel());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }
}
