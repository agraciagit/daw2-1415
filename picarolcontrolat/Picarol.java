//************************************************************
//* DEV: Ferran de San Martin
//* DATE: nov - 2014
//* LANG: Java
//* CONT: Relacions entre classes ex1. Classe Picarol
//************************************************************

public class Picarol{
    private static int comptador = 0;
    private int identificador;
    public Picarol() { identificador = comptador; comptador++; }
    public void sona(){
        System.out.println("[picarol] clink-clink");	//es podria fer estatic??	
    }
    public String toString() {
        return "Sóc el Picarol nr. " + identificador;
    } 
}
