package pl.mordesku.sda.samples.factory.method;

import pl.mordesku.sda.samples.factory.method.encoder.BMPEncoder;
import pl.mordesku.sda.samples.factory.method.encoder.EncoderType;
import pl.mordesku.sda.samples.factory.method.encoder.GIFEncoder;
import pl.mordesku.sda.samples.factory.method.encoder.ImageEncoder;
import pl.mordesku.sda.samples.factory.method.encoder.JPGEncoder;
import pl.mordesku.sda.samples.factory.method.encoder.PNGEncoder;

/**
 * Created by Mateusz Przybylski on 2017-09-15.
 */
public class EncoderFactory extends AbstractEncoderFactory {
    public ImageEncoder getEncoder(EncoderType type) {
        switch (type) {
            case BMP:
                return new BMPEncoder();
            case GIF:
                return new GIFEncoder();
            case JPG:
                return new JPGEncoder();
            case PNG:
            default:
                return new PNGEncoder();
        }
    }
}
