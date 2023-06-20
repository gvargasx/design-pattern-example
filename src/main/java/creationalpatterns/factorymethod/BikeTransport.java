package creationalpatterns.factorymethod;

import creationalpatterns.factorymethod.vehicles.Bike;
import creationalpatterns.factorymethod.vehicles.IVehicle;

public class BikeTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
