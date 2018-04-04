package user.elon;

import planet.api.Planet;

import java.util.ServiceLoader;

final class Elon {

    public static void main(String[] args) {

        var planets = ServiceLoader.load(Planet.class);

        planets.forEach(planet -> System.out.println("Greetings from " + planet.name()));
    }
}
