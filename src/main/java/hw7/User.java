package hw7;

public abstract class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    // абстрактний метод
    public abstract String getRole();
}
