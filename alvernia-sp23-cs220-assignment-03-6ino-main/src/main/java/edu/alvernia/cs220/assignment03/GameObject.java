package edu.alvernia.cs220.assignment03;

public class GameObject {

    static public int idCounter = 0;

    private int objectId = 0;

    private String name;

    public GameObject(String objName) {
        idCounter++;
        this.name = objName;
        this.objectId = idCounter;
    }


    public String getName() {
        return this.name;
    }

    public int getObjectId() {
        return this.objectId;
    }

    @Override
    public String toString() {
        return "GameObject[" + this.name + "]";
    }



}
