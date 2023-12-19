package lab6.Dog;

public abstract class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Абстрактный метод для издания звука
    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
