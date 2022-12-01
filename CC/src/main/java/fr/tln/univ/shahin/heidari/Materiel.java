package fr.tln.univ.shahin.heidari;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Materiel{

    private int identy;
    private int coutHoraire;

    private int getCout(int nbHeures){
        return 1;
    }

    public void setCoutHoraire(int coutHoraire) {
        this.coutHoraire = coutHoraire;
    }

    public void setIdenty(int identy) {
        this.identy = identy;
    }

    public int getCoutHoraire() {
        return coutHoraire;
    }

    public int getIdenty() {
        return identy;
    }

}
