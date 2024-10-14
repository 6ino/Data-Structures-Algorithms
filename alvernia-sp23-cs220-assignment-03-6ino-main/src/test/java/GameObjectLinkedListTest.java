import edu.alvernia.cs220.assignment03.GameObject;
import edu.alvernia.cs220.assignment03.GameObjectList;
import edu.alvernia.cs220.assignment03.impl.GameObjectLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameObjectLinkedListTest {

    GameObjectList testList = new GameObjectLinkedList();

    @BeforeEach()
    public void beforeEach() {
        testList.clear();
        GameObject.idCounter = 0;
    }

    /**
     * Validating the default construction of an AssignmentPrimer object.
     */
    @Test
    void testLinkedListScaling() {
        long operationStartTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            testList.add(new GameObject("Object " + i));
            assertEquals(i + 1, testList.size());
            assertEquals("Object " + i, testList.getLast().getName());
        }
        long operationEndTime = System.currentTimeMillis();
        System.out.println("Total Time: " + (double)(operationEndTime - operationStartTime)/1000f);
    }

    /**
     *
     */
    @Test
    void testLinkedListGet() {
        // Ensure that when the list is empty, get will return null.
        assertEquals(null, testList.get(3));
        assertEquals(null, testList.get(0));
        // When the value passed in is negative, will return null.
        assertEquals(null, testList.get(-1));
        // Confirm initial size of list is 0
        assertEquals(0, testList.size());

        // Variable used to check how many entries are in the list
        int result = 0;
        // Create the first 'GameObject' and add it to the list
        GameObject gameObj1 = new GameObject("Get Object 1");
        result = testList.add(gameObj1);
        assertEquals(1, result);
        assertEquals("Get Object 1", testList.get(0).getName());
        assertEquals(1, testList.get(0).getObjectId());

        // Add a second 'GameObject' to the list
        GameObject gameObj2 = new GameObject("Get Object 2");
        result = testList.add(gameObj2);
        assertEquals(2, result);
        assertEquals("Get Object 1", testList.get(0).getName());
        assertEquals(1, testList.get(0).getObjectId());
        assertEquals("Get Object 2", testList.get(1).getName());
        assertEquals(2, testList.get(1).getObjectId());

        // Add a third 'GameObject' to the list
        GameObject gameObj3 = new GameObject("Get Object 3");
        result = testList.add(gameObj3);
        assertEquals(3, result);
        assertEquals("Get Object 1", testList.get(0).getName());
        assertEquals(1, testList.get(0).getObjectId());
        assertEquals("Get Object 2", testList.get(1).getName());
        assertEquals(2, testList.get(1).getObjectId());
        assertEquals("Get Object 3", testList.get(2).getName());
        assertEquals(3, testList.get(2).getObjectId());

        GameObject firstObjectInList = testList.getFirst();
        assertEquals("Get Object 1", testList.get(0).getName());
        assertEquals(1, testList.get(0).getObjectId());

        GameObject lastObjectInList = testList.getLast();
        assertEquals("Get Object 3", testList.get(2).getName());
        assertEquals(3, testList.get(2).getObjectId());

        // Ensure that given entries, get(i) beyond the length of the list returns null
        assertEquals(null, testList.get(4));
    }

    /**
     * Add functionality is being tested implicitly throughout the JUnit Test Class.
     * This test is for grading purposes only.
     */
    @Test
    void testLinkedListAdd() {
        int result = 0;
        result = testList.add(new GameObject("Add Object 1"));
        assertEquals(1, result);
        result = testList.add(new GameObject("Add Object 2"));
        assertEquals(2, result);
        result = testList.add(new GameObject("Add Object 3"));
        assertEquals(3, result);
    }

    /**
     *
     */
    @Test
    void testLinkedListInsert() {
        int result = 0;
        // When we insert a new object beyond the list length, insert it at the end
        result = testList.insert(4, new GameObject("Insert Object 1"));
        assertEquals(1, result);
        result = testList.insert(0, new GameObject("Insert Object 2"));
        assertEquals(2, result);

        result = testList.insert(0, new GameObject("Insert Object 3"));
        assertEquals(3, result);

        result = testList.insert(10, new GameObject("Insert Object 4"));
        assertEquals(4, result);

        result = testList.insert(3, new GameObject("Insert Object 5"));
        assertEquals(5, result);

        // Test that the order of the list is correct
        assertEquals(3, testList.get(0).getObjectId());
        assertEquals("Insert Object 3", testList.get(0).getName());

        assertEquals(2, testList.get(1).getObjectId());
        assertEquals("Insert Object 2", testList.get(1).getName());

        assertEquals(1, testList.get(2).getObjectId());
        assertEquals("Insert Object 1", testList.get(2).getName());

        assertEquals(5, testList.get(3).getObjectId());
        assertEquals("Insert Object 5", testList.get(3).getName());

        assertEquals(4, testList.get(4).getObjectId());
        assertEquals("Insert Object 4", testList.get(4).getName());
    }

    @Test
    void testLinkedListRemove() {
        // Test the removal on an empty list
        assertEquals(null, testList.remove(0));
        assertEquals(null, testList.remove(2));
        assertEquals(null, testList.remove(-1));

        int result = 0;
        // Setup the test list for removal
        result = testList.insert(4, new GameObject("Remove Object 1"));
        assertEquals(1, result);
        result = testList.insert(0, new GameObject("Remove Object 2"));
        assertEquals(2, result);
        result = testList.insert(0, new GameObject("Remove Object 3"));
        assertEquals(3, result);
        result = testList.insert(10, new GameObject("Remove Object 4"));
        assertEquals(4, result);
        result = testList.insert(3, new GameObject("Remove Object 5"));
        assertEquals(5, result);

        // Test the scenarios where input is greater than list size
        GameObject removedObject = testList.remove(6);
        assertEquals(null, removedObject);
        assertEquals(5, testList.size());
        removedObject = testList.remove(3);
        assertEquals("Remove Object 5", removedObject.getName());
        assertEquals(4, testList.size());
        removedObject = testList.remove(0);
        assertEquals("Remove Object 3", removedObject.getName());
        assertEquals(3, testList.size());
        removedObject = testList.remove(2);
        assertEquals("Remove Object 4", removedObject.getName());
        assertEquals(2, testList.size());
        removedObject = testList.remove(2);
        assertEquals(null, removedObject);
    }

    // test clear
    @Test
    void testLinkedListClear() {
        assertEquals(0, testList.size());
        testList.clear();
        assertEquals(0, testList.size());
        testList.insert(4, new GameObject("Clear Object 1"));
        testList.insert(0, new GameObject("Clear Object 2"));
        testList.insert(0, new GameObject("Clear Object 3"));
        testList.insert(10, new GameObject("Clear Object 4"));
        testList.insert(3, new GameObject("Clear Object 5"));
        assertEquals(5, testList.size());
        testList.clear();
        assertEquals(0, testList.size());
    }

    @Test
    void testLinkedListFindById() {
        assertEquals(null, testList.findById(0));
        assertEquals(null, testList.findById(-1));
        assertEquals(null, testList.findById(100));

        testList.insert(4, new GameObject("Find Object 1"));
        testList.insert(0, new GameObject("Find Object 2"));
        testList.insert(0, new GameObject("Find Object 3"));
        testList.insert(10, new GameObject("Find Object 4"));
        testList.insert(3, new GameObject("Find Object 5"));

        GameObject findByObj = testList.findById(4);
        assertEquals("Find Object 4", findByObj.getName());
        assertEquals(4, findByObj.getObjectId());
        findByObj = testList.findById(3);
        assertEquals("Find Object 3", findByObj.getName());
        assertEquals(3, findByObj.getObjectId());
        findByObj = testList.findById(2);
        assertEquals("Find Object 2", findByObj.getName());
        assertEquals(2, findByObj.getObjectId());
        findByObj = testList.findById(5);
        assertEquals("Find Object 5", findByObj.getName());
        assertEquals(5, findByObj.getObjectId());
    }

    @Test
    void testLinkedListFindByName() {
        assertEquals(null, testList.findByName("Failed to find"));
        assertEquals(null, testList.findByName("Failed to find"));
        assertEquals(null, testList.findByName("Failed to find"));

        testList.insert(4, new GameObject("Find Object 1"));
        testList.insert(0, new GameObject("Find Object 2"));
        testList.insert(0, new GameObject("Find Object 3"));
        testList.insert(10, new GameObject("Find Object 4"));
        testList.insert(3, new GameObject("Find Object 5"));

        GameObject findByObj = testList.findByName("Find Object 4");
        assertEquals("Find Object 4", findByObj.getName());
        assertEquals(4, findByObj.getObjectId());
        findByObj = testList.findByName("Find Object 3");
        assertEquals("Find Object 3", findByObj.getName());
        assertEquals(3, findByObj.getObjectId());
        findByObj = testList.findByName("Find Object 2");
        assertEquals("Find Object 2", findByObj.getName());
        assertEquals(2, findByObj.getObjectId());
        findByObj = testList.findByName("Find Object 5");
        assertEquals("Find Object 5", findByObj.getName());
        assertEquals(5, findByObj.getObjectId());
    }

    @Test
    void testLinkedListTestFirstLast() {
        testList.insert(4, new GameObject("Insert for First Object 1"));
        testList.insert(0, new GameObject("Insert for First Object 2"));
        testList.insert(0, new GameObject("Insert for First Object 3"));
        testList.insert(10, new GameObject("Insert for First Object 4"));
        testList.insert(3, new GameObject("Insert for First Object 5"));

        GameObject firstObj = testList.getFirst();
        assertEquals(3, firstObj.getObjectId());
        assertEquals("Insert for First Object 3", firstObj.getName());

        GameObject lastObj = testList.getLast();
        assertEquals(4, lastObj.getObjectId());
        assertEquals("Insert for First Object 4", lastObj.getName());
    }
}
