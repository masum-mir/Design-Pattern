package CreationalDesignPattern.factoryPattern;

public class Main {
    public static void main(String[] args) {

        Course course1 = Factory.getCourse("CSE");
        int code = course1.courseCode();
        System.out.println(code);

        Course course2 = Factory.getCourse("eng");
        int code2 = course2.courseCode();
        System.out.println(code2);

    }
}
