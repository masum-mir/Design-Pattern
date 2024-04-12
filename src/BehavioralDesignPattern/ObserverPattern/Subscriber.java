package BehavioralDesignPattern.ObserverPattern;

public class Subscriber implements Observer{

    public String name;
    @Override
    public void notified(String title) {
        System.out.println(name + " notification " + title);
    }
}
