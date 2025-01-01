# Java01 Problem Solving

## Question:
Print First And Basic Programming In Java Programming

## Answer
To print something in Java Programming we use `System.out.println()`, which is basically used for to print any type of string value, integer value and many more.

### System.out.println();

In Java programming, System.out.println(); is a statement used to print text or other outputs to the console. Here's a breakdown of its components:

1. System:
It is a predefined class in the `java.lang` package. Provides access to system-level properties and standard input/output streams.

2. out:
A static member of the `System` class. It is an instance of `PrintStream` that is connected to the console, allowing data to be printed.

3. println():
A method of the `PrintStream` class. Prints the argument passed to it (if any) to the console and then moves the cursor to the next line.

### Difference between `System.out.print();` and `System.out.println();`

| Feature               | `System.out.print();`                                      | `System.out.println();`                                         |
|-----------------------|-----------------------------------------------------------|-----------------------------------------------------------------|
| **Line Break**        | Does not add a line break after printing.                  | Automatically adds a line break after printing.                |
| **Cursor Position**   | Leaves the cursor at the end of the printed text.          | Moves the cursor to the beginning of the next line.            |
| **Usage**             | Useful when you want to print text on the same line.       | Useful when you want to print each output on a new line.       |
| **Example Code**      | `System.out.print("Hello"); System.out.print("World!");`   | `System.out.println("Hello"); System.out.println("World!");`   |
| **Output Example**    | `HelloWorld!`                                              | `Hello`<br>`World!`                                            |
