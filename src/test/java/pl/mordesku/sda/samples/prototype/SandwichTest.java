package pl.mordesku.sda.samples.prototype;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by Mateusz Przybylski on 2017-09-15.
 */
public class SandwichTest {
    @Test
    public void testCloneSandwich() {
        Sandwich sandwich = new Sandwich("chicken sandwich");
        Sandwich clonedSandwich = sandwich.clone();

        assertNotEquals(sandwich, clonedSandwich);
    }

}