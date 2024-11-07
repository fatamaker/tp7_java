abstract class Assiette extends Ustensile {
     
    public Assiette (int annee_fabrique){
        super(annee_fabrique);
    }

    abstract public double calcul_surface () ;
}