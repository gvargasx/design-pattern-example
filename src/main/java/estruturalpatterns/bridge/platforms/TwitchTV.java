package estruturalpatterns.bridge.platforms;

public class TwitchTV implements IPlatform {

    public TwitchTV() {
        configureRMTP();
        System.out.println("TwitchTV iniciando");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("teste");
    }

    @Override
    public void authToken() {
        System.out.println("teste");
    }
}
