public class AssietteCarree extends Assiette {
    public double cote ;

     public AssietteCarree (int annee_fabrique , double cote){
        super(annee_fabrique);
        this.cote=cote;
    }

    public double calcul_surface () {
        return  cote * cote ;
    } 

    public int calcul_valeur () {
         return (super.calcul_valeur()) * 5 ; 
    }

}