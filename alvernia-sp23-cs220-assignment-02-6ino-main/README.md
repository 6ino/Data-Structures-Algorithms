
# Alvernia's Spring 2023 CS 220 Assignment #2
### alvernia-sp23-cs220-assignment-02

There are three classes in this application, _MathUtilities_, _StringUtilities_ and _Main_ with a number of empty methods that need to be filled in. An explanation of what each method does is explained in the comment above each method. In addition to the comments, a number of test cases have been created in the test folder. The classes are named _MathUtilitiesTest_ and _StringUtilitiesTest_ respectively, and each test can be ran individually by opening and viewing the test cases, or using the Maven target _test_.

Once all of the methods have been completed with tests passing, the _main_ method in the _Main_ class can be updated. In the _main_ method, a menu will be created that will allow the user to select which method they would like to demonstrate, and to prompt the user for inputs for each method. The menu should provide options to demonstrate each of the following methods: 

- Summation (Math) - Allow the user to input a list of integers, then calculate and output the sum.
- Product (Math) - Allow the user to input a list of integers, then calculate and output the product.
- Average (Math) - Allow the user to input a list of integers, then calculate and output the average.
- Is Even (Math) - Allow the user to check if an integer is even.
- Is Odd (Math) - Allow the user to check if an integer is even.
- Absolute Value - Allow the user to input a number, and provide the absolute value of the input.
- Count Letters - Allow the user to input a string, and character, and count the number of occurrences of the character.
- Reverse String - Allow the user to input a string, and output the reversed string.
- Invert Case - Allow the user to input a string, and output the string with inverted the case.
- Trim - Allow the user to input a string, and output the trimmed version of it.
- Is Palindrome - Allow the user to input a string, and output if it is a palindrome. 
- Pad Left - Allow the user to input a string, with a character, and integer, and output the padded string.
- Pad Right - Allow the user to input a string, with a character, and integer, and output the padded string.
- Is Number - Allow the user to input a string, and output if it can be converted to a number.
- End - Allow the user to input a string and integer, then output the end of the string.
- Start - Allow the user to input a string and integer, then output the start of the string.

The menu should continue to be displayed until the user chooses to quit, by selecting a "Quit" menu option. 

The rest of this README file contains information and examples of most of the Java constructs you will need to complete the assignment.

### Blocks _{}_

In Java, a block is a group of statements surrounded by curly braces {}. Blocks can be used to define the body of a method, an if statement, a loop, or a try-catch statement. Blocks allow you to define a scope for variables, meaning that variables declared within a block are only accessible within that block. A block can contain any number of statements, including other blocks. This allows for complex control structures and modularization of code.

### Comments: // and /* */

Comments in Java are used to add descriptive text to your code that is not executed when the program runs. They are used to clarify the purpose and behavior of different sections of your code, to document your thought process, and to make your code more readable and understandable for yourself and other programmers. There are two types of comments in Java: single-line comments and multi-line comments.

Single-line comments start with // and continue until the end of the line. For example:

```
// This is a single-line comment
System.out.println("Hello, World!");
```

Multi-line comments start with /* and end with */. Everything in between these two symbols is considered a comment and will not be executed. For example:
```
/* This is a
multi-line comment */
System.out.println("Hello, World!");
```

It's a best practice to include comments in your code to explain what it's doing and why. This makes your code more maintainable, as it can help others understand your code and make it easier for you to remember what you were thinking when you wrote it. Additionally, comments can be useful for temporarily disabling parts of your code while debugging or testing.

### _if ... else_ structure

The "if-else" structure in Java allows for conditional execution of code, depending on whether a certain condition is true or false. The basic syntax of the if-else statement is as follows:

```
if (condition) {
    // statements executed if condition is true
}
else {
    // statements executed if condition is false
}
```

The condition in the parenthesis is a boolean expression, i.e., an expression that evaluates to either true or false. If the condition is true, the statements within the first set of curly braces are executed. If the condition is false, the statements within the second set of curly braces are executed.

For example, the following code demonstrates the use of an if-else structure to determine if a number is positive or negative:

```
int number = -10;
if (number > 0) {
    System.out.println(number + " is a positive number");
}
else {
    System.out.println(number + " is a negative number");
}
```
In this example, the condition number > 0 is false, so the code within the else block is executed and the output will be -10 is a negative number.

### _for_ loop

For loops are a fundamental concept in Java programming and are used to execute a block of code repeatedly. A for loop is defined by its initial value, termination condition, and increment/decrement expression. The basic structure of a for loop in Java is as follows:

```
for (int i=0; i<10; i++) {
    // code to be executed repeatedly
}

```

In this example, i is the loop control variable and is initialized to 0. The termination condition i<10 specifies that the loop should continue to execute as long as i is less than 10. The increment expression i++ increases the value of i by 1 after each iteration of the loop.

Here is an example of a for loop in Java that prints the numbers from 1 to 10:

```
for (int i=1; i<=10; i++) {
    System.out.println(i);
}
```

This loop starts with i equal to 1 and continues to execute until i is greater than 10. In each iteration of the loop, the value of i is printed to the console.

### _while_ loop

A while loop in Java is used to repeatedly execute a block of code as long as the specified condition is true. The basic syntax of a while loop is as follows:

```
while (condition) {
    // code to be executed
}
```

Here's an example that prints the numbers from 1 to 10 using a while loop:

```
int i = 0;
while (i <= 10) {
  System.out.println(i);
  i++;
}
```

It's important to remember to increment the counter variable inside the loop or the loop may become an infinite loop. In the example above, the variable i is incremented by 1 in each iteration of the loop using the i++ statement. The loop will continue to execute as long as the value of i is less than or equal to 10. Once the value of i becomes greater than 10, the loop will terminate.

### _do...while_ loop

A do-while loop in Java is a control structure that is similar to a while loop, with the difference being that the code block inside the do-while loop is executed at least once before the condition is tested. The condition is evaluated at the end of each iteration, and the loop continues to execute as long as the condition is true.

Here's an example of a do-while loop in Java:

```
int i = 1;
do {
  System.out.println(i);
  i++;
} while (i <= 5);
```

In this example, the code block inside the do-while loop will print the value of i and increment it by 1. The loop will continue to execute as long as the value of i is less than or equal to 5. As a result, the program will output the numbers from 1 to 5, inclusive, to the console. The do-while loop is useful when you want to ensure that the code block is executed at least once, even if the condition is false from the start.

### _switch_ Statement

A switch statement in Java is used to execute a block of code based on the value of an expression. The expression is compared to the values of each case label within the switch, and when a match is found, the code following that case is executed. The switch statement is often used as an alternative to a long chain of if-else statements.

Here is an example of a switch statement in Java:

```
public static void printDayOfWeek(int day) {
    switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Invalid day");
    }
}
```

In this example, the switch statement takes an int argument day, which represents a day of the week. The value of day is compared to the values of each case label within the switch. If a match is found, the code following that case is executed. The break statement is used to exit the switch once a match is found. If no match is found, the code following the default label is executed. In this example, the default case is used to handle an invalid input. If day is not between 1 and 7, the message "Invalid day" is printed.

