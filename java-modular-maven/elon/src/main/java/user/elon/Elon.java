package user.elon;

import planet.earth.Earth;
import planet.mars.Mars;

import java.util.List;

final class Elon {

    public static void main(String[] args) {

        var planets = List.of(new Earth(), new Mars());

        planets.forEach(planet -> System.out.println("Greetings from " + planet.name()));

    }
}
