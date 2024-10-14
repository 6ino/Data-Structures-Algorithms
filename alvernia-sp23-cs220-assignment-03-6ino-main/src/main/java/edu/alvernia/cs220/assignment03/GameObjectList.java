package edu.alvernia.cs220.assignment03;


public interface GameObjectList {

    // Get an entry
    GameObject get(int item);

    GameObject getFirst();

    GameObject getLast();

    int add(GameObject newObj);

    int insert(int item, GameObject newObj);

    GameObject remove(int item);

    boolean clear();

    GameObject findById(int id);

    GameObject findByName(String name);

    void printGameObjects();

    int size();

}
