package creationalpatterns.factorymethod.vehicles;

public class Car implements IVehicle {

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando rota");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos os passageiros");
    }
}
