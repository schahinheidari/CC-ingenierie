package fr.tln.univ.shahin.heidari;

public class Ingenieur extends Employe{
    private int prime;
    private static int indemnite;

    public Ingenieur(String nom, int id, int salarieHoraire, int prime) {
        super(nom, id, salarieHoraire);
        this.prime = prime;
    }


    public int getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }

    public static int getIndemnite() {
        return indemnite;
    }

    public static void setIndemnite(int indemnite) {
        Ingenieur.indemnite = indemnite;
    }

    @Override
    public String toString() {
        return super.toString() + "Ingenieur{" +
                "prime=" + this.getPrime() +"Indeminite=" +Ingenieur.getIndemnite()+
                '}';
    }
}
