package user.elon;

import planet.earth.Earth;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

final class Elon {

    public static void main(String[] args) {

        try {
            var earth = new Earth();

            System.out.println(earth.name());
            System.out.println(earth.core());
            System.out.println(earth.oceans());

            String oceansFromReflection = deepReflectionOceansCall();
            String coreFromReflection = deepReflectionCoreCall();

            System.out.println("Deepreflection call: " + coreFromReflection);
            System.out.println("Deepreflection call: " + oceansFromReflection);

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    /**
     * Deepreflection on package private class in exported package
     */
    private static String deepReflectionOceansCall() {
        try {
            Class<?> clazz = Class.forName("planet.earth.Oceans");
            Method oceans = clazz.getDeclaredMethod("oceans");
            oceans.setAccessible(true);

            Constructor<?> declaredConstructor = ClassLoader.getSystemClassLoader()
                    .loadClass("planet.earth.Oceans")
                    .getDeclaredConstructor();

            declaredConstructor.setAccessible(true);
            Object oceansInstance = declaredConstructor.newInstance();

            ClassLoader.getSystemClassLoader().loadClass("planet.earth.Oceans");
            return (String) oceans.invoke(oceansInstance);
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    /**
     * Deepreflection on public class in non-exported package
     */
    private static String deepReflectionCoreCall() {
        try {
            Class<?> clazz = Class.forName("planet.core.EarthCore");
            Method core = clazz.getDeclaredMethod("core");

            Object earthCoreInstance = ClassLoader.getSystemClassLoader()
                    .loadClass("planet.core.EarthCore")
                    .getDeclaredConstructor()
                    .newInstance();

            ClassLoader.getSystemClassLoader().loadClass("planet.core.EarthCore");
            return (String) core.invoke(earthCoreInstance);
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}
