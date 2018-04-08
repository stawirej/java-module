//open module module.earth { // open whole module for reflection
module module.earth {
    requires transitive module.api;
    exports planet.earth;
    opens planet.earth;
    opens planet.core;
//    opens planet.core to module.elon; // opens package to specific module
//    opens planet.core to module.mars;
}