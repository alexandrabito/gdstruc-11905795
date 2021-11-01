package com.alexandrabito;

public class Node {
    //field for values
    private int data;
    //each node can have zero, one or two nodes
    private Node rightChild;
    private Node leftChild;

    public void insert(int value)
    {
        if (value ==  data) //duplicate data or value
        {
            return;
        }

        if(value < data)
        {
            if (leftChild == null)
            {
                leftChild = new Node(value);
            }
            else
            {
                leftChild.insert(value);
            }
        }
        else
        {
            if (rightChild == null)
            {
                rightChild = new Node(value);
            }
            else
            {
                rightChild.insert(value);
            }
        }

    }

    //in-order traversal
    public void traverseInOrder()
    {
        if(leftChild != null)
        {
            leftChild.traverseInOrder();
        }
        System.out.println("Data: " + data);

        if(rightChild != null)
        {
            rightChild.traverseInOrder();
        }
    }

    //get
    public Node get(int value)
    {
        if (value == data)
        {
            return this;
        }

        if (value < data)
        {
            if (leftChild != null)
            {
                return leftChild.get(value);
            }
        }
        else
        {
            if (rightChild != null)
            {
                return rightChild.get(value);
            }
        }

        return null;
    }

    //in-order traversal in descending order
    public void traverseInOrderDescending()
    {
        if(rightChild != null) //checks right child first to print in descending order
        {
            rightChild.traverseInOrderDescending();
        }
        System.out.println("Data: " + data);

        if(leftChild != null)
        {
            leftChild.traverseInOrderDescending();
        }
    }

    //looks for minimum value in the tree
    public Node getMin(Node temp)
    {
        Node currentMin = temp; //placeholder

        //searches through the tree to find the least value
        while (currentMin.leftChild != null)
        {
            currentMin = currentMin.leftChild;
        }
        System.out.println("Minimum Value: " + currentMin);
        return currentMin;
    }

    //looks for maximum value in the tree
    public Node getMax(Node temp)
    {
        Node currentMax = temp; //placeholder

        //searches through the tree to find the maximum value
        while (currentMax.rightChild != null)
        {
            currentMax = currentMax.rightChild;
        }
        System.out.println("Maximum Value: " + currentMax);
        return currentMax;
    }

    public Node(int _data)
    {
        this.data = _data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
