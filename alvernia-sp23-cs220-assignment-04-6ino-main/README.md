Reservation Program Requirements
Create a Java Program using the existing ReservationQueueClass that manages a Reservation Queue at
a restaurant. The queue will be first come, first serve (FIFO), and should implement the following actions:
1. Add a party, with how many people are in that party to the reservation queue.
2. Seat the next party in the queue.
3. Display the current reservations in the queue, and how many are in the party.
   A custom Party class should be implemented for holding the Name and Size of the party. Summary of
   Reservation Queue Methods to Implement
1. add - Will append a party to the end of the queue.
2. remove - If the remove method is called without arguments, then the first item in the queue should
   be removed from the list, and returned for display.
3. contains - Checks to see if a name exists in the queue, if it does, return true.
4. size - Returns the current size of the queue.
5. indexOf - Attempts to match a reservation name, if a match occurs, return the index they exist at
   (zero based).
   The Queue class you create should implement the edu.alvernia.cs220.assignment04.impl.GenericList class, and be used to manage the reservation
   in the main part of the program.
   CS 220 S2023 March 23, 2023 v1.0 Daniel Mellinger 1
   





Roster Manager Program Requirements
   Create a Java program using the existing RosterManagerClass that manages the roster of players for a
   sport of your choice using an Ordered Linked List. Implement the following functionalities:
1. Add a player to the roster.
2. Remove a player from the roster.
3. Check if a player with a specified Last Name exists.
4. Display the roster of players.
5. Display the Statistics for a Selected Player.
   You will need to implement a custom Player object, which will include the players First Name, Last Name,
   and at least 4 statistics for that sport. All information should be taken as input from the user when a player
   is added to the roster.
   The Ordered Linked List class you create should implement the edu.alvernia.cs220.assignment04.impl.GenericList interface that is provided as part of the project. A Comparator should be used, and passed into the constructor of the list
   class you create. A player exists on the roster if their Last and First name match an existing player on the
   roster. When a player is added to the list, their entry should be inserted into the roster in alphabetical order.
   Summary of Ordered List Methods to Implement
1. add - Will insert a name into the list in alphabetical order by Lastname, then Firstname.
2. remove - Will take in an object, and attempt to match the Lastname and Firstname of a player on
   the list, if a match occurs, remove that player and return their object for display. If remove with no
   arguments is called, remove the last player added to the Roster.
3. contains - Attempts to match if a player exists in the list by first name, and last name. If a match
   occurs, return true.
4. size - Returns the number of players in the list.
5. indexOf - Attempts to match a player exists in the list by first name, and last name. If a match
   occurs, return the index they exist at (zero based).
   Implementing the OrderedList, and Queue
   To implement these, I suggest you focus on the reservation program first. Implement the Queue class, and
   build that as you develop your menu in the ReservationQueueMain method. Once you have completed
   the Reservation Queue program, you should build your OrderedList by extending that class, and update
   only the methods that are needed for your Roster Manager program.
   In addition to how the well the program is working, you will also be graded on the additional methods
   that are included in the edu.alvernia.cs220.assignment04.impl.GenericList interface. The additional methods to implement are toArray, and
   toArrayReverse. Both should dynamically allocate a standard array, and copy all of the objects of the
   OrderedList or Queue into them.
   CS 220 S2023 March 23, 2023 v1.0 Daniel Mellinger 2
   Opening the Project in IntelliJ IDEA
   Follow the same process as we have for the first three assignments, and open the project in IntelliJ using the
   File > New > Project from Version Control... menu, and the link provided when the assignment is
   accepted.
   Due Date
   This assignment is due by 11:00 PM April 3rd, 2023. Please use the designated pre-class sessions /
   office hours early to get out ahead of this assignment. This assignment will be worth 150 points towards
   your assignments grade.
   Bonus Points
   In section 7.4, page 282 of the book, the concept of an Iterator is introduced. If you are able to successfully
   implement your Queue or OrderedList classes as an iterator, you will receive 10 bonus points for each.
   This topic will be discussed in class as well.