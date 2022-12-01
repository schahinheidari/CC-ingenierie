package fr.tln.univ.shahin.heidari;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Employe[] personne = new Employe[2];
        personne[0]= new Ingenieur("Amir", 3000, 1000, 100);
        personne[1]= new Ingenieur( "Shahin", 30000, 0, 1000);
        System.out.println(personne[0].getId());
        System.out.println(personne[1].getId());
        var Shahin = new Employe("shah", 12, 1200);
        var Amir= new Ingenieur("Amir", 20, 10,20);

        Materiel[] materiels = new Materiel[3];


        var box2 = new Test2();
        box2.ajouter(Shahin);
        Employe emp1 = box2.getEmploye(1);

    }

}
class Test2{
    Map<Integer, Employe> personne;
    public Test2(){
        personne = new HashMap<>();
    }
    public void ajouter(Employe employe){
        personne.put(employe.getId(), employe);
    }
    public Employe getEmploye(Integer intId){
        return personne.get(intId);
    }
}