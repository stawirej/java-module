module planet.mars {
    requires planet.api;
    provides planet.api.Planet with planet.mars.Mars;
}