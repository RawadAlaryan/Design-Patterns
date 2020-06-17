package behavioralDesignPatterns.interpreterDesignPattern.projectLogicExpressionInterpreterSystem.AbstractExpression;

import behavioralDesignPatterns.interpreterDesignPattern.projectLogicExpressionInterpreterSystem.Context.Context;

public interface Expression {
    public boolean interpret(Context context);
}
