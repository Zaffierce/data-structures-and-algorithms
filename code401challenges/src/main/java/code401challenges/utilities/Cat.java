package code401challenges.utilities;

public class Cat {
    String name;

    Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s", this.name);

    }
}
