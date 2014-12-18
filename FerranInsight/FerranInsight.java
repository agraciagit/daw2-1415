import java.util.Vector;

class FerranInsight {
    private static final Protegida content = new Protegida();
    private final String nom;
    public FerranInsight(String nom) {
        this.nom = nom;
    }
    public static boolean tothomContent() {
        return content.getValor();
    }
    public void posatDescontent() { content.setFalse(); }
    public String toString() { return "FerranInsight( nom: " + nom +")" ; }
    public static void main(String[] args) {
        Vector<FerranInsight> alumnes = new Vector<FerranInsight>();
        for (int i = 0; i<10; i++) {
            FerranInsight ferran = new FerranInsight("Ferran "+i);
            alumnes.add(ferran);
            if (i == 5) { 
                ferran.posatDescontent();
            }
            System.out.println("Afegit el Ferran: " + ferran +
                    " contents?: " + FerranInsight.tothomContent());
        }
        alumnes.elementAt(5).content = new Protegida();


        // mostra tots
        for (FerranInsight ferran: alumnes) {
            System.out.println("Tinc el Ferran: " + ferran +
                    " contents?: " + FerranInsight.tothomContent());
        }
        // Equival a:
        //for (int i=0; i < alumnes.size(); i++) {
        //    FerranInsight ferran = alumnes.elementAt(i);
        //    System.out.println("Tinc el Ferran: " + ferran); 
        //}
    }

}

class Protegida {
    private boolean valor = true;
    public void setFalse() { valor = false; }
    public boolean getValor() { return valor; }
}

