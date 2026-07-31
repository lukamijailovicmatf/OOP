import java.util.LinkedList;
import java.util.List;

public class Primer02 {
    public static void main(String[] args) {

        List<String> lista = new LinkedList<>();

        lista.add("coijoiauoi");
        lista.add("ijoija");
        lista.add("caijoicjao");
        lista.add("cccc");
        lista.add("pokoijc");

        System.out.println(lista);

        lista.stream()
                .filter(e -> e.charAt(0) == 'c')
                .map(e -> e.toUpperCase())
                .sorted()
                .forEach(e -> System.out.print(e + " "));
    }
}
