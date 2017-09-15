package pl.mordesku.sda.samples.factory.method;

import org.junit.Test;

import pl.mordesku.sda.samples.factory.method.encoder.EncoderType;
import pl.mordesku.sda.samples.factory.method.encoder.ImageEncoder;

/**
 * Created by Mateusz Przybylski on 2017-09-15.
 */
public class EncoderFactoryTest {
    EncoderFactory encoderFactory = new EncoderFactory();
    @Test
    public void testCreatePNGEncoder() {
        ImageEncoder encoder = encoderFactory.getEncoder(EncoderType.PNG);
        encoder.encodeImage();
    }

    @Test
    public void testCreateJPGEncoder() {
        ImageEncoder encoder = encoderFactory.getEncoder(EncoderType.JPG);
        encoder.encodeImage();
    }
}