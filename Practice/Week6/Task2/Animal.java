package Practice.Week6.Task2;

abstract public class Animal {
    abstract public void greeting();
}

class Cat extends Animal {
    @Override
    public void greeting() {
        System.out.println("Meow!");
    }
}

class Dog extends Animal {
    @Override
    public void greeting() {
        System.out.println("Woof!");
    }

    public void greeting(Dog another) {
        System.out.println("Woooooooooof!");
    }
}

class BigDog extends Dog {
    @Override
    public void greeting() {
        System.out.println("Woow!");
    }

    @Override
    public void greeting(Dog another) {
        System.out.println("Woooooowwwww!");
    }
}