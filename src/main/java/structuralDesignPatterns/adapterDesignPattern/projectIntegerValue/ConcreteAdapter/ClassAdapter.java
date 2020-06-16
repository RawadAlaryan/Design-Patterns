package structuralDesignPatterns.adapterDesignPattern.projectIntegerValue.ConcreteAdapter;

import structuralDesignPatterns.adapterDesignPattern.projectIntegerValue.Adaptee.IntegerValue;

public class ClassAdapter extends IntegerValue {
    @Override
    public int getInteger() { return 2 + super.getInteger(); }
}
