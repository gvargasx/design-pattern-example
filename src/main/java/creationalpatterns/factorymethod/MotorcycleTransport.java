package creationalpatterns.factorymethod;

import creationalpatterns.factorymethod.vehicles.IVehicle;
import creationalpatterns.factorymethod.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
