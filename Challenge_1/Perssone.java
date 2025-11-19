public class Perssone {

    private String nom;
    private int age;
    private Passeport passport;

    public Perssone (String nom , int age){
        this.nom = nom;
        this.age = age;
    }

    public void assignerPasseport(Passeport p){
        this.passport = p;
    }
    public void afficherInfos(){
        System.out.println("Nom : " + nom +"\nAge :" + age +"\nPassport :");
        if(passport != null){
            System.out.println(passport);
        }else{
            System.out.println("pas de passeport.");
        }
    }
}
