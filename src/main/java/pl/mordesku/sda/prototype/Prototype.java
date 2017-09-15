package pl.mordesku.sda.prototype;

/**
 * Created by Mateusz Przybylski on 2017-09-15.
 */
public interface Prototype<T extends Object> {
    T clone();
}
