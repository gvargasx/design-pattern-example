package creationalpatterns.abstractfactory.app;

import creationalpatterns.abstractfactory.aircrafts.IAircraft;
import creationalpatterns.abstractfactory.factories.ITransportFactory;
import creationalpatterns.abstractfactory.landvehicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;

    public Application(ITransportFactory factory) {
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
    }

    public void startRoute() {
        vehicle.startRoute();
        aircraft.startRoute();
    }
}
