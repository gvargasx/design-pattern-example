package creationalpatterns.builder.builders;

import creationalpatterns.builder.cars.CarType;
import creationalpatterns.builder.components.Engine;
import creationalpatterns.builder.components.GPSNavigator;
import creationalpatterns.builder.components.Transmission;
import creationalpatterns.builder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
