import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


class Parc {
    private String nomParc;
    private List<Materiel> parc = new ArrayList<>();
    private Connection connexion;

    public Parc() {
        this.nomParc = "Parc Informatique sans nom";
    }

    public Parc(String nomParc) {
        this.nomParc = nomParc;
    }

    public void ajouterMateriel(String numeroSerie, String nom) {
        // Vérification pour éviter d'ajouter un matériel déjà existant
        boolean existeDeja = parc.stream().anyMatch(materiel -> materiel.getNumeroSerie().equals(numeroSerie));

        if (!existeDeja) {
            Materiel materiel = new Materiel(numeroSerie, nom);
            parc.add(materiel);
        } else {
            System.out.println("Le matériel avec le numéro de série " + numeroSerie + " existe déjà dans le parc.");
        }
    }

    public void afficherParc() {
        System.out.println("Parc : " + nomParc);
        for (Materiel materiel : parc) {
            System.out.println(materiel);
        }
    }

    public void supprimer(String numeroSerie) {
        parc.removeIf(materiel -> {
            String numero = materiel.getNumeroSerie();
            return numero != null && numero.equals(numeroSerie);
        });
    }
    

    public boolean chercheMateriel(String numeroSerie) {
        for (Materiel materiel : parc) {
            if (materiel.getNumeroSerie().equals(numeroSerie)) {
                return true;
            }
        }
        return false;
    }

    public boolean chercheMaterielParType(String numeroSerie){
        final List <Materiel> List2 = new ArrayList<>();
        for (Materiel materiel : parc) {
            System.out.println(materiel);
            materiel.getClass();
            if (materiel.getNumeroSerie().equals(numeroSerie)){
                 List2.add(materiel);
                 System.out.println(materiel);
                 return true;
                }
        }
        return false;
    }

    public void sauvegarderParc() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("parc.txt"))) {
            out.writeObject(parc);
            System.out.println("Parc informatique sauvegardé avec succès !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }  
}



