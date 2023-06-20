package creationalpatterns.abstractfactory.factories;

import creationalpatterns.abstractfactory.aircrafts.IAircraft;
import creationalpatterns.abstractfactory.landvehicles.ILandVehicle;

public interface ITransportFactory {

    ILandVehicle createTransportVehicle();

    IAircraft createTransportAircraft();


}
