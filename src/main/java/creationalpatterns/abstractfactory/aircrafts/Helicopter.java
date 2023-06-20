package creationalpatterns.abstractfactory.aircrafts;

public class Helicopter implements IHelicopter {

    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando");
    }

    @Override
    public void getCargo() {
        System.out.println("OK");
    }

    @Override
    public void wind() {
        System.out.println("vento ok");
    }
}
