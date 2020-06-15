package creationalDesignPatterns.prototypeDesignPattern.projectCarCloning.Prototype;

public class Honda extends BasicCar implements Cloneable {
    public Honda(String m) { modelName = m; }

    @Override
    public Honda clone() {
    	Honda clone = null;
        clone = (Honda) super.clone();
        return clone;
    }
}
