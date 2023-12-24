// Cat sınıfı
public class Cat extends Animal implements Moveable {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void move() {
        System.out.println("Cat moves.");
    }
}
