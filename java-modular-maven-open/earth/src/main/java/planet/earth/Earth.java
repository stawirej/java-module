package planet.earth;

import planet.api.Planet;
import planet.core.EarthCore;

public final class Earth implements Planet {

    private final EarthCore earthCore = new EarthCore();
    private final Oceans oceans = new Oceans();

    public String name() {
        return "Earth";
    }

    public String core() {
        return String.format("Planet calls: %s", earthCore.core());
    }

    public String oceans() {
        return String.format("Planet calls: %s", oceans.oceans());
    }
}
