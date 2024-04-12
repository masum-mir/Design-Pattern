package CreationalDesignPattern.abstractFactoryPattern;


public class CseFactory extends CourseAbstractFactory {

    @Override
    public Course createCourse() {
        return new CSE();
    }
}
