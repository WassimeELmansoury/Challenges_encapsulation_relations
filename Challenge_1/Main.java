public class Main {
    public static void main(String[] args) {

        Passeport  vis = new Passeport("IC10023","Marocaine","2023-12-12");
        Perssone pers = new Perssone("wassim",23);

        pers.assignerPasseport(vis);
        vis.afficherInfos();
    }
}