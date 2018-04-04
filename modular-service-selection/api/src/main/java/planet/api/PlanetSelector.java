package planet.api;

import java.util.List;
import java.util.ServiceLoader;
import java.util.ServiceLoader.Provider;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

public final class PlanetSelector {

    public static Iterable<Planet> planets() {
        return ServiceLoader.load(Planet.class);
    }

    public static List<Planet> localPlanets() {
        return ServiceLoader.load(Planet.class)
                .stream()
                .filter(isLocalPlanet())
                .map(Provider::get)
                .collect(toList());
    }

    private static Predicate<Provider<Planet>> isLocalPlanet() {
        return planetProvider -> planetProvider.type().isAnnotationPresent(Local.class)
                && planetProvider.type().getAnnotation(Local.class).value();
    }
}
