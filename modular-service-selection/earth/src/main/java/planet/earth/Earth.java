package planet.earth;

import planet.api.Local;
import planet.api.Planet;

@Local
public final class Earth implements Planet {

    public String name() {
        return "Earth";
    }
}
