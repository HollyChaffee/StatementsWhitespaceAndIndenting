package com.hollychaffee;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50;  // This entire line is an assignment statement. The statement ends with a semi-colon.
        myVariable++;  // Also a complete statement.
        myVariable--;  // Also a complete statement.
        System.out.println("This is a test");  // A method call and complete statement.
        // Statements do not have to be on one line.

        int anotherVariable = 50; myVariable--;  // More than one statement can be on one line, although not recommended. (Too confusing)
        //Java compiler will ignore extra whitespace, but this does not mean it will add whitespace where needed.

        // Indent code block after method call. The compiler cares nothing about indentation, but if we indent well,
        // we make our code so much easier to read, which means it will be easier to debug.
        // Indentation allows the physical layout (how the code appears on the screen) to match the logical layout (what the code means).
        // Indenting helps better convey the structure of a program to human readers.
      if (myVariable == 50) {
          System.out.println("Printed");  // Go to Code + refactor code, to line up code properly. Also can press Ctrl + Alt + L
      }
    }
}
