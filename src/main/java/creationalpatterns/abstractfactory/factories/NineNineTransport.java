package creationalpatterns.abstractfactory.factories;

import creationalpatterns.abstractfactory.aircrafts.Airplane;
import creationalpatterns.abstractfactory.aircrafts.IAircraft;
import creationalpatterns.abstractfactory.landvehicles.ILandVehicle;
import creationalpatterns.abstractfactory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
