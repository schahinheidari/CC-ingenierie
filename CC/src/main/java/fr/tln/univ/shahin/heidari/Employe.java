package fr.tln.univ.shahin.heidari;

import java.util.Comparator;
import java.util.List;

public class Employe extends Personne implements ItemDeFacture{
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
            System.out.println("Il y a l'Exception ForbiddenSalaryException");
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
    @Override
    public int getTarif(int nbHeures) {
        return (int)(this.salarieHoraire * 1.10);
    }

    static Comparator<Employe> compareParId = new Comparator<Employe>() {
        @Override
        public int compare(Employe o1, Employe o2) {
            return o1.getId() - (o2.getId());
        }
    };

    static Comparator<Employe> compareParNom = new Comparator<Employe>() {
        @Override
        public int compare(Employe o1, Employe o2) {
            return o1.getSalarieHoraire() - (o2.getSalarieHoraire());
        }
    };
}
