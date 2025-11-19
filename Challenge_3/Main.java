package Challenge_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant(1, "wassime");
        Etudiant e2 = new Etudiant(2, "ismail");

        Cours c1 = new Cours(101, "Java");
        Cours c2 = new Cours(102, "JS");

        // Inscriptions
        e1.inscrire(c1);
        e1.inscrire(c2);
        e2.inscrire(c1);

        // Afficher
        e1.afficherCours();
        e2.afficherCours();

        c1.afficherEtudiants();
        c2.afficherEtudiants();
    }
}
