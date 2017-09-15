package pl.mordesku.sda.factory.method.encoder;

/**
 * Created by Mateusz Przybylski on 2017-09-15.
 */
public class JPGEncoder implements ImageEncoder{
    public void encodeImage() {
        System.out.println("Encoding image to JPG");
    }
}
