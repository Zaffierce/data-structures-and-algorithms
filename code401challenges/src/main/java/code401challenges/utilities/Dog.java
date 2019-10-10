package code401challenges.utilities;

public class Dog {
    String name;

    Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s", this.name);
    }
}
