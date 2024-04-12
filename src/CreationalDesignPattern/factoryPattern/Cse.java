package CreationalDesignPattern.factoryPattern;

public class Cse implements Course {


    @Override
    public int courseCode() {
        System.out.println("Testing CSE");
        return 4;
    }
}
