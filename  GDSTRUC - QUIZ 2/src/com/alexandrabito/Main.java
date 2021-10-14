package com.alexandrabito;

public class Main {

    public static void main(String[] args) {
        Player heathcliff = new Player(1, "Heathcliff", 155);
        Player asuna = new Player(2, "Asuna", 100);
        Player lethalBacon = new Player (3, "LethalBacon", 205);
        Player hpDeskjet = new Player (4, "HPDeskjet", 34);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        //Prints players
        playerLinkedList.addToFront(heathcliff);
        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskjet);


        playerLinkedList.printList();
        System.out.print("List Size: " + playerLinkedList.getSize());
        System.out.print("\nDoes the list have a player named HPDeskjet?: " + playerLinkedList.listContains(hpDeskjet));
        System.out.print("\nWhich index is LethalBacon located: " + playerLinkedList.indexOf(lethalBacon));
        playerLinkedList.deleteElement();

        System.out.print("\n----------------------------------------------------------------------");
        playerLinkedList.printList();

        System.out.print("List Size: " + playerLinkedList.getSize());
        System.out.print("\nDoes the list have a player named HPDeskjet?: " + playerLinkedList.listContains(hpDeskjet));
        System.out.print("\nWhich index is LethalBacon located: " + playerLinkedList.indexOf(lethalBacon));
    }
}
