import java.util.*;

public class AnimalCollection {
    public static void main(String[] args) {
        // Generic List
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Dog("Buddy", 3));
        animalList.add(new Cat("Whiskers", 2));

        // Generic Map
        Map<String, Animal> animalMap = new HashMap<>();
        animalMap.put("dog", new Dog("Buddy", 3));
        animalMap.put("cat", new Cat("Whiskers", 2));
    }
}
