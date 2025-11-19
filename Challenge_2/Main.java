package Challenge_2;

public class Main {
    public static void main(String[] args){
        Instructeur instru = new Instructeur(61, "wassim", "Java");

        Cours c1 = new Cours(1, " Java", "Encapsulation in Java.");
        Cours c2 = new Cours(2, "Java", "Relationship in java.");

        instru.ajouterCours(c1);
        instru.ajouterCours(c2);

        instru.afficherCours();

    }
}
