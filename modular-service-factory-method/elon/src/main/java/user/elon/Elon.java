package user.elon;

import planet.api.Planet;

final class Elon {

    public static void main(String[] args) {

        var planets = Planet.planets();

        planets.forEach(planet -> System.out.println("Greetings from " + planet.name()));
    }
}
