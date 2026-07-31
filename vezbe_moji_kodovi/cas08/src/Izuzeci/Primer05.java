package Izuzeci;

import java.util.Scanner;

public class Primer05 {

    // NullPointerException voditi racuna na ispitu
    public static void main(String[] args) {

        Scanner ulaz = null; // null znaci da je objekat nepostojeci

        try {
            int x = ulaz.nextInt();
            System.out.println(x);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("desilo se nesto sto nismo ocekivali");
            System.exit(1);
        } finally {
            if (ulaz != null)
                ulaz.close();
        }
    }
}
