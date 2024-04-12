package CreationalDesignPattern.singletonPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello");

        // lazy way
        Singleton obj1 =  Singleton.getInstance();
        System.out.println(obj1.hashCode());

        Singleton obj2 =  Singleton.getInstance();
        System.out.println(obj2.hashCode());
        System.out.println(Singleton.getInstance().hashCode());

        // early way
        System.out.println(SingletonEarly.getInstance().hashCode());
        System.out.println(SingletonEarly.getInstance().hashCode());


        // break singleton pattern
//        1. reflection api
//            solution: * if objct is there -> throw exception from inside constructor
//                    * use enum
//          2. Deserialization
//                solution: implementation readresolve method
//            3. cloning

        // reflection api
//        Singleton s1 = Singleton.getInstance();
//        System.out.println(s1.hashCode());
//
//        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Singleton s2 = constructor.newInstance();
//        System.out.println(s2.hashCode());

        //Deserialization
//        Singleton s3 = Singleton.getInstance();
//        System.out.println("S3 = "+s3.hashCode());
//        ObjectOutputStream obj3 = new ObjectOutputStream(new FileOutputStream("abc.ob"));
//        obj3.writeObject(s3);
//
//        System.out.println("Serialization done");
//
//        ObjectInputStream obj4 = new ObjectInputStream(new FileInputStream("abc.ob"));
//        Singleton s4 = (Singleton) obj4.readObject();
//        System.out.println("S4 = "+s4.hashCode());

    }
}
