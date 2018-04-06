package user.elon;

import planet.earth.Earth;

import java.lang.reflect.Method;

final class Elon {

    public static void main(String[] args) {

        try {
            var earth = new Earth();

            System.out.println(earth.name());
            System.out.println(earth.core());

            String earthCoreResult = deepReflectionCall();

            System.out.println("Deepreflection call: " + earthCoreResult);

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static String deepReflectionCall() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName("planet.core.EarthCore");
        Method core = clazz.getDeclaredMethod("core");

        Object earthCore = ClassLoader.getSystemClassLoader().loadClass("planet.core.EarthCore").getDeclaredConstructor().newInstance();

        ClassLoader.getSystemClassLoader().loadClass("planet.core.EarthCore");
        return (String) core.invoke(earthCore);
    }
}
