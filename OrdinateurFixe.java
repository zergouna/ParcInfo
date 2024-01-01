class OrdinateurFixe extends Materiel {
    String clavier;
    String sourit;
    public OrdinateurFixe(String clavier, String sourit) {
        super(clavier, sourit);
    }
    @Override

    public String toString(){
        return "Le type de clavier" + clavier + "\n" + "Le type de sourit" + sourit + '\n';

    }
    public char[] chercheMateriel(String string) {
        return null;
    }
}
