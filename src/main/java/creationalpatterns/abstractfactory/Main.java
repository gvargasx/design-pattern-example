package creationalpatterns.abstractfactory;

import creationalpatterns.abstractfactory.app.Application;
import creationalpatterns.abstractfactory.factories.ITransportFactory;
import creationalpatterns.abstractfactory.factories.NineNineTransport;
import creationalpatterns.abstractfactory.factories.UberTransport;

public class Main {

    public static Application configureApplication() {
        Application application;
        ITransportFactory factory;

        String company = "uber";

        if (company.equals("uber")) {
            factory = new UberTransport();
        } else {
            factory = new NineNineTransport();
        }
        return new Application(factory);
    }

    public static void main(String[] args) {
        Application application = configureApplication();
        application.startRoute();
    }

}
