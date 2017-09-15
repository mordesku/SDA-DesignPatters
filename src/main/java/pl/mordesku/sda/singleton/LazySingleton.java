package pl.mordesku.sda.singleton;

/**
 * Created by Mateusz Przybylski on 2017-09-15.
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if ( instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Lazy singleton is doing something");
    }
}
