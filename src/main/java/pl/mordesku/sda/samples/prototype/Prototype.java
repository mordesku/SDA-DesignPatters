package pl.mordesku.sda.samples.prototype;

/**
 * Created by Mateusz Przybylski on 2017-09-15.
 */
public interface Prototype<T extends Sandwich> {
    T clone();
}
