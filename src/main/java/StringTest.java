public class StringTest {
    public static void main(String[] args) {
        String first = "first text";
        System.out.println(first);

        first.concat(" and a piece");
        System.out.println(first);

        String second = first.concat(" and a second piece");
        System.out.println(second);
    }
}
