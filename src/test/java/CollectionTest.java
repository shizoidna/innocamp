import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest {
    @Test

    public void arrayListTest() {

        ArrayList<Integer> integerList = new ArrayList<>();

        integerList.add(2);
        integerList.add(3);

        System.out.println(integerList.size());
        System.out.println(integerList.get(1));

        for (Integer integer : integerList) {
            System.out.println(integer);
        }

        integerList.remove(new Integer(3));

        integerList.remove(Integer.valueOf(3));

    }

    @Test
    public void arrayListConcat() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);

        ArrayList<Integer> integers1 = new ArrayList<>();
        integers.add(2);

        integers.addAll(integers1);

        //work with these methods of ArrayList
    }

    @Test
    public void linkedListConcat() {
       LinkedList<Integer> integers =  new LinkedList<>();

       integers.offer(12);
       integers.offer(13);
       integers.offer(14);

       Integer poll = integers.poll();
        System.out.println(poll);
        System.out.println(integers.size());

        Integer peek = integers.peek();
        System.out.println(peek);
        System.out.println(integers.size());
    }

    @Test
    public void equalsToStringTest() {
        ArrayList<Pussy> pussies = new ArrayList<>();

        Pussy tom = new Pussy(12, "Tom");
        pussies.add(tom);
        pussies.add(new Pussy(3, "Richard"));
        pussies.add(new Pussy(4, "Tom"));

        //Pussy tom = new Pussy(10, "Loki");
        //попробовати з цим котом equals and hash code

        System.out.println(pussies.contains(tom));
        System.out.println(pussies.contains(new Pussy(12, "Tom")));

        for (Pussy pussy : pussies) {
            System.out.println(pussy);
        }
    }
}
