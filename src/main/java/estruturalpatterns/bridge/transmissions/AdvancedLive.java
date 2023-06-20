package estruturalpatterns.bridge.transmissions;

import estruturalpatterns.bridge.platforms.IPlatform;

public class AdvancedLive extends Live {

    public AdvancedLive(IPlatform platform) {
        super.platform = platform;
    }

    public void subtitles() {

    }

    public void comments() {

    }

}
