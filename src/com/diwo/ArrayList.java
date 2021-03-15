package com.diwo;

/**
 * Your implementation of an ArrayList.
 */
public class ArrayList<T> {

    /*
     * The initial capacity of the ArrayList.
     *
     * DO NOT MODIFY THIS VARIABLE!
     */
    public static final int INITIAL_CAPACITY = 9;

    /*
     * Do not add new instance variables or modify existing ones.
     */
    private T[] backingArray;
    private int size;

    /**
     * This is the constructor that constructs a new ArrayList.
     *
     * Recall that Java does not allow for regular generic array creation,
     * so instead we cast an Object[] to a T[] to get the generic typing.
     */
    public ArrayList() {
        //DO NOT MODIFY THIS METHOD!
        backingArray = (T[]) new Object[INITIAL_CAPACITY];
    }

    public void printt() {
        for (int i =0 ; i < size ; i++){
            System.out.println(this.backingArray[i]);
        }
    }

    /**
     * Adds the data to the front of the list.
     *
     * This add may require elements to be shifted.
     *
     * Method should run in O(n) time.
     *
     * @param data the data to add to the front of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToFront(T data) {
        //Deciding to double the size of array or not
        //TODO: Send null and replace .equals with ==
        if (data.equals(null)){
            throw new java.lang.IllegalArgumentException();
        }
        T[] tempArray = this.backingArray;
        if(this.backingArray.length < this.size+1){
            tempArray = this.backingArray;
        }else{
            int newSize = this.backingArray.length * 2;
            tempArray = (T[]) new Object[newSize];
        }

        //Transfer the elements
        tempArray[0] = data;
        for (int i = 1 ; i <= this.size ; i++){
                tempArray[i] = this.backingArray[i-1];
            }
        this.backingArray = tempArray;

        this.size = size + 1;


        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
    }


    /**
     * Adds the data to the back of the list.
     *
     * Method should run in amortized O(1) time.
     *
     * @param data the data to add to the back of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToBack(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
    }

    /**
     * Removes and returns the first data of the list.
     *
     * Do not shrink the backing array.
     *
     * This remove may require elements to be shifted.
     *
     * Method should run in O(n) time.
     *
     * @return the data formerly located at the front of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromFront() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if(this.backingArray.length <= 0){
            throw new java.util.NoSuchElementException();
        }
        T[] tempArray = this.backingArray;
        T removedElement = this.backingArray[0];
        for (int i = 0 ; i < this.size ; i++){
            this.backingArray[i] = tempArray[i+1];
        }
        return removedElement;
    }

    /**
     * Removes and returns the last data of the list.
     *
     * Do not shrink the backing array.
     *
     * Method should run in O(1) time.
     *
     * @return the data formerly located at the back of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromBack() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if(this.size <= 0){
            throw new java.util.NoSuchElementException();
        }

        T removedElement = this.backingArray[size-1];
        this.backingArray[size-1] = null;
        this.size -= 1;
        return removedElement;
    }

    /**
     * Returns the backing array of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the backing array of the list
     */
    public T[] getBackingArray() {
        // DO NOT MODIFY THIS METHOD!
        return backingArray;
    }

    /**
     * Returns the size of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the size of the list
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }
}