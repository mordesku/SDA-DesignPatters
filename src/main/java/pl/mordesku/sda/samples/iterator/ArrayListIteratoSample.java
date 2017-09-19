package pl.mordesku.sda.samples.iterator;

import java.util.Iterator;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-19
 * Time: 18:10
 */
public class ArrayListIteratoSample {
    public static void main(String[] args) {
        //List<String> test = Arrays.asList("raz", "dwa", "trzy", "cztery");
        IterableHashMap<String, String> map = new IterableHashMap<>();
        map.put("raz", "raz");
        map.put("dwa", "dwa");
        map.put("trzy", "trzy");
        map.put("cztery", "cztery");
        Iterator<String> iterator = map.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
