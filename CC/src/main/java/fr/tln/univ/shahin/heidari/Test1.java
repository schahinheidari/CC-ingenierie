package fr.tln.univ.shahin.heidari;

public class Test1 {
    public static void main(String[] args) {
        Employe[] personne = new Employe[2];
        personne[0]= new Ingenieur("Amir", 3000, 1000, 100);
        personne[1]= new Ingenieur( "Shahin", 30000, 0, 1000);
        System.out.println(personne[0].getId());
        System.out.println(personne[1].getId());
        Employe Shahin = new Employe("shah", 12, 1200);
        Ingenieur Amir= new Ingenieur("Amir", 20, 10,20);

    }
}
