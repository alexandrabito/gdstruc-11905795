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
    public void getSize()
    {
        int size = 0;
        PlayerNode count = head;

       while (count != null)
       {
           size++;
           count = count.getNextPlayer();
       }

      System.out.print("List Size: " + size);

    }

    //Create a CONTAINS() and INDEXOF() similar to ArrayList

    public void listContains()
    {
        //Look if the list contains player with the name HPDeskjet

        boolean target = false;
        PlayerNode count = head;

        while (count != null && !target)
        {
            if(count.getPlayer().getName() == "HPDeskjet")
            {
                target = true;
                break;
            }
            else
            {
                count = count.getNextPlayer();
            }
        }

        System.out.print("\nDoes the list have a player named HPDeskjet?: " + target);

    }

    public void indexOf()
    {
        //Occurence of a player with level 205 and up

        int index = 0;
        PlayerNode count = head;

        while (count != null)
        {
            if (count.getPlayer().getLevel() >= 200)
            {
                index++;
                break;
            }

            index++;
            count = count.getNextPlayer();
        }

        System.out.print("\nWhich player has a level greater or equal to 200?: " + index);


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
