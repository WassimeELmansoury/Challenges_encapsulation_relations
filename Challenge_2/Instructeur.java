package Challenge_2;

import java.util.List;
import java.util.ArrayList;

public class Instructeur {
    private int id;
    private String nom;
    private String specialisation;
    private List<Cours> coursEnseignes = new ArrayList<>();

    public Instructeur(int id, String nom, String specialisation) {
        this.id = id;
        this.nom = nom;
        this.specialisation = specialisation;
    }

    public void ajouterCours(Cours c) {
        coursEnseignes.add(c);
    }

    public void afficherCours() {
        System.out.println("Cours de " + nom + " :");
        for (Cours cours : coursEnseignes) {
            cours.afficherInfos();
        }
    }
}
