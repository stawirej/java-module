module module.earth {
    requires module.api;
    provides planet.api.Planet with planet.earth.Earth;
}