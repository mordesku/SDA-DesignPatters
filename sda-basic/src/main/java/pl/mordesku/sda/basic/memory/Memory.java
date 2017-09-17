package pl.mordesku.sda.basic.memory;

import java.util.*;

/**
 * Created by mordesku on 17.09.2017.
 */
public abstract class Memory {
    private HashMap<String, String> memory = new HashMap<>(100);

    public String put(String key, String value) {
        if (memory.containsKey(key)) {
            return memory.replace(key, value);
        }
        return memory.put(key, value);
    }

    public String get(String key) {
        return memory.get(key);
    }

    public List<String> addresses() {
        ArrayList<String> keys = new ArrayList<>(memory.keySet());
        Collections.sort(keys);
        return keys;
    }
}
