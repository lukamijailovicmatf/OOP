package Primer04;

/* Posto smo rekli da je Buva "cloneable", moramo implementirati Cloneable interfejs i u
   baznoj klasi takodje, pa klasa Zivotinja treba da bude promenjena na sledeci nacin:
      public class Zivotinja implements Cloneable{
          // Detalji klase isti kao i ranije
      }
*/

public class Zivotinja implements Cloneable {

    private String vrsta; // vrsta zivotinje

    // konstruktor za Zivotinju
    public Zivotinja(String vrsta){
        this.vrsta = vrsta;
    }

    public Zivotinja(){

    }

    // metod za oglasavanje
    public void zvuk(){

    }

    @Override
    public String toString() {
        return "Zivotinja: " + vrsta;
    }
}
