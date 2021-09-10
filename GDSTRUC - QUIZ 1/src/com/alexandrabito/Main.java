package com.alexandrabito;

public class Main {

    public static void main(String[] args) {

        //Array
        int[] numbers = new int[10];

        numbers[0] = 42;
        numbers[1] = 5;
        numbers[2] = 17;
        numbers[3] = 10;
        numbers[4] = 180;
        numbers[5] = -55;
        numbers[6] = 8;
        numbers[7] = 125;
        numbers[8] = -19;
        numbers[9] = 30;

        System.out.println("Before Sorting: ");
        printArrayElements(numbers);

        selectionSort(numbers);

        System.out.println("\n\nAfter Sorting: ");
        printArrayElements(numbers);

    }

    //Modify the BubbleSort and SelectionSort to sort arrays in descending order
    private static void bubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length -1; lastSortedIndex > 0; lastSortedIndex --)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i+1]) //Changed > (greater than) to <(less than) to sort the numbers in descending order
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    //Modify the SelectionSort to sort arrays in descending order; Look for smallest value and put it at the end
    private static void selectionSort(int[] arr)
    {
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0; //placeholder for smallest value

            for (int i = 1; i <= lastSortedIndex; i++) //will scan through the entire array
            {

                if (arr[i] < arr[smallestIndex]) // compares values; gets smallest index
                {
                    smallestIndex = i;
                }
            }
            int temp = arr[lastSortedIndex]; //copies the value of the last sorted index;
            arr[lastSortedIndex] = arr[smallestIndex]; //places the smallest index at the end of the list; values switch places
            arr[smallestIndex] = temp; //

        }
    }

    private static void printArrayElements(int[] arr)
    {
        for (int j : arr)
        {
            System.out.print(j + " ");
        }
    }
}
