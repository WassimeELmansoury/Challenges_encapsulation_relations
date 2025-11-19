import java.sql.DataTruncation;

public class Passeport {
    private String numero;
    private String nationalite;
    private String dateExpiration;

    public Passeport(String numero, String nationalite, String dateExpiration) {
        this.numero = numero;
        this.nationalite = nationalite;
        this.dateExpiration = dateExpiration;

    }

    @Override
    public String toString() {
        return "Passeport{" +
                "numero='" + numero + '\'' +
                ", nationalite='" + nationalite + '\'' +
                ", dateExpiration='" + dateExpiration + '\'' +
                '}';
    }
    public void afficherInfos(){
            System.out.println("Numéro : " + numero);
            System.out.println("Nationalité : " + nationalite);
            System.out.println("Date d'expiration : " + dateExpiration);    }

}