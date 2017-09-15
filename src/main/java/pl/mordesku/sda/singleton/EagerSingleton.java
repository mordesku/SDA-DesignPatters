package pl.mordesku.sda.singleton;

/**
 * Created by Mateusz Przybylski on 2017-09-15.
 */
public class EagerSingleton {
    public static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
    }

    public void doSomething() {
        System.out.println("EagerSingleton is doing something");
    }
}
