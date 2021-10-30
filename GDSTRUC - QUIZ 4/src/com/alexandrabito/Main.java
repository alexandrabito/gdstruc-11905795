package com.alexandrabito;

public class Main {

    public static void main(String[] args) {
        Player ploo = new Player(134, "Plooful", 135);
        Player wardell = new Player(536, "TSM Wardell", 648);
        Player deadlyJimmy = new Player (32, "DeadlyJimmy", 34);
        Player subroza = new Player (4931, "Subroza", 684);
        Player annieDro = new Player( 6919, "C9 Annie", 593);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(ploo.getUserName(), ploo);
        hashtable.put(wardell.getUserName(), wardell);
        hashtable.put(deadlyJimmy.getUserName(), deadlyJimmy);
        hashtable.put(subroza.getUserName(), subroza);
        hashtable.put(annieDro.getUserName(), annieDro);

        System.out.println("List of Players:");
        hashtable.printHashtable();

        System.out.println("\nRemoved player DeadlyJimmy");
        hashtable.removePlayer("DeadlyJimmy");
        System.out.println("\n");

        System.out.println("Revised List of Players:");
        hashtable.printHashtable();

        System.out.println("\nRemoved player Plooful");
        hashtable.removePlayer("Plooful");
        System.out.println("\n");

        System.out.println("Revised List of Players:");
        hashtable.printHashtable();
    }
}
