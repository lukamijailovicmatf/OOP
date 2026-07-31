public class Primer12 {

    // Program prikazuje kako mozemo prebrojati broj pojavljivanja datog podstringa u stringu
    // Zadatak je da se razvije program koji ce za datu dnk sekvencu neke osobe vratiti broj pojavljivanja
    // sekvence ATGC kako bi mogli da nakon vise ispitanih osoba procene u kojoj meri ljudi poseduju sekvencu
    // ATGC koju su pronasli kod Cak Norisa

    public static void main(String[] args) {

        String sekvencaDna = "ggcgatatgcagtagcgcttctatgccataccgtatgctacacaacgtgatgcggccacttaggggcttctgtaagcgagt";
        String CakDna = "atgc";

        int broj = brojPojavljivanja(sekvencaDna, CakDna);
        System.out.println(broj);

    }

    static int brojPojavljivanja(String sekvencaDna, String CakDna){

        int broj = 0;

        // Trazimo indeks prvog pojavljivanja podstringa koji trazimo
        int i = sekvencaDna.indexOf(CakDna);

        while(i != -1){ // Sve dok ne uspemo da pronadjemo pojavljivanje

            // Ako smo usli u petlju, znamo da imamo barem jedno pojavljivanje
            broj++;

            // Iz stringa koji pretrazujemo, odbacujemo deo koji smo pretrazili
            sekvencaDna = sekvencaDna.substring(i + CakDna.length());

            // Trazimo ponovo pojavljivanja podstringa u ostatku stringa
            i = sekvencaDna.indexOf(CakDna);
        }
        return broj;
    }

}
