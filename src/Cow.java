public class Cow extends Pet{


    @Override
    String voice() {
        return "Я корова - Мууу-Мууу-Муууу";
    }

    public Cow(String animal) {
        super(animal);
    }
}
