import java.time.LocalDate;
abstract class Ustensile {
    public int annee_fabrique ;

    public Ustensile (int annee_fabrique) {
        this.annee_fabrique=annee_fabrique ;
    }

    public int getannee () {
        return annee_fabrique ;
    }

    
    public int calcul_valeur () {
        LocalDate dateCourante = LocalDate.now(); 
        int annee = dateCourante.getYear();
        int age = annee -annee_fabrique ;
        int Valeur =0 ;
        if (age >50){
           Valeur= (age-50) * 1 ;
        }
        return Valeur ;

    }

}