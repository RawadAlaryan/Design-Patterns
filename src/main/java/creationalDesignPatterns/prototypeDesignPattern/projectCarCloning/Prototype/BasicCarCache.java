package creationalDesignPatterns.prototypeDesignPattern.projectCarCloning.Prototype;

import java.util.Hashtable;

public class BasicCarCache {
    private static Hashtable<String, BasicCar> basicCarMap = new Hashtable<String, BasicCar>();

    public static BasicCar getCar(String carName) {
        BasicCar cachedBasicCar = basicCarMap.get(carName);
        return (BasicCar) cachedBasicCar.clone();
    }

    public static void loadCache() {
        BasicCar honda = new Honda("Honda");
        honda.price=100000;
        basicCarMap.put("Honda", honda);

        BasicCar ford = new Ford("Ford");
        ford.price=500000;
        basicCarMap.put("Ford", ford);
    }
}
