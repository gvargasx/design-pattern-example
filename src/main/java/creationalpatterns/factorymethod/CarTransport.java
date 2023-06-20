package creationalpatterns.factorymethod;

import creationalpatterns.factorymethod.vehicles.Car;
import creationalpatterns.factorymethod.vehicles.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
