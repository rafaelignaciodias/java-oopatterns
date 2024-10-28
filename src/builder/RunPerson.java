package builder;

public class RunPerson {

    public static void main(String[] args) {
        System.out.println("BUILDER - OOPatterns Concepts\n");

        // EMPTY PERSON INSTANCE ////////////////////////////////////
        Person person1 = PersonBuilder.create().build();
        System.out.println(person1.toString());

        // PARTIAL PERSON INSTANCE //////////////////////////////////
        Person person2 = PersonBuilder.create()
                .firstName("Jane")
                .lastName("Arruda")
                .build();
        System.out.println(person2.toString());

        // FULL PERSON INSTANCE /////////////////////////////////////
        Person person3 = PersonBuilder.create()
                .firstName("John")
                .lastName("Smith")
                .phone("343-996-3648")
                .email("johnsmith@email.com")
                .address("362 King Street")
                .build();
        System.out.println(person3.toString());
    }
}
