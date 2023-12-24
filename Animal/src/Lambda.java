import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("Cat", "Dog", "Elephant", "Tiger");

        // Lambda ile liste üzerinde döngü
        animals.forEach(animal -> System.out.println("Animal: " + animal));

        // Lambda ile filtreleme
        animals.stream()
                .filter(animal -> animal.startsWith("E"))
                .forEach(filteredAnimal -> System.out.println("Filtered Animal: " + filteredAnimal));
    }
}
