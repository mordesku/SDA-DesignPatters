package pl.mordesku.sda.excercise.abstr.factory;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-15
 * Time: 20:05
 */
public class OrdersFactory {
    public AbstractOrderFactory getOrder(OrderType orderType) {
        switch (orderType) {
            case CAPRICIOSA_WITH_COLA:
                return new CapriciosaColaOrderFactory();
            case HAWAI_WITH_FANTA:
            default:
                return new HawaFantaOrderFactory();

        }
    }
}
