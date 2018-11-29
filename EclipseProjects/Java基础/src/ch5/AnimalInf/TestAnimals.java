package ch5.AnimalInf;

public class TestAnimals {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Cat cat = new Cat("Fluffy");
        Animal absFish = new Fish();
        Animal absSpider = new Spider();
        Pet infCat = new Cat();
        Pet infFish = new Fish();
        
        // Demonstrate different implementations of an interface
        fish.play();
        cat.play();
        
        // Demonstract virtual method invocation
        absFish.eat();
        absSpider.eat();
        absSpider.walk();
        
        // Demonstrate calling super methods
        absFish.walk();
        
        // Demonstract virtual method invocation of an interface
        infCat.setName("mimi");
        infCat.play();
        infFish.setName("fifi");
        infFish.play();
        
    }
}
