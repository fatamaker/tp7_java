
public class AssietteRonde extends Assiette {
    public double rayon ;

    public AssietteRonde (int annee_fabrique , double rayon){
        super(annee_fabrique);
        this.rayon=rayon;
    }

    public double calcul_surface () {
        return  3.14 * rayon * rayon ;
    } 


}


       
    