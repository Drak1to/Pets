public abstract class Pet {
    protected String animal;

    public Pet(String pet) {
        this.animal = pet;
    }
    abstract String voice ();
}
