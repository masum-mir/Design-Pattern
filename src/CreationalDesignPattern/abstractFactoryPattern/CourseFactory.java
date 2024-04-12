package CreationalDesignPattern.abstractFactoryPattern;

public class CourseFactory {

    // get course
    public static Course getCourse(CourseAbstractFactory factory) {
        return factory.createCourse();
    }

}
