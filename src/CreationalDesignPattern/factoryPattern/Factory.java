package CreationalDesignPattern.factoryPattern;

public class Factory {

    //get the course
    public static Course getCourse(String crsType) {
        if(crsType.trim().equalsIgnoreCase("cse")) {
            return new Cse();
        } else if(crsType.trim().equalsIgnoreCase("eng")) {
            return new Eng();
        } else {
            return null;
        }
    }

}
