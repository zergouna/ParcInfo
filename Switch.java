public class Switch extends Materiel {
    private int nbPort;

    public Switch(int nbPort) {
        super("", ""); // Appel au constructeur de la classe Materiel, les paramètres vides peuvent être remplacés par des valeurs appropriées si nécessaires
        this.nbPort = nbPort;
    }

    @Override
    public String toString() {
        return "Le nombre de ports est " + nbPort + "\n";
    }

    // Si la méthode chercheMateriel doit être implémentée, assurez-vous de la réaliser selon votre logique métier
    public char[] chercheMateriel(String string) {
        return null;
    }
}
