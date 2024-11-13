## Task 5

### 1: Class Hierarchy
<img width="420" alt="Screenshot 2024-11-12 at 5 00 09 PM" src="https://github.com/user-attachments/assets/596b4fbd-5fa6-4f27-9cd2-6f4f493827a9">

### 2: Theoretical questions

**1. How are abstract classes and interfaces the same?**
   - Both allow defining methods that must be implemented by subclasses (or implementing classes).
   - Both provide a way to achieve abstraction by defining a contract that subclasses or implementing classes need to fulfill.

**2. How are abstract classes and interfaces different?**
   - **Abstract Classes**:
     - A class can extend only one abstract class.
     - Can have fields and concrete methods.
     - Used when classes have common behavior.
   - **Interfaces**:
     - A class can implement multiple interfaces.
     - Cannot have instance fields.
     - Used to define a contract without enforcing class hierarchy.

**3. Why does it generally make more sense to override the `equals` method than to overload it?**
   - Overriding `equals` is preferred because it allows for proper comparison of objects based on meaningful attributes, enabling consistent object comparison across the application. Overloading `equals` with different parameters could lead to confusion, as it breaks the expected behavior of `equals()` defined in `Object`.

### 3: Reference Type Compatibility Table

| Reference\Variable Type | Tossable | Ball | Rock | Baseball | Football |
|-------------------------|----------|------|------|----------|----------|
| Tossable                | ✓        | ✓    | ✓    | ✓        | ✓        |
| Ball                    | X        | ✓    | X    | ✓        | ✓        |
| Rock                    | X        | X    | ✓    | X        | X        |
| Baseball                | X        | X    | X    | ✓        | X        |
| Football                | X        | X    | X    | X        | ✓        |

- `✓` indicates the type could be stored in the variable.
- `X` indicates the type could not be stored in the variable.
- `—` (if applicable) would mean that it’s not possible to instantiate.

### 4: Code Compilation and Execution Analysis

**Compilation (C) and Execution (E) Marks:**

1. `Ball ball = new Football("spalding");` **C, E** - This compiles and executes as `Football` is a subclass of `Ball`.
   
2. `Ball ball = new Football("Spalding"); Baseball baseball = (Baseball)ball;` **C** - This compiles but throws a `ClassCastException` at runtime since `ball` is of type `Football`, not `Baseball`.

3. `Object obj = new Baseball("spalding");` **C, E** - This compiles and executes, as `Object` can hold any type.

4. `Object obj = new Baseball("spalding"); Tossable tossable = obj;` **C** - This will fail to compile because `Object` cannot be directly assigned to `Tossable`. Casting is needed.

5. `Tossable tossable = new Baseball("spalding"); Object obj = tossable;` **C, E** - This compiles and executes, as `Tossable` is implemented by `Baseball`, and `Object` can hold any type.
