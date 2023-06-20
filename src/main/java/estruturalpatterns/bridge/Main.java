package estruturalpatterns.bridge;

import estruturalpatterns.bridge.platforms.IPlatform;
import estruturalpatterns.bridge.platforms.TwitchTV;
import estruturalpatterns.bridge.platforms.Youtube;
import estruturalpatterns.bridge.transmissions.Live;

public class Main {

    public static void main(String[] args) {
        startLive(new Youtube());
        startLive(new TwitchTV());
    }

    public static void startLive(IPlatform platform) {
        System.out.println("Iniciando transmissão");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();
    }
}
