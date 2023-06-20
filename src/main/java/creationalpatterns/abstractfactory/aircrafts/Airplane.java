package creationalpatterns.abstractfactory.aircrafts;

public class Airplane implements IAircraft {

    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Autorizado vooo");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 25km, OK");
    }
}
