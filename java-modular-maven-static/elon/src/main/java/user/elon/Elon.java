package user.elon;

import planet.earth.Earth;
import planet.mars.Mars;
import planet.pluto.Pluto;

import java.util.List;

final class Elon {

    public static void main(String[] args) {

        var planets = List.of(new Earth(), new Mars(), new Pluto());

        planets.forEach(planet -> System.out.println("Greetings from " + planet.name()));

    }
}
