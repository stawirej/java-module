module module.mars {
    requires module.api;
    provides planet.api.Planet with planet.mars.Mars;
}