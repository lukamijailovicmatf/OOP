import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Primer07 {
    public static void main(String[] args) {

        List<Integer> lista = new LinkedList<>(Arrays.asList(5, 5, 4, 6));

        lista.stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        lista.stream()
                .reduce((e1, e2) -> e1 * e2)
                .ifPresent(System.out::println);
    }
}
