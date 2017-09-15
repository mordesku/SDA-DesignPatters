package pl.mordesku.sda.excercise.abstr.factory;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-15
 * Time: 18:38
 */
public class Customer {
    private AbstractOrderFactory factory;

    public Customer(AbstractOrderFactory factory) {
        this.factory = factory;
    }

    public void eat() {
        System.out.println("Pizza: " + factory.getPizza().showPizza());
        System.out.println("Drink: " + factory.getDrink().getName());
    }
}
