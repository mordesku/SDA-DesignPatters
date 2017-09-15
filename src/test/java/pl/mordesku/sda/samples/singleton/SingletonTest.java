package pl.mordesku.sda.samples.singleton;

import org.junit.Test;

/**
 * Created by Mateusz Przybylski on 2017-09-15.
 */
public class SingletonTest {
    @Test
    public void testEagerSingleton() {
        //given
        //when
        EagerSingleton instance = EagerSingleton.INSTANCE;
        //then
        instance.doSomething();
    }

    @Test
    public void testEnumSingleton() {
        //given
        //when
        EnumSingleton instance = EnumSingleton.INSTANCE;
        //then
        instance.doSomething();
    }

    @Test
    public void testLazySingleton() {
        //given
        //when
        LazySingleton instance = LazySingleton.getInstance();
        //then
        instance.doSomething();
    }
}