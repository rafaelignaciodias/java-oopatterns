package personal.builder;

public class PersonBuilder {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;

    // MAIN CONSTRUCTOR /////////////////////////////////////////////
    // Private constructor to prevent direct instantiation
    private PersonBuilder() {}


    // BUILDER CREATOR //////////////////////////////////////////////
    // Static method to create a new PersonBuilder instance
    public static PersonBuilder create() {
        return new PersonBuilder();
    }


    // BUILDER SETTERS //////////////////////////////////////////////
    // Method to set the first name
    public PersonBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    // Method to set the last name
    public PersonBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    // Method to set the phone number
    public PersonBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    // Method to set the email address
    public PersonBuilder email(String email) {
        this.email = email;
        return this;
    }

    // Method to set the physical address
    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    // Method to build the Person instance
    public Person build() {
        return new Person(this);
    }


    // GETTERS //////////////////////////////////////////////////////
    // Getter for first name
    public String getFirstName() {
        return this.firstName;
    }

    // Getter for last name
    public String getLastName() {
        return this.lastName;
    }

    // Getter for phone number
    public String getPhone() {
        return this.phone;
    }

    // Getter for email address
    public String getEmail() {
        return this.email;
    }

    // Getter for physical address
    public String getAddress() {
        return this.address;
    }
}
