package edu.alvernia.cs220.assignment03.impl;

import edu.alvernia.cs220.assignment03.GameObject;
import edu.alvernia.cs220.assignment03.GameObjectList;

public class GameObjectArrayList implements GameObjectList {

    /**
     * The variable objects is where the items of your list will
     * be stored. Each time a new GameObject is added to the list,
     * the items in this array should be copied to a new temporary
     * array, with the new GameObject being inserted. If an item is
     * removed, then the say process should occur, just reduced in
     * size, excluded the removed item.
     */
    GameObject[] objects = new GameObject[0];

    public GameObjectArrayList() {}

    /**
     * Method will return the GameObject that is located in the 0-based
     * index item. This method should return the direct item from the
     * 'objects' array. If the value of item is negative, then the method
     * should return null, or if item is greater than the length of the
     * array, then null should be returned as well.
     *
     * @param item The entry number in the list to return, 0 based index
     * @return the GameObject at the position of item
     */
    @Override
    public GameObject get(int item) {

        return null;
    }

    /**
     * Will retrieve and return the 'First' item in the list. In this
     * implementation, the first item in the list should be objects[0].
     * If the number of objects that currently exists in the list is 0,
     * then null should be returned.
     *
     * @return The first GameObject in the list
     */
    @Override
    public GameObject getFirst() {
        return null;
    }

    /**
     * Will retrieve and return the 'Last' item in the list. In this
     * implementation, the last item in the list should reference
     * objects[objects.length - 1]. If the number of objects that exist
     * in the list is 0, then null should be returned.
     *
     * @return
     */
    @Override
    public GameObject getLast() {
        return null;
    }

    /**
     * The 'add' method will append the 'newObj' variable to the
     * end of the list. In this implementation, the objects array
     * should be copied to a temporary array that is allocated as
     * one longer than the current 'objects' array, and the newObj
     * variable should be assigned to the last entry of the array.
     * This method will return an integer, which is the current
     * length of the objects array after the new GameObject is
     * added.
     *
     * Hint: A for-loop should be used to copy each item in the array
     * to the new temporary array.
     *
     * @param newObj The object to add to the list
     * @return the current length of the array after newObj is added
     */
    @Override
    public int add(GameObject newObj) {
        return 0;
    }

    /**
     * The 'insert' method will insert the new GameObject (newObj) into
     * the list at the position passed in item. If a negative value for
     * item is passed, then the new GameObject should be inserted at the
     * beginning of the list. If the value of item exceeds the number of
     * entries in the list currently, then the new GameObject should be
     * appended to the end of the list. The method should return the
     * number of items currently in the list after the insertion occurs.
     *
     * @param item The location where the new object should be inserted
     * @param newObj The new GameObject to insert
     * @return The number of items in the list after the insert
     */
    @Override
    public int insert(int item, GameObject newObj) {
        return 0;
    }

    /**
     * Will remove an object from the list at the same position as 'item'.
     * This operation will create a temporary array that is one entry
     * smaller than the current objects array, and exclude the entry at the
     * item position. The return value will be the GameObject that was
     * removed from the list. If the value of item is negative, or exceeds
     * the number of items in the list, then null should be returned.
     *
     * @param item The entry in the list to remove
     * @return The GameObject returned from the list
     */
    @Override
    public GameObject remove(int item) {
        return null;
    }

    /**
     * Will reset the objects variable to be a 0 initialized array, effectively
     * clearing out all of the items currently in the array. This method will also
     * need to reset the GameObjects counter, which can be done with the following
     * line: GameObjects.idCounter = 0;
     *
     * @return true of the reset was successful (should always be true)
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
     * by name. A for-loop should be used to iterate over each object in the list,
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
     * objects.length
     * @return The current length of the list
     */
    @Override
    public int size() {
        return 0;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
