package pl.mordesku.sda.samples.singleton;

/**
 * Created by Mateusz Przybylski on 2017-09-15.
 */
public enum EnumSingleton {
    INSTANCE;
    public void doSomething() {
        System.out.println("Enum singleton is doing something");
    }
}
