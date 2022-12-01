package fr.tln.univ.shahin.heidari;

import lombok.Builder;
import lombok.experimental.SuperBuilder;

public class Personne {
    private static int instanceCount = 0;
    @Builder.Default
    //Calcul automatique de l'id
    private int id = ++instanceCount;
    private String nom;

    public void setNom(String nom){
        this.nom = nom;
    }

    public int getId(){
        return this.id;
    }

    public String getNom(){
        return this.nom;
    }

    @Override
    public String toString(){
        return "Id : " + this.getId() + " Nom : " + this.getNom();
    }

}
