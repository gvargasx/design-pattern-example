package estruturalpatterns.bridge.platforms;

public class Youtube implements IPlatform {

    public Youtube() {
        configureRMTP();
        System.out.println("Youtube iniciando");
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
