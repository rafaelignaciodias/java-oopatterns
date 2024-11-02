package personal.builder;

public class Person {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;

    public Person(PersonBuilder builder) {
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.phone = builder.getPhone();
        this.email = builder.getEmail();
        this.address = builder.getAddress();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
