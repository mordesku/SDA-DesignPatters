package pl.mordesku.sda.samples.factory.method.encoder;

/**
 * Created by Mateusz Przybylski on 2017-09-15.
 */
public class GIFEncoder implements ImageEncoder{
    public void encodeImage() {
        System.out.println("Encoding image to GIF");
    }
}
