package Challenge_3;

import java.util.ArrayList;
import java.util.List;

class Etudiant {
    private int id;
    private String nom;
    private List<Cours> coursSuivis;



    public Etudiant(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.coursSuivis = new ArrayList<>();
    }
    public void inscrire(Cours c) {
        if (!coursSuivis.contains(c)) {
            coursSuivis.add(c);
            c.ajouterEtudiant(this);
        }
    }
    public void afficherCours() {
        System.out.println("Cours suivis par " + nom + ":");
        for (int i = 0; i < coursSuivis.size(); i++) {
            Cours c = coursSuivis.get(i);
            System.out.println(c.getTitre());
        }
    }
    public String getNom() {
        return nom;
    }
}