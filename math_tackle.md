# Math Tackle

A Java practice sheet focused on the `%` (modulus) operator and basic number logic.

---

## 1. What Does `%` Do?

### Hint / Logic
The `%` operator gives you the **remainder after division**.

For example:

```java
10 % 3
```

10 divided by 3 gives 3 with a remainder of 1.

```text
10 / 3 = 3
10 % 3 = 1
```

Try calculating:

```java
System.out.println(10 % 3);
System.out.println(15 % 4);
System.out.println(20 % 5);
```

---

## 2. Even or Odd

### Hint / Logic
A number is **even** if dividing it by 2 leaves a remainder of `0`.

Use:

```java
number % 2 == 0
```

If the condition is true, the number is even. Otherwise, it is odd.

Example:

```java
int number = 7;

if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

---

## 3. Check if a Number Is Divisible

### Hint / Logic
A number is divisible by another number if the remainder is `0`.

Use:

```java
number % divisor == 0
```

For example, to check whether a number is divisible by 5:

```java
if (number % 5 == 0) {
    System.out.println("Divisible by 5");
}
```

Try creating a program that asks the user for a number and checks whether it is divisible by 3.

---

## 4. Print Every 3rd Number

### Hint / Logic
Use a loop and `%`.

If:

```java
i % 3 == 0
```

then `i` is a multiple of 3.

Example:

```java
for (int i = 1; i <= 20; i++) {
    if (i % 3 == 0) {
        System.out.println(i);
    }
}
```

Expected output:

```text
3
6
9
12
15
18
```

---

## 5. Find the Remainder

### Hint / Logic
Use the `%` operator directly.

Calculate:

```text
17 % 5
25 % 4
30 % 7
100 % 9
```

Remember:

```text
a % b = remainder after a is divided by b
```

---

## 6. Check if a Number Is a Multiple

### Hint / Logic
To determine whether `A` is a multiple of `B`, check whether:

```java
A % B == 0
```

For example:

```java
20 % 5 == 0
```

Therefore, 20 is a multiple of 5.

### Challenge

Ask the user to enter two numbers and determine whether the first number is a multiple of the second.

---

## 7. Sum of Even Numbers

### Hint / Logic
Use a loop to go through the numbers.

For each number, check:

```java
number % 2 == 0
```

If it is even, add it to a running total.

### Challenge

Find the sum of all even numbers from 1 to 100.

Expected result:

```text
2550
```

---

## 8. Count Even and Odd Numbers

### Hint / Logic
Use two counters:

```java
int evenCount = 0;
int oddCount = 0;
```

For every number:

```java
if (number % 2 == 0) {
    evenCount++;
} else {
    oddCount++;
}
```

### Challenge

Given:

```java
int[] numbers = {12, 7, 5, 8, 20, 33, 41, 10};
```

Count how many numbers are even and how many are odd.

---

## 9. Extract the Last Digit

### Hint / Logic
The modulus operator can be used to get the last digit of an integer.

Use:

```java
number % 10
```

For example:

```text
123 % 10 = 3
```

### Challenge

Ask the user for a number and print its last digit.

---

## 10. Reverse a Number

### Hint / Logic
This combines `%` and integer division.

To get the last digit:

```java
digit = number % 10;
```

To remove the last digit:

```java
number = number / 10;
```

For example, with `123`:

```text
123 % 10 = 3
123 / 10 = 12

12 % 10 = 2
12 / 10 = 1

1 % 10 = 1
1 / 10 = 0
```

Build the reversed number using:

```java
reversed = reversed * 10 + digit;
```

### Challenge

Input:

```text
12345
```

Output:

```text
54321
```

---

## 11. Count the Digits

### Hint / Logic
Keep dividing the number by 10 until it becomes 0.

For example:

```text
58392
5839
583
58
5
0
```

Count how many times you divide.

### Challenge

Ask the user for an integer and print the number of digits.

Example:

```text
Input: 58392
Output: Number of digits: 5
```

---

## 12. Sum of Digits

### Hint / Logic
Use `% 10` to extract the last digit and `/ 10` to remove it.

For `1234`:

```text
1234 % 10 = 4
1234 / 10 = 123

123 % 10 = 3
123 / 10 = 12

12 % 10 = 2
12 / 10 = 1

1 % 10 = 1
1 / 10 = 0
```

Then:

```text
4 + 3 + 2 + 1 = 10
```

### Challenge

Write a program that calculates the sum of all digits in a number.

---

## 13. Check if a Number Is Prime

### Hint / Logic
A prime number has exactly two factors:

```text
1 and itself
```

Try dividing the number by values from `2` up to the number before it.

Use `%` to check whether there is a remainder:

```java
number % i == 0
```

If the remainder is `0`, the number is divisible by `i`.

### Challenge

Create:

```java
isPrime(int number)
```

that returns:

```java
true
```

if the number is prime and:

```java
false
```

otherwise.

---

## 14. FizzBuzz

### Hint / Logic
Use `%` to test divisibility.

For numbers from 1 to 100:

- If divisible by 3 and 5 → `FizzBuzz`
- If divisible by 3 → `Fizz`
- If divisible by 5 → `Buzz`
- Otherwise → print the number

Important: check the condition for **both 3 and 5 first**.

Example:

```java
if (i % 3 == 0 && i % 5 == 0) {
    System.out.println("FizzBuzz");
} else if (i % 3 == 0) {
    System.out.println("Fizz");
} else if (i % 5 == 0) {
    System.out.println("Buzz");
} else {
    System.out.println(i);
}
```

---

# Final Challenge — Number Analyzer

### Hint / Logic
Combine everything you've learned.

Create a Java program that asks the user for one integer and displays:

```text
===== NUMBER ANALYZER =====

Number: 58392

Even/Odd: Even
Last digit: 2
Number of digits: 5
Sum of digits: 27
Reversed: 29385
```

You should use:

- `Scanner`
- `if / else`
- `for` or `while`
- `%`
- `/`
- Variables
- Methods

### Extra Challenge

Create separate methods:

```java
isEven()
getLastDigit()
countDigits()
sumDigits()
reverseNumber()
isPrime()
```

Then call all of them from `main()`.

---

# Quick Reference

| Operation | Meaning | Example | Result |
|---|---|---:|---:|
| `/` | Division | `17 / 5` | `3` |
| `%` | Remainder | `17 % 5` | `2` |
| `% 2 == 0` | Even | `8 % 2 == 0` | `true` |
| `% 2 != 0` | Odd | `7 % 2 != 0` | `true` |
| `% 10` | Get last digit | `123 % 10` | `3` |
| `% divisor == 0` | Divisible | `20 % 5 == 0` | `true` |

> **Key idea:** `%` tells you what is left over after division. Once you understand that, many number problems become much easier.
