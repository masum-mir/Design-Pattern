package CreationalDesignPattern.abstractFactoryPattern;

public class ENG implements Course{
    @Override
    public int courseCode() {
        return 101;
    }

    @Override
    public String courseTitle() {
        return "Basic English";
    }
}
