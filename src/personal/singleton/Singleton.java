package personal.singleton;

public class Singleton {

    // Private static variable to hold the single instance of Singleton
    private static Singleton singleObject;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
    }

    // Public method to provide access to the Singleton instance
    public static synchronized Singleton getInstance() {

        // Check if the instance is null
        if (singleObject == null) {

            // If null, create a new instance (synchronized for thread safety)
            singleObject = new Singleton();
        }

        // Return the single instance
        return singleObject;

    }
}