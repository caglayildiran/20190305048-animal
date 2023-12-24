// Dog sınıfı
public class Dog extends Animal implements Moveable {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void move() {
        System.out.println("Dog moves.");
    }
}
