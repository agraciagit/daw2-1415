import java.util.Vector;

public class UsaVehicles {
    private Vector<Vehicle> vehicles;

    public UsaVehicles() {
        vehicles = new Vector<Vehicle>();
    }

    public void inicialitzaVehicles() {
        for (int i = 0; i < 10; i++) {
            Vehicle nou;
            if (i % 2 == 0) {
                nou = new Moto(String.format("%04d", i) + "BKJ", (1990+i));
            } else {
                nou = new Cotxe(String.format("%04d", i) + "BKJ", (1990+i), i % 3 == 0 );
            }
            vehicles.add(nou);
        }
    }

    public void llistaVehicles() {
        for(Vehicle vehicle: vehicles) {
            System.out.println(vehicle.getMatricula());
        }
    }

    public static void main(String[] args) {
        UsaVehicles usa = new UsaVehicles();
        usa.inicialitzaVehicles();
        usa.llistaVehicles();
    }
}
