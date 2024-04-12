package CreationalDesignPattern.abstractFactoryPattern;

public class Main {
    public static void main(String[] args) {


        Course c1 = CourseFactory.getCourse(new CseFactory());
        c1.courseTitle();
        System.out.println(c1.courseTitle() +" - "+ c1.courseCode() );

        Course c2 = CourseFactory.getCourse(new EngFactory());
        System.out.println(c2.courseTitle() +" - "+ c2.courseCode() );
    }
}
