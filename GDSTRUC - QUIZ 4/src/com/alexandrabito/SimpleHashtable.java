package com.alexandrabito;

public class SimpleHashtable {
    private StoredPlayer[] hashtable;

    public SimpleHashtable()
    {
        //only ten elements in the beginning
        hashtable = new StoredPlayer[10];
    }

    //hashing key
    private int hashKey(String key)
    {
        // will map key to a value/ integer within 0-10
        // ensures that we are mapping the range our hashtable can handle
        return key.length() % hashtable.length;
    }

    //puts key/player inside hashtable
    public void put(String key, Player value)
    {
        int hashedKey = hashKey(key);

        //check if there is a value inside a specific hash key
        // not null

        if (isOccupied(hashedKey))
        {
            //do linear probing
            int stoppingIndex = hashedKey;

            if (hashedKey == hashtable.length - 1)
            {
                hashedKey = 0;
            }
            else
            {
                hashedKey++;
            }

            while(isOccupied(hashedKey) && hashedKey != stoppingIndex)
            {
                hashedKey =(hashedKey + 1) % hashtable.length;
            }
        }

        if (isOccupied(hashedKey))
        {
            System.out.println("Sorry, there is already an element at position " + hashedKey);
        }
        else
        {
            hashtable[hashedKey] = new StoredPlayer(key, value);
        }

    }

    //function for retrieving
    public Player get(String key)
    {
        int hashedKey = findKey(key);

        if (hashedKey == -1)
        {
            return null;
        }

        return hashtable[hashedKey].value;
    }

    //function to remove player
    public void removePlayer(String key)
    {
        int hashedKey = hashKey(key);

        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key))
        {
            hashtable[hashedKey] = null; //removes element/data
        }

        //do linear probing
        int stoppingIndex = hashedKey;

        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stoppingIndex
                && hashtable[hashedKey] != null
                && !hashtable[hashedKey].key.equals(key))
        {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if (hashtable[hashedKey] != null
                && hashtable[hashedKey].key.equals(key))
        {
            hashtable[hashedKey] = null; //removes element/data
        }
    }

    //finds specific key
    private int findKey(String key)
    {
        int hashedKey = hashKey(key);

        //found right key
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key))
        {
            return hashedKey;
        }

        //do linear probing
        int stoppingIndex = hashedKey;

        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stoppingIndex
                && hashtable[hashedKey] != null
                && !hashtable[hashedKey].key.equals(key))
        {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if (hashtable[hashedKey] != null
                && hashtable[hashedKey].key.equals(key))
        {
            return hashedKey;
        }
        return -1;

    }

    //checks if a space is occupied by an element
    private boolean isOccupied(int index)
    {
        return hashtable[index] != null;
    }

    //prints hashtable
    public void printHashtable()
    {
        for(int i = 0; i < hashtable.length; i++)
        {
            if (hashtable[i] != null)
            {
                System.out.println("Element " + i + " " + hashtable[i].value);
            }
            else
            {
                System.out.println("Element " + i + " null");
            }
        }
    }
}

