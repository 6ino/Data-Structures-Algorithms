# Assignment 03
### alvernia-sp23-cs220-assignment-03

In this assignment, you will implement two List structures using the _GameObjectList_ interface. The operations that will need to be implemented for each structure are as follows: 

- get(int item)
- getFirst()
- getLast()
- add(GameObject newObj)
- insert(int item, GameObject newObj)
- remove(int item)
- clear()
- findById(int id)
- findByName(String name)
- printGameObjects()
- size()

These methods will need to be implemented in both the _GameObjectArrayList_ and the _GameObjectLinkedList_ methods, which have already been generated and provided to you in the _impl_ folder in the project.

## Constructing a Linked List Using Arrays

The first structure being implemented is an ArrayList, in the provided class _GameObjectArrayList_. Each time an item is added to the list, or an item is removed from the list, the underlying array (objects) should be resized, and the items from the previous list copied in.

To allocate an array, the following code can be used: 

```
int NEW_ARRAY_SIZE = 3;
GameObject[] temporaryArray = new GameObject[NEW_ARRAY_SIZE];
```

Then the array the objects variable can be reset to the new array: 
```
objects = temporaryArray;
```

To do the cloning operation of the array, the following for-loop construct can be used:

```
GameObject[] temporaryArray = new GameObject[objects.length];
for (int i = 0; i < objects.length; i++) {
    temporaryArray[i] = objects[i];
}
```

Please note, the implementations for add, remove, and insert will not be this easy. This is a direct clone of the array, and in your programs, you will need to change the size of the array: 

```
int newLength = objects.length + 1;
GameObject[] temporaryArray = new GameObject[newLength];
```

Read the documentation for each method. The _GameObjectArrayListTest_ class can be executed to validate each method as you implement. To make things easy, your first method to implement should be _add_, and then _get_. From there, you should have an easier time building this class.

## Constructing a Linked List

The Linked List implementation of the List is done in the _GameObjectLinkedList_ class. To make implementation easier, a new class should be added, _ListNode_, which will contain the object you are pointing to, and fields for _nextPointer_ and _previousPointer_. Follow the comments for each method, and the hints that are there. As with the previous Array List implementation, it would be easier to complete the _add_ and _get_ methods first, then work on the remaining.