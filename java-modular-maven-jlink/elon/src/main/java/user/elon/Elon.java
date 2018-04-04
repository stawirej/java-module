package user.elon;

import planet.api.Planet;
import planet.earth.Earth;
import planet.mars.Mars;

import java.util.List;

public final class Elon {

    public static void main(String[] args) {

        List<Planet> planets = List.of(new Earth(), new Mars());
        planets.forEach(planet -> System.out.println("Greetings from " + planet.name()));

    }
}
