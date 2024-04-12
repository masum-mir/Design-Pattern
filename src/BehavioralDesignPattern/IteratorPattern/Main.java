package BehavioralDesignPattern.IteratorPattern;

public class Main {

    public static void main(String[] args) {

        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("abc", "101"));
        userManagement.addUser(new User("bce", "102"));
        userManagement.addUser(new User("vxy", "103"));
        userManagement.addUser(new User("def", "104"));

        MyIterator iterator = userManagement.getIterator();
        while (iterator.hasNext()) {
            User user = (User)iterator.next();
            System.out.println(user.getName());
        }

    }
}

