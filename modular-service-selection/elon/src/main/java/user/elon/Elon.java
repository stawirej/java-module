package user.elon;

import planet.api.PlanetSelector;

final class Elon {

    public static void main(String[] args) {

        System.out.println("Greeetings from ALL planets:");
        var planets = PlanetSelector.planets();
        planets.forEach(planet -> System.out.println("Greetings from " + planet.name()));

        System.out.println("Greeetings from LOCAL planets:");
        var localPlanets = PlanetSelector.localPlanets();
        localPlanets.forEach(planet -> System.out.println("Greetings from " + planet.name()));
    }
}
