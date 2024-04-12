package CreationalDesignPattern.builderPattern;

public class User {

    private String userID;
    private String userName;
    private String email;

    private User(UserBuilder builder) {
        this.userID = builder.userID;
        this.userName = builder.userName;
        this.email = builder.email;
    }

    // only getter no setter
    public String getUserID() {
        return userID;
    }
    public String getUserName() {
        return userName;
    }
    public String getEmail() {
        return email;
    }

    // inner class to create object
    static class UserBuilder {
        private String userID;
        private String userName;
        private String email;

        public UserBuilder() {

        }

        public static UserBuilder builder() {
            return new UserBuilder();
        }

        // only setter not getter
        public UserBuilder setUserID(String userID) {
            this.userID = userID;
            return this;
        }
        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }
        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
