package estruturalpatterns.bridge.platforms;

public class Facebook implements IPlatform {

    public Facebook() {
        configureRMTP();
        System.out.println("Facebook iniciando");
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
