package BehavioralDesignPattern.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {
    List<User> userList = new ArrayList<>();
    public void addUser(User user) {
        userList.add(user);
    }
    public User getUser(int id) {
        return userList.get(id);
    }

    public MyIterator getIterator() {

        return new MyInteratorImpl(userList);
    }
}
