module planet.earth {
    requires planet.api;
    provides planet.api.Planet with planet.earth.Earth;
}