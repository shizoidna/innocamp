import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTest {

    @Test
    public void stringTest() {
        String s1 = "hello";



        String substring = s1.substring(2,4);
        assertEquals("ll", substring);
//        System.out.println(substring);
//        System.out.println(s1.isEmpty());
//        System.out.println(s1.charAt(1));
        //Try methods of String
    }

    @Test
    public void stringConcat() {
        String s1 = "hello";
        String s2 = " world";

       String concat =  s1.concat(s2);

       String concat1 = s1 + " " + s2;

        System.out.println(concat);
    }

    @Test
    public void stringConcatNumber() {
        String s = "" + 12;

        String s1 = "" + (12 + 13);
        System.out.println(s1);
    }

    @Test
    public void stringReverse() {
        String s = "hello";

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }

    @Test
    public void stringFormat() {
        String s1 = "hello";
        String s2 = "user";

        for (int i = 0; i < 10; i++) {
            String formatted = String.format("%s %s #%d", s1, s2, i);
            System.out.print(formatted);
        }

        //work with String.format, write some code lines
    }

    @Test
    public void stringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append("world").append(1);

        String s = sb.toString();
    }
}
