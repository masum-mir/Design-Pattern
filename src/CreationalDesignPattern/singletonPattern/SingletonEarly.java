package CreationalDesignPattern.singletonPattern;

public class SingletonEarly{
    private static SingletonEarly obj = new SingletonEarly();

    // early way instantiation
    public static SingletonEarly getInstance() {
        return obj;
    }
}
