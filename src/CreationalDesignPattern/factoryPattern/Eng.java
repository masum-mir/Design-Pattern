package CreationalDesignPattern.factoryPattern;

public class Eng implements Course {


    @Override
    public int courseCode() {
        System.out.println("Testing ENG");
        return 3;
    }
}
