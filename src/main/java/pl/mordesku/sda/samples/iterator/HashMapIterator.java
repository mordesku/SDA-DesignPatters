package pl.mordesku.sda.samples.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-19
 * Time: 18:24
 */
public class HashMapIterator<K, V> implements Iterator<V> {

    private final ArrayList<Map.Entry<K, V>> entries;

    private int position = 0;

    public HashMapIterator(Set<Map.Entry<K,V>> entries) {
        this.entries = new ArrayList<>(entries);
    }

    @Override
    public boolean hasNext() {
        return entries.size() > position;
    }

    @Override
    public V next() {
        return entries.get(position++).getValue();
    }
}
