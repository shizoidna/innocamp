import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
    @Test
    public void setTest() {
        Set<Integer> integers = new HashSet<>();

        integers.add(30);
        integers.add(30);
        integers.add(40);

        System.out.println(integers.size());

        boolean contains30 = integers.contains(30);
        System.out.println(contains30);

        boolean contains50 = integers.contains(50);
        System.out.println(contains50);
// вывод последовательных элементов  со всеми тремя сетами , добавыть туда разных элеменнтов и проверить в каком
// порядке выведеться
    }
}
