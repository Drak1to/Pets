public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Cow");
        System.out.println(cow.voice());
        Cat cat = new Cat("Cat");
        System.out.println(cat.voice());
        Dog dog = new Dog("Dog");
        System.out.println(dog.voice());
    }
}