package CreationalDesignPattern.singletonPattern;

/*
    1. constructor private
    2. object create with help of method
    3. create field to store object is private
 */
public class Singleton {

    private static Singleton obj;

    private Singleton(){
        if(obj != null) {
            throw new RuntimeException("You are trying to break singleton pattern.");
        }
    }

    // lazy way instantiation - single thread
//    public static Singleton getInstance() {
//        if(obj == null) {
//            obj = new Singleton();
//        }
//        return obj;
//    }

    // lazy way instantiation - multi thread
    public static Singleton getInstance() {
        if(obj == null) {
            synchronized (Singleton.class) {
                obj = new Singleton();
            }
        }
        return obj;
    }


    // deserialization
    public Object readResolve() {
        return obj;
    }

}
