package personal.singleton;

public class RunSingleton {
    public static void main(String[] args) {

        Singleton singletonInstance1 = Singleton.getInstance();
        System.out.println(singletonInstance1);

        Singleton singletonInstance2 = Singleton.getInstance();
        System.out.println(singletonInstance2);

    }
}