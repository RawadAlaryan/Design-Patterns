package behavioralDesignPatterns.interpreterDesignPattern.projectLogicExpressionInterpreterSystem.TerminalExpression;

import behavioralDesignPatterns.interpreterDesignPattern.projectLogicExpressionInterpreterSystem.AbstractExpression.Expression;
import behavioralDesignPatterns.interpreterDesignPattern.projectLogicExpressionInterpreterSystem.Context.Context;

public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) { this.data = data; }

    @Override
    public boolean interpret(Context context) {
        return context.getResult(data);
    }
}
