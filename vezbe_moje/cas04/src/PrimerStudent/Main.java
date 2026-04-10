package PrimerStudent;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Marko", "Markovic", "mi22002", 10);
        Student s2 = new StudentSaI("Ana", "Markovic", "mi22101", 7.5, 10);
        Student s3 = new StudentSaR("Jana", "Markovic", "mi22102", 7.5, 10);

        System.out.println(s1);
        //System.out.println(s2.getIme() + " ima alas nalog " + s2.getAlas());
        System.out.println(s2);
        System.out.println(s3);
    }
}
