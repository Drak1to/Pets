public class Dog extends Pet{
    @Override
    String voice() {
        return "Я пес - Гауууу-Гауууу";
    }

    public Dog(String animal) {
        super(animal);
    }
}
