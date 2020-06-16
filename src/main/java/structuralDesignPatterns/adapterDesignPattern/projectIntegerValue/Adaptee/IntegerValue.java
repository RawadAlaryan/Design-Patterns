package structuralDesignPatterns.adapterDesignPattern.projectIntegerValue.Adaptee;

public class IntegerValue implements IntegerValueInterface {
    @Override
    public int getInteger() { return 5; }
}
