package creationalpatterns.abstractfactory.factories;

import creationalpatterns.abstractfactory.aircrafts.Airplane;
import creationalpatterns.abstractfactory.aircrafts.IAircraft;
import creationalpatterns.abstractfactory.landvehicles.Car;
import creationalpatterns.abstractfactory.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory {

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
