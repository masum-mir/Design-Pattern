package CreationalDesignPattern.builderPattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("Builder design pattern.");

        User user = new User.UserBuilder()
                .setUserID("123")
                .setUserName("abc")
                .setEmail("abc@gmail.com")
                .build();

        System.out.println(user.toString());

        User user2 = User.UserBuilder.builder().setUserName("Masum").build();
        System.out.println(user2.toString());
    }
}
