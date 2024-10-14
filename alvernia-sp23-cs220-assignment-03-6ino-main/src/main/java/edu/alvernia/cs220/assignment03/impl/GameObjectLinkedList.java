package edu.alvernia.cs220.assignment03.impl;

import edu.alvernia.cs220.assignment03.GameObject;
import edu.alvernia.cs220.assignment03.GameObjectList;

/**
 * The Linked List implementation of our 'GameObjectList', this version should
 * use pointers to navigate, append, and insert items into the list.
 *
 * To help with the operations of the linked list. A 'node' class should be
 * added which will 'hold' the value of the entry, and then maintain pointers
 * for the 'next' value, and the 'previous' value.
 */
public class GameObjectLinkedList implements GameObjectList {

    /**
     * These are the initial values you will need for the implementation.
     * The numberOfRecords should be incremented, and decremented each time
     * a new record is added or removed. This is needed since we are not
     * using an array to store values.
     */
    int numberOfRecords = 0;
    /**
     * The headPointer is the start of the list, and should always be the
     * first entry. The tailPointer is the last item in the list, and should
     * be updated everytime a new value is appended to the end of the list.
     * The headPointer should only be updated if the list is empty (null),
     * or a new value is inserted at the beginning of the list.
     */
//    ListNode headPointer = null;
//    ListNode tailPointer = null;

    /**
     * Constructor: No special processing needed.
     */
    public GameObjectLinkedList() {}

    /**
     * Will append the Linked List with the newObj variable being passed in.
     * If headPointer is null, that means the list is empty so headPointer and
     * tailPointer will point to the same object. Each time a new object is
     * added, the tailPointer.nextPointer will be updated to point to the new
     * GameObject being passed in, then tailPointer should be updated to
     * point to the new object. This method should increment the numberOfRecords.
     *
     * @param newObj
     * @return
     */
    @Override
    public int add(GameObject newObj) {
        return 0;
    }

    /**
     * Will return the GameObject at the location specified by item, in this case,
     * if item is 0, the first entry of the list will be returned as it is zero
     * indexed. If a negative value is passed, or a value exceeding the number
     * of existing entries, then null should be returned.
     *
     * Hint: To traverse the linked list, the following code can be used.
     *
     * ListNode currentPointer = headPointer;
     * for (int i = 0; i < item; i++) {
     *     currentPointer = currentPointer.nextPointer;
     * }
     *
     * @param item The entry in the list to return
     * @return The entry in the list
     */
    @Override
    public GameObject get(int item) {
        return null;
    }

    /**
     * Will return the GameObject being held by the 'headPointer'.
     *
     * @return The first GameObject in the list
     */
    @Override
    public GameObject getFirst() {
        return null;
    }

    /**
     * Will return the GameObject being held by the 'tailPointer'
     *
     * @return The last GameObject in the list
     */
    @Override
    public GameObject getLast() {
        return null;
    }

    /**
     * Will insert a new GameObject at the location of the item value. If item is negative,
     * then insert it at the beginning of the list, if the value of item exceeds the number
     * of entries, then insert the newObj at the end of the list.
     *
     * Hint: See previous examples of traversing through the linked list.
     *
     * @param item The position where to insert
     * @param newObj The new GameObject to insert
     * @return The number of items currently in the list
     */
    @Override
    public int insert(int item, GameObject newObj) {
        return 0;
    }

    /**
     * Will remove the GameObject from the list, and return the object that has been
     * removed. This will be accomplished by traversing to the location mentioned, and
     * then resetting the nextPointer of the previous item in the list, and the previousPointer
     * of the item after the object to remove to each other, effectively cutting out the
     * target node from the chain.
     *
     * Hint: Use previous for-loop example for navigating the list to the item to remove
     *
     * @param item The location of the item to remove in the list
     * @return The GameObject being removed.
     */
    @Override
    public GameObject remove(int item) {
        return null;
    }

    /**
     * Will clear the current list, resetting the headPointer and tailPointer to be null,
     * and resetting the numberOfRecords to 0. This will then also need to reset the id counter
     * by using the following code:
     *
     * GameObject.idCounter = 0;
     *
     * @return Should always return true
     */
    @Override
    public boolean clear() {
        return false;
    }

    /**
     * Will search the list of objects attempting to match the ID, and if matched,
     * then that entry should be returned first. If all records in the list are
     * do not match the ID, then null should be returned.
     * Hint: A for loop and if statement will be used to iterate over the list
     * and attempt to do the match.
     *
     * @param id The ID of the GameObject being searched for
     * @return The GameObject from the list matching the ID
     */
    @Override
    public GameObject findById(int id) {
        return null;
    }

    /**
     * Will search the list of objects, and attempt to match an object in the list
     * by name. A while should be used to iterate over each object in the list,
     * and the 'equalsIgnoreCase' string function should be used to attempt to match
     * the name. If no value is found, then return null.
     *
     * @param name The name of the object to match
     * @return The matched game object
     */
    @Override
    public GameObject findByName(String name) {
        return null;
    }

    /**
     * A convenience method that should be used to print out the GameObjects in the list.
     * Should be used for debugging as you are making your changed. A for-loop can be used
     * to iterate over the list and print out each object.
     */
    @Override
    public void printGameObjects() {

    }

    /**
     * Will return the current size of the list, which should just be the value of
     * numberOfRecords
     * @return The current length of the list
     */
    @Override
    public int size() {
        return 0;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
