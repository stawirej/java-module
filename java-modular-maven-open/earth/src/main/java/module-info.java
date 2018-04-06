//open module planet.earth {
module planet.earth {
    requires transitive planet.api;
    exports planet.earth;
    opens planet.core;
//    opens planet.core to user.elon;
//    opens planet.core to planet.mars;
}