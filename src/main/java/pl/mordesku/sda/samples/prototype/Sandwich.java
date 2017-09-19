package pl.mordesku.sda.samples.prototype;

/**
 * Created by Mateusz Przybylski on 2017-09-15.
 */
public class Sandwich implements Prototype<Sandwich> {
    private String name;
    private String ingridients;
    private Sandwich internalSandwich;

    public Sandwich(String name) {
        this.name = name;
    }

    public String getIngridients() {
        return ingridients;
    }

    public void setIngridients(String ingridients) {
        this.ingridients = ingridients;
    }

    public Sandwich getInternalSandwich() {
        return internalSandwich;
    }

    public void setInternalSandwich(Sandwich internalSandwich) {
        this.internalSandwich = internalSandwich;
    }

    public Sandwich clone() {
        Sandwich sandwich = new Sandwich(name);
        sandwich.setIngridients(this.getIngridients());
        sandwich.setInternalSandwich(this.getInternalSandwich().clone());
        return sandwich;
    }
}
