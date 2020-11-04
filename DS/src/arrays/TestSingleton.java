package arrays;

public class TestSingleton {
    public static void main(String[] args) {

        Animal animal = Animal.getObject();
        Animal animal1 = Animal.getObject();
        Animal animal2 = Animal.getObject();
        Animal animal3 = Animal.getObject();

        if(animal == animal1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

class Animal {
    private static Animal objectVariable;

    private Animal() {

    }

    public static Animal getObject() {
        if(objectVariable == null) {
            objectVariable = new Animal();
        }
        return objectVariable;
    }
}
