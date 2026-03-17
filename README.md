# Simple Java Application

A simple Java application that demonstrates a "Hello, World!" greeting and a basic `Calculator` class with arithmetic operations, built with Maven and tested with JUnit 5.

## Prerequisites

- **Java 17** or higher
- **Maven 3.6+**

## Project Structure

```
simple-java-app/
├── pom.xml
└── src/
    ├── main/java/com/example/
    │   ├── App.java          # Application entry point
    │   └── Calculator.java   # Calculator with arithmetic operations
    └── test/java/com/example/
        ├── AppTest.java      # Tests for App
        └── CalculatorTest.java # Tests for Calculator
```

## Classes

### `App`
The entry point of the application. Prints a greeting and runs a short demo of the `Calculator` class.

### `Calculator`
Provides four basic arithmetic operations:

| Method | Description |
|---|---|
| `add(int a, int b)` | Returns `a + b` |
| `subtract(int a, int b)` | Returns `a - b` |
| `multiply(int a, int b)` | Returns `a * b` |
| `divide(int a, int b)` | Returns `(double) a / b`; throws `ArithmeticException` when `b` is 0 |

## Build

```bash
mvn clean package
```

## Run

```bash
java -jar target/simple-java-app-1.0-SNAPSHOT.jar
```

**Expected output:**

```
Hello, World!
Calculator Demo:
  3 + 4 = 7
  9 - 5 = 4
  6 * 7 = 42
  7 / 2 = 3.5
```

## Test

```bash
mvn test
```

Six JUnit 5 tests cover the greeting, all four arithmetic operations, and the divide-by-zero guard.
