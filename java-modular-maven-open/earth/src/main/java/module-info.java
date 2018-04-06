//open module planet.earth { // open whole module for reflection
module planet.earth {
    requires transitive planet.api;
    exports planet.earth;
    opens planet.earth;
    opens planet.core;
//    opens planet.core to user.elon; // opens package to specific module
//    opens planet.core to planet.mars;
}