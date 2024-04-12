package CreationalDesignPattern.abstractFactoryPattern;

public class CSE implements Course{
    @Override
    public int courseCode() {
        return 110;
    }

    @Override
    public String courseTitle() {
        return "OOP";
    }
}
