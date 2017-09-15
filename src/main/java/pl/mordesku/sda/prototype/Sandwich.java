package pl.mordesku.sda.prototype;

/**
 * Created by Mateusz Przybylski on 2017-09-15.
 */
public class Sandwich implements Prototype<Sandwich> {
    private String name;

    public Sandwich(String name) {
        this.name = name;
    }

    public Sandwich clone() {
        return new Sandwich(name);
    }
}
