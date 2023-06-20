package solid.ocp;

import solid.ocp.vehicle.Car;
import solid.ocp.vehicle.Motorcycle;

public class Teste {

    private static TypeVehicle typeVehicle;


    public static void main(String[] args) {
        if (typeVehicle == TypeVehicle.CAR) {
            Car car = new Car("Verde", "2023", 3.0, 4);

        } else if (typeVehicle == TypeVehicle.MOTORCYCLE) {
            Motorcycle motorcycle = new Motorcycle("Branca", "2011", 250);
        }
    }
}
