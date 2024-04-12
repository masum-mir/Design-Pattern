package BehavioralDesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{

    List<Observer> list = new ArrayList<>();
    public String title;


    @Override
    public void subscribe(Observer obj) {
        this.list.add(obj);
    }

    @Override
    public void unsubscribe(Observer obj) {
        this.list.remove(obj);
    }

    @Override
    public void notifyChanges(String title) {
        for(Observer ob: this.list) {
            ob.notified(title);
        }
    }
}
