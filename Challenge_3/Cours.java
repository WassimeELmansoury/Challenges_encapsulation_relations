package Challenge_3;
import java.util.ArrayList;
import java.util.List;

class Cours {
    private int id;
    private String titre;
    List<Etudiant> inscrits;

    public Cours(int id, String titre) {
        this.id = id;
        this.titre = titre;
        this.inscrits = new ArrayList<>();
    }

    public void ajouterEtudiant(Etudiant e) {
        inscrits.add(e); // ajouter l'étudiant
    }

    public void afficherEtudiants() {
        System.out.println("Étudiants inscrits au cours " + titre + ":");
        for (int i = 0; i < inscrits.size(); i++) {
            System.out.println("- " + inscrits.get(i).getNom());
        }
    }

    public String getTitre() {
        return titre;
    }
}
