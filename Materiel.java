import java.io.Serializable;

class Materiel implements Serializable {
    private String numeroSerie;
    private String nom;
    private String nomParc;
    public Materiel(String numeroSerie, String nom) {
        this.numeroSerie = numeroSerie;
        this.nom = nom;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Numéro de série : " + numeroSerie + ", Nom : " + nom;
    }
}
