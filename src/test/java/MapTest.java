import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    @Test
    public void mapTest() {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Andrew");
        map.put(2, "Mykola");
        map.put(3, "Mykola");
        map.put(1, "Adolf");

        for (String value : map.values()) {
            System.out.println(value);
        }
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        for (Integer integer : map.keySet()) {
            System.out.println(map.get(integer));
        }
    }

    //try to work with Map's
}
