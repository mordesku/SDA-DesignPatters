package pl.mordesku.sda.samples.iterator;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-19
 * Time: 18:20
 */
public class IterableHashMap<K,V> extends HashMap<K,V> {
    Iterator<V> getIterator() {
        return new HashMapIterator<K,V>(entrySet());
    }
}
