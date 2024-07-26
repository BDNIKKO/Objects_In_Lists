public class Animal {
    private final String name;
    private final boolean isDog;

    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public String getName() {
        return name;
    }
    public boolean getIsDog() {
        return isDog;
    }

    @Override
    public String toString() {
        return name + " is a dog = " + isDog;
    }
}
