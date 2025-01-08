# Java05 Problem Solving

## Question

### Input: 14 Output: EVEN	Input: 23 Output: ODD

```Java
    public String EvenOdd(int num) {
      if(num % 2 == 0) return "EVEN";
      else return "ODD";
    }
```

In the above function we calculate whether the number is Even Number Or Odd Number. This function is the return type function and it returns String values because we add String to the function.

```Java
    public static void main(String args[]) {
      Java05 j = new Java05();
      System.out.println(j.EvenOdd(14)); // EVEN
      System.out.println(j.EvenOdd(23)); // ODD
    }
```

The above code is the main function where we create the constructor initialization and after creating the object we print the calling function. After call the function we gave the argument integer number so that in the function execution it will take the integer value as parameter and it will start the required operation and return the resultant output.