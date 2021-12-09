package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("Name")
                .age(30)
                .job("1")
                .job("2")
                .lastName("Lastname")
                .build();
        System.out.println(user);
    }
}
