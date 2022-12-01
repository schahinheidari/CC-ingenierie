package fr.tln.univ.shahin.heidari;

import lombok.Builder;

import java.util.List;
@Builder
public class FactureDeMission {
    private List<ItemDeFacture> itemDeFacture;
    private int nbHeures;

    public int getTotal(){
        int somme = 0;
        for (ItemDeFacture object: itemDeFacture) {
            somme += object.getTarif(nbHeures);
        }
        return somme;
    }
}
