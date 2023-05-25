public class Cat extends  Pet{
    @Override
    String voice() {
        return "Я кіт - Мяуууу-Мяуууу-Мяууууу";
    }

    public Cat(String animal) {
        super(animal);
    }
}
