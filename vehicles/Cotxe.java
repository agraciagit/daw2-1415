public class Cotxe extends Vehicle {
    public static final NUM_RODES = 4;
    private boolean traccioTotal;
    public Cotxe(String matricula, int anyMatriculacio, boolean traccioTotal) {
        super(NUM_RODES, matricula, anyMatriculacio);
        this.traccioTotal = traccioTotal;
    }
    public String toString() {
        return super.toString() + " tracció: " + traccioTotal;
    }

}
