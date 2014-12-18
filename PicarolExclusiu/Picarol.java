public class Picarol {
    private final String so;
    private Object propietari;
    public Picarol(String so) {
        this.so = so;
    }
    public void sona(Object quiDemana) {
        if (quiDemana == propietari) {
            System.out.println(so);
        }
    }
    public boolean setPropietari(Object propietari) {
        if (this.propietari == null) {
            this.propietari = propietari;
            return true;
        }
        return false;
    }
    public boolean alliberat(Object quiDemana) {
        if (quiDemana == propietari) {
            this.propietari = null;
            return true;
        }
        return false;
    }
    public boolean socElTeuPropietari(Object quiDemana) {
        return this.propietari == quiDemana;
    }
}
