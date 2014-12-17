public class Vehicle {
    private final int nRodes;
    private final String matricula;
    private final int anyMatriculacio;
    public Vehicle(int nRodes, String matricula, int anyMatriculacio) {
        this.nRodes = nRodes;
        this.matricula = matricula;
        this.anyMatriculacio = anyMatriculacio;
    }
    public int getNRodes() {
        return nRodes;
    }
    public String getMatricula() {
        return matricula;
    }

    // assigna una nova matrícula assignant l'any de matriculació a
    // l'actual
    public void rematricula(String novaMatricula) {
        int anyActual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        rematricula(novaMatricula, anyActual);
    }

    public void rematricula(String novaMatricula, int anyMatricula) {
        this.matricula = novaMatricula;
        this.anyMatriculacio = anyMatricula;
    }
}
