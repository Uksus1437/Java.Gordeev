package lab6.Dog;

public class Breed extends Dog{
    private String breedName;

    public Breed(String name, int age, String breedName) {
        super(name, age);
        this.breedName = breedName;
    }

    @Override
    public void makeSound() {
        System.out.println("Собака породы " + breedName + " лает.");
    }

    public String getBreedName() {
        return breedName;
    }
}
