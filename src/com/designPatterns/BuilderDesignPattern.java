package com.designPatterns;

 class User {

    // required fields
    private final String username;
    private final String password;

    // optional fields
    private final String email;
    private final String phone;
    private final String address;

    // private constructor
    private User(UserBuilder builder) {
        this.username = builder.username;
        this.password = builder.password;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // Getters
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    // Static inner Builder class
    public static class UserBuilder {

        // required fields
        private final String username;
        private final String password;

        // optional fields
        private String email;
        private String phone;
        private String address;

        public UserBuilder(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

public class BuilderDesignPattern {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("pankaj", "securePass123")
                .email("pankaj@example.com")
                .phone("9876543210")
                .build();

        User user2 = new User.UserBuilder("rohit", "pass456")
                .address("Mumbai, India")
                .build();

        System.out.println(user1);
        System.out.println(user2);
    }
}
