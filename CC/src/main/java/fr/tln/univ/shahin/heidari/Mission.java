package fr.tln.univ.shahin.heidari;

import lombok.Builder;

import java.util.List;

@Builder
public class Mission implements Travail{
    private int nbHeures;
    private List<Employe> employes;
    private List<Materiel> materiels;

    public Mission(int nbHeures, List<Employe> employes, List<Materiel> materiels) {
        this.nbHeures = nbHeures;
        this.employes = employes;
        this.materiels = materiels;
    }

    public int getNbHeures(){
        return this.nbHeures;
    }

    public List<Employe> getEmployes(){
        return this.employes;
    }

    public List<Materiel> getMateriels(){
        return this.materiels;
    }

    public void setNbHeures(int nbHeures){
        this.nbHeures = nbHeures;
    }

    public void addEmploye(Employe employe){
        employes.add(employe);
    }

    public void addMateriel(Materiel materiel){
        materiels.add(materiel);
    }
}
