import java.util.LinkedList;
import java.util.Optional;

public class Primer06 {
    public static void main(String[] args) {

        LinkedList<String> lista = new LinkedList<>();

        lista.add("matf");
        lista.add("luka");
        lista.add("ivan");

        // "Optional" korisno kada želimo eksplicitno raditi sa situacijama gde vrednost može
        // ili ne mora postojati
        Optional<String> prvi = lista.stream().findFirst();

        if (prvi.isPresent()) {
            System.out.println(prvi.get());
        }
    }
}
