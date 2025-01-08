# Java02 Problem Solving

## Question

### Create a program that print the phrase "Hello Java Program".

```java
    public void Message() {
        System.out.println("Hello Java Program"); // Hello Java Program
    }
```

The above code is a no return type function. For no return type we use `void` keyword, and inside the function we add System.out.println() to print the required output.

```java
    public static void main(String args[]) {
        Java02 j = new Java02();
        j.Message();
    }
```

The above code is the main function where we first initialize the constructor. using `new` keyword. Then we will call the function using created `Object`.
