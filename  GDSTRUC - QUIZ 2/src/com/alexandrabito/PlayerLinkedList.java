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
        boolean target = false;
        PlayerNode current = head;

        while (current != null)
        {
            if(current.getPlayer().equals(player))
            {
                target = true;
                break;
            }
            else
            {
                current = current.getNextPlayer();
            }
        }
        return target;
    }

    public int indexOf(Player player)
    {
        int index = 0;
        PlayerNode current = head;

        while (current != null)
        {
            if (current.getPlayer().equals(player))
            {
                index++;
                break;
            }
            index++;
            current = current.getNextPlayer();
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
