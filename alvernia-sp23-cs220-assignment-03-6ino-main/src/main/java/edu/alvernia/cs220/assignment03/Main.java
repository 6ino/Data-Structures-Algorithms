package edu.alvernia.cs220.assignment03;

import edu.alvernia.cs220.assignment03.impl.GameObjectArrayList;
import edu.alvernia.cs220.assignment03.impl.GameObjectLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Assignment 03: Demonstrating a Linked List");
        System.out.println("Select which list you want to use");
        System.out.println("1. GameObjectArrayList");
        System.out.println("2. GameObjectLinkedList");
        System.out.print("Enter a selection: ");
        int selection = scanner.nextInt();

        GameObjectList gameObjectList = null;
        if (selection == 1) {
            gameObjectList = new GameObjectArrayList();
        }
        else if (selection == 2){
            gameObjectList = new GameObjectLinkedList();
        }

        System.out.println("Enter the items");

        String entry = "";
        do {
            System.out.print("Enter an item name (enter quit to exit): ");
            entry = scanner.next();
            if (!"quit".equalsIgnoreCase(entry)) {
                gameObjectList.add(new GameObject(entry));
            }
        } while (!"quit".equalsIgnoreCase(entry));

        System.out.println("The list of objects entered:");
        gameObjectList.printGameObjects();
    }
}
