package CreationalDesignPattern.abstractFactoryPattern;

public class EngFactory extends CourseAbstractFactory {

    @Override
    public Course createCourse() {
        return new ENG();
    }
}
