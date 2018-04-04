package planet.api;

import java.util.ServiceLoader;

public interface Planet {

    static Iterable<Planet> planets() {
        return ServiceLoader.load(Planet.class);
    }

    String name();
}
