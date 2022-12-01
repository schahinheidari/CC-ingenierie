package fr.tln.univ.shahin.heidari;

public class Employe extends Personne{
    private final int id ;
    private final String nom;
    private int salarieHoraire;

    public Employe(String nom, int id, int salarieHoraire) {
        this.id = id;
        this.nom = nom;
        this.salarieHoraire = salarieHoraire;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int calculeSalarie(int nbHoure){
        return 1;
    }
    public void setSalarieHoraire(int salarieHoraire){
        if (salarieHoraire > 0){
            this.salarieHoraire = salarieHoraire;
        }else {
            System.out.println("Il y a  l'Exception ForbiddenSalaryException");
        }
    }
    public int getSalarieHoraire(){
            return this.salarieHoraire;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "salarieHoraire=" + this.salarieHoraire +
                '}';
    }


}
