package Challenge_2;

public class Cours {
    private int id;
    private String titre;
    private String description;

    public Cours(int id, String titre, String description) {
        this.id = id;
        this.titre = titre;
        this.description = description;
    }

    public int getId() { return id; }
    public String getTitre() { return titre; }
    public String getDescription() { return description; }

    public void afficherInfos() {
        System.out.println(id + titre + " : " + description);
    }
}
