public class Vehicle {
    public final int nRodes;
    private String matricula;
    private int anyMatriculacio;
    
    public Vehicle(int nRodes, String matricula, int anyMatriculacio) {
        this.nRodes = nRodes;
        this.matricula = matricula;
        this.anyMatriculacio = anyMatriculacio;
    }
    
    public int getRodes(){ return this.nRodes; }
    
    public String getMatricula(){ return this.matricula; }
    
    // assigna una nova matricula assignant l'any de matriculació actual
    public void rematricula(String novaMatricula){
		int anyActual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		rematricula(novaMatricula, anyActual);
	}
	
	public void rematricula(String novaMatricula, int anyMatricula){
		this.matricula = novaMatricula;
		this.anyMatriculacio = anyMatricula;
	}
}
