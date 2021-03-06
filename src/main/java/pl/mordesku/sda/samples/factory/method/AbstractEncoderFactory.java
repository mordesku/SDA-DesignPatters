package pl.mordesku.sda.samples.factory.method;

import pl.mordesku.sda.samples.factory.method.encoder.EncoderType;
import pl.mordesku.sda.samples.factory.method.encoder.ImageEncoder;

/**
 * Created by Mateusz Przybylski on 2017-09-15.
 */
public abstract class AbstractEncoderFactory {
    public abstract ImageEncoder getEncoder(EncoderType type);
}
