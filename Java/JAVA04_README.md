# Java04 Problem Solving

## Question

### Input: a: 7 b: -3 Output: 4

```Java
    public void addNumber(int a, int b) {
        System.out.println("a + b : "+(a+b));
    }
```

In the above code we took two parameter `a` and `b` and in println() function we add those two value and due to using of `void` keyword the function is no return type function.


```Java
    public static void main(String args[]) {
        Java04 j = new Java04();
        j.addNumber(7, -3);
    }
```

In the main function we initialize the constructor and we create the object and call the function using that object. After call the function send the arguments to perform the required operations, which is addition of two number.