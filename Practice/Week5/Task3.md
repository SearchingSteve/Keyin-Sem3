## Exercise 3: Theory Questions

### a. Can an instance method override a static method?
**Answer:** No, an instance method can’t override a static method. Static methods belong to the class itself rather than any instance of the class, so they aren’t inherited by instances and therefore can’t be overridden.

### b. Can a static method override (hide) an instance method?
**Answer:** No, a static method cannot override an instance method. While it can have the same name, it doesn’t count as overriding because static methods are tied to the class itself, not to instances.

### c. Can you override a final instance method?
**Answer:** No, you can’t override a final instance method. The `final` keyword prevents a method from being overridden in any subclass.

### d. Can you override an instance method and make it final?
**Answer:** Yes, you can override an instance method in a subclass and mark it as `final`. This will prevent any further overrides of this method in subclasses of the current class.

### e. Can you override an instance method and change its return type?
**Answer:** Yes, but only if the new return type is a covariant return type, meaning it’s a subclass of the original return type in the superclass.

### f. Can you hide a final static method?
**Answer:** No, a final static method cannot be hidden. Static methods can be hidden by other static methods with the same name in a subclass, but `final` prevents any method from being overridden or hidden.

### g. Can an instance field hide a static field?
**Answer:** Yes, an instance field can hide a static field with the same name. However, this can be confusing, so it’s generally best to avoid using the same name for both.

### h. Can a static field hide an instance field?
**Answer:** Yes, a static field can hide an instance field with the same name in a superclass. Just like with instance fields hiding static fields, this can make the code confusing.

### i. Can an instance method with public visibility override an instance method with default visibility?
**Answer:** Yes, an instance method with `public` visibility can override a method with default (package-private) visibility in the superclass, increasing its visibility.

### j. Can an instance method with default visibility override an instance method with public visibility?
**Answer:** No, a method with default visibility can’t override a method with `public` visibility. Overriding methods can’t reduce visibility.

### k. Can an instance method with protected visibility override an instance method with default visibility?
**Answer:** Yes, a `protected` method can override a method with default visibility. This is allowed because it increases the visibility of the method.

### l. Can an instance method with default visibility override an instance method with protected visibility?
**Answer:** No, a default visibility method cannot override a `protected` method because that would decrease the visibility of the overridden method.

### m. Based on the last four questions, order the access visibility from the widest to the narrowest (weakest) and state the rule for overriding (instance methods) or hiding (static methods).
**Answer:** The access visibility order from widest to narrowest is: `public > protected > default (package-private) > private`. When overriding methods, the subclass method can’t have a more restrictive visibility than the method in the superclass. For hiding static methods, the same visibility rules apply, but static methods can’t be overridden, only hidden.
