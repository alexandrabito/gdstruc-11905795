package com.alexandrabito;

public class Main {

    public static void main(String[] args) {
        Player asuna = new Player(1, "Asuna", 100);
        Player lethalBacon = new Player (2, "LethalBacon", 205);
        Player hpDeskjet = new Player (3, "HPDeskjet", 34);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskjet);

        playerLinkedList.printList();
        playerLinkedList.getSize(); //gets size of list
        playerLinkedList.listContains();// checks list if it contains a player named HPDeskjet
        playerLinkedList.indexOf();// gets index of player with a level greater than 200

        playerLinkedList.deleteElement(); //deletes first element

        System.out.print("\n----------------------------------------------------------------------");
        playerLinkedList.printList();
        playerLinkedList.getSize();
        playerLinkedList.listContains();
    }
}
