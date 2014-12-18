public class Gat {
    private String nom;
    private Picarol picarol;
    public Gat(String nom) { this.nom = nom; }
    public Picarol treuPicarol() { 
        Picarol tmp = picarol;
        picarol = null;
        tmp.alliberat(this);
        return tmp;
    }
    public void posaPicarol(Picarol picarol) {
        if (! tePicarol() && picarol.setPropietari(this)) {
            this.picarol = picarol;
        }
    }
    public boolean tePicarol() { return picarol != null; }
    public void moute() {
        System.out.println(this.toString() +  " és mou");
        if (tePicarol()) {
            picarol.sona(this);
        }
    }
    public String toString() {
        return "Gat{nom:"+ nom + " te picarol:" + tePicarol() + " }";
    }
}
